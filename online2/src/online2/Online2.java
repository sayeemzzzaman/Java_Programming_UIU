/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package online2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Jannat
 */
public class Online2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        File scoresFile = new File("scores.txt");
        File out = new File("Output.txt");
        if(!out.exists()){
            out.createNewFile();
        }
        FileWriter fw = new FileWriter(out);
        BufferedWriter bw = new BufferedWriter(fw);
                
        double min = 99999999;
        String bonusName="";
        
        Scanner fsc = new Scanner(scoresFile);
        
        while(fsc.hasNextLine()){
            String line = fsc.nextLine();
            if(!line.equals("")){
                String arr[] = line.split(" "); //spliting names and marks
                String name = arr[0];
                String marks[] = arr[1].split(","); //spliting marks
                int size = marks.length;
                double dbMark[] = new double[size] ;
                
                for(int i=0; i< marks.length ; i++){ //converting string into ddouble
                    double str = Double.parseDouble(marks[i]);
                    dbMark[i] = str;
                }
                
                double sum=0;
                for(int i=0; i< dbMark.length ; i++){ //sum of all marks
                    sum+=dbMark[i];
                }
                double average = sum/dbMark.length;
                if(average < min){min = average;bonusName = name;}
                //System.out.println("average: " + average + "\n");
                               
                String toWrite = name + " " + average + "\n";
                bw.write(toWrite);
                
            }
           
        }bw.close();
        System.out.println("Name: " + bonusName + " Min Average: " + min);
    }
    
}
