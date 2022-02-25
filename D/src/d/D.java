/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d;


import java.util.*;
import java.lang.*;
import java.io.*;

class D
{
	public static void main(String args[]){
	Player p1=new Player(7, 9.2);
	Player p2=new Player(9, 8.5);
	Player p3=new Player(10, 9.0);
	ArrayList<Player> list=new ArrayList<>();
	list.add(p1);
	list.add(p2);
	list.add(1,p3);
	list.add(2,new Player(5, 6.7));
	list.set(3, p3);
	for(int i=0; i < list.size(); i++){
		System.out.println(list.get(i).jerseyNo +" rating "+ list.get(i).rating);
	}
	Collections.sort(list);
 }
}
class Player{
    int jerseyNo;
    double rating;
    public Player(int number, double rating){
    jerseyNo=number;
    this.rating=rating;
    }
    public static Collections.sort(list , new Comparator<Player>(){
           @Override
           public int Compare(Player a, Player b){
           return (int) (a.rating-b.rating);
    }});
}

    
    
    

