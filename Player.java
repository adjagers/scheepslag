import java.util.Scanner;

public class Player {
  // state or field
   String name = "John Doe";

  // behavior or method
  public void login() {
    Scanner myObj = new Scanner(System.in);


    String userInput;
  
    System.out.println("Instructions Firing a shot is for example a1 or b4 or e5");

    
    
    // Enter username and press Enter
    System.out.print("Enter username: "); 
    name = myObj.nextLine(); 
       
    System.out.println("Username is: " + name);


  }  
}
