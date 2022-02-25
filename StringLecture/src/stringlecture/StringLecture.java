
package stringlecture;

/**
 *
 * @author sayeem
 */
public class StringLecture {

   
    public static void main(String[] args) {
        String a = "Hello!";
        String b = "World";
        System.out.println(a.length());//gives the length of the string
        
        System.out.println(a.toLowerCase()); //converts the string to lowercase
        System.out.println(a.toUpperCase()); //converts the string to uppercase
        System.out.println(a.concat(b)); //add two strings
        char c = 'w';
        System.out.println("I won\'t do it"); // for writing quotes \' \"
        System.out.println("This class is so \"good\"!"); // for writing quotes \' \"
        System.out.println(a.charAt(1)); //prints specific index character
        System.out.println(a.indexOf('o')); //prints the index of specific character
        //                   For Hello
        // He                                             llo
        // 2 length prefix                                3 length suffix 
        System.out.println(a.contains("ell")); //In Hello string, does ell exists? ans: true
        System.out.println(a.startsWith("He")); //checks if our string starts with the specified string
        System.out.println(a.endsWith("llo!")); //checks if our string ends with the specified string
        
        if(a.equals(b))System.out.println("Equal"); //checks if a & b are equal
        else System.out.println("Not Equal");
        if(a.equalsIgnoreCase(b))System.out.println("Equal"); //checks if a & b are equal but not case sensitive
        else System.out.println("Not Equal");
        
        String d = a.replace("ll", "mm");
        System.out.println(d); //replaces to mm with ll
        System.out.println(d.isEmpty()); //returns true if the string is empty
        
        String e = "  Helllo  ";
        System.out.println(e.trim()); //removes the white spaces only from the start & end side
        
        String f = "   ";
        System.out.println(f.trim().isEmpty()); //we can use multiple fuction like this
                                               // it trims the white spaces thus returns true
                                               
        String g = "Sayeem 4.00 011211088"; //structure - name cgpa id
        String h[] = g.split(" ");  //splits a string when it detects a space
        for(int i =0; i<h.length ; i++){
            System.out.println(h[i]);
        }
    }
    
}
