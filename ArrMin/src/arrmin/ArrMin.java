/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrmin;

/**
 *
 * @author sayeem
 */
public class ArrMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
                int[][] arr = {{0},{1,2},{3,4,5},{6,7,8,9}};
//                int [][]arr = new int[4][];
//                arr[0] = new int[1];
//                arr[1] = new int[2];
//                arr[2] = new int[3];
//                arr[3] = new int[4];
//        
//        
//		arr[0] = {0};
//		arr[1] = {1,2};
//		arr[2] = {3,4,5};
//		arr[3] = {6,7,8,9};
 
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(arr[i][j]+" ");
			}System.out.println("");
		}
    }
    
}
