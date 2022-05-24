package student;
import java.util.Scanner;

/**
 *This class +++Insert Description Here+++
 *
 * @author Eric Mogielnicki
 */
public class Student 
{   


    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s", "Please enter your name:");
        String name = input.nextLine();
        
        char[] myLetters = new char[name.length()];
        
        for (int i=0; i <= name.length() - 1; i++)
        {
            myLetters[i] = name.charAt(i);
        }
        
        for (int i=0; i < myLetters.length;i++)
        {
            System.out.println(myLetters[i]);
        }
        
      // this is a comment for testing pull. also you suck <3  

    }
    

}
