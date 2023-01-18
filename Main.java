
import java.util.Scanner;


public class Main {
    //main method in java
    public static void main(String[] args){
        int yob;
            Scanner input=new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name =input.next();
         
            System.out.print("Enter your age: ");
            int age=input.nextInt();

            yob=2023-age;
                    
        //Print Output
     
System.out.println(name+" is "+ age + " years old");
System.out.println(name+" was born in "+yob);

    }}

