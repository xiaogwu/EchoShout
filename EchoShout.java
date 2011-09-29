/* Xiao G. Wu
 * CS111A - Inclass excersise on user input
 * 09/26/2010
 */

import java.util.Scanner;

public class EchoShout
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;
        boolean checkArg = false;
        String checkString = "";
        
        if (args.length > 0) 
        {
            checkArg = true;
            checkString = args[0];
        }
        
        do 
        {
            System.out.print("Enter some input or leave blank to exit: ");
            String userInput = keyboard.nextLine();

            if (userInput.length() > 0) 
            {
                if (checkArg) 
                {
                    if (userInput.equals(checkString))
                        System.out.println("Input matches original argument!");
                }
                System.out.println(userInput.toUpperCase());
            }
            else 
            {
                keepGoing = false;    
                System.out.println("Done.");
            }
        } while (keepGoing);
    }
}
