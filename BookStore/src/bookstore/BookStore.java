/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;


import java.util.Scanner;
/**
 *
 * @author sayeem
 */
public class BookStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Book a = new Book("HP", 129.38);
//        System.out.println(a.getName()+ " " +a.getPrice());
//        a.setName("Harry Potter");
//        a.setPrice(999.99);
//        System.out.println(a.getName() + " " + a.getPrice());

          Book listOfBooks[] = new Book[10];
          int numberOfBooks = 0;
          
          Scanner sc = new Scanner(System.in);
          
          while(true)
          {
              //to add book, input "add"
            //to quit program, input "q"
            //to print all books, input "print"
              System.out.println("Input your choice: ");
              String choice = sc.next();
              
              if(choice.equals("add"))
              {
                  Book newBook = inputBook();
                  listOfBooks[numberOfBooks++] = newBook;
              }
              else if(choice.equals("print"))
              {
                  System.out.println("BookNames      Prices");
                  for(int i=0;i<numberOfBooks;i++)
                  {
                      Book pr = listOfBooks[i];
                      System.out.println(pr.getName()+ " " + pr.getPrice());
                  }
              }
              else if(choice.equals("q"))break;
          }
          
    }
    
    public static Book inputBook()
          {
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter Book Name: ");
              String bookName = sc.nextLine();
              //char c = sc.next().charAt(0)
              //String bookName="";
              //bookName+= sc.nextLine();
              //String bookName = name;
              System.out.println("Enter Book Price: ");
              double bookPrice = sc.nextDouble();
              Book newBook = new Book(bookName, bookPrice);
              return newBook;
          }
    
}
