
package arraylistlecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author sayeem
 */
public class ArrayListLecture {

    
    public static void main(String[] args) {
        
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();  // <Integer> <String>   <= These are called angle bracket
        myArrayList.add(10);
        myArrayList.add(2);
        myArrayList.add(7);
        myArrayList.add(-6);
        
        System.out.println("Array size: " + myArrayList.size());
        for(int i=0 ; i<myArrayList.size() ; i++){
            System.out.println(myArrayList.get(i)); //myArrayList[i] == myArrayList.get(i)  
        }
        
         Collections.sort(myArrayList);
         System.out.println("After Sorting");
        for(int i=0 ; i<myArrayList.size() ; i++){
            System.out.println(myArrayList.get(i)); //Sorted Array
        }
        
        Collections.reverse(myArrayList);
        System.out.println("After Reversing");
        for(int i=0 ; i<myArrayList.size() ; i++){
            System.out.println(myArrayList.get(i)); //Sorted Array
        }
        
        ArrayList<String> myStrList = new ArrayList<String>();
        myStrList.add("Hello");
        myStrList.add("World");
        myStrList.add("JAVA!");
        
        for(int i=0 ; i<myStrList.size() ; i++){
            System.out.println(myStrList.get(i));
        }
        
        Collections.sort(myStrList); //sorting the Array Alphabetical Order
        Collections.reverse(myStrList); //reversing the Array
        System.out.println("After Reverse......");
        for(int i=0 ; i<myStrList.size() ; i++){
            System.out.println(myStrList.get(i));
        }
        
        System.out.println("After Replacing......");
        myStrList.set(1, "Python");  //replaces with index 1
        for(int i=0 ; i<myStrList.size() ; i++){
            System.out.println(myStrList.get(i));
        }
        
        System.out.println("After Removing.....");
        myStrList.remove(1);    //removes index No 1
        for(int i=0 ; i<myStrList.size() ; i++){
            System.out.println(myStrList.get(i));
        }
        System.out.println(".......................................");
        
        ArrayList<Person> myList = new ArrayList<Person>();
        Person a = new Person("Sayeem", 4.00);
        myList.add(a);
        myList.add(new Person("Harry",3.00));
        myList.add(new Person("Hermione",2.00));
        myList.add(new Person("Ron",1.00));
        myList.add(new Person("Snape",1.59));
        for(int i=0 ; i<myList.size() ; i++){
            System.out.println(myList.get(i).name); //printing every objects name & cgpa
            System.out.println(myList.get(i).cgpa);
        }
        System.out.println("After sorting by CGPA.......");
        
//        Collections.sort(myList, new MyComparator()); //Big Method
//        for(int i=0 ; i<myList.size() ; i++){
//            System.out.println(myList.get(i).name); //printing every objects name & cgpa
//            System.out.println(myList.get(i).cgpa);
//        }
        
        Collections.sort(myList, new Comparator<Person>(){
            @Override
            public int compare(Person a, Person b) {
                return (int) (a.cgpa-b.cgpa);
            }
        }
        ); //Short Method
        for(int i=0 ; i<myList.size() ; i++){
            System.out.print(myList.get(i).name + " "); //printing every objects name & cgpa
            System.out.println(myList.get(i).cgpa);
        }
        
//        Collections.sort(myList, (Person a1, Person b) -> (int) (a1.cgpa - b.cgpa)); //Shortest Method
//        for(int i=0 ; i<myList.size() ; i++){
//            System.out.print(myList.get(i).name + " "); //printing every objects name & cgpa
//            System.out.println(myList.get(i).cgpa);
//        }
        System.out.println("=======================================================");
        Collections.sort(myList, (Person o1, Person o2) -> (int) (o2.cgpa - o1.cgpa)); //descending order = hight to low
        for(int i=0 ; i<myList.size() ; i++){
            System.out.print(myList.get(i).name + " "); //printing every objects name & cgpa
            System.out.println(myList.get(i).cgpa);
        }
        System.out.println("=======================================================");
        Collections.sort(myList, (Person o1, Person o2) -> (int) (o1.name.compareTo(o2.name))); //sorting using names
        for(int i=0 ; i<myList.size() ; i++){
            System.out.print(myList.get(i).name + " "); //printing every objects name & cgpa
            System.out.println(myList.get(i).cgpa);
        }
     
    }
    
}
