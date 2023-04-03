import java.util.Scanner;       // Bring up the Scanner class

public class EchoProgram        // Declaring public class as the name of the EchoProgram
{
    public static void main(String[] args)      // Executing the main function of args array into space without return value
    {
        System.out.print("Sound: ");        // To print a message that user receives a sound input
        Scanner sound;      // Creating an object of sound
        sound=new Scanner(System.in);       // Be entered 'sound'

        String echo;        // Create variable 'echo' in String form
        echo=sound.nextLine();      // To enter and return the variable 'sound' in the variable 'echo'

        System.out.print("Echo: ");     // Printing a message apprizing that 'echo' will be output
        System.out.println(echo);       // Printing a veriable 'echo'
    }
}