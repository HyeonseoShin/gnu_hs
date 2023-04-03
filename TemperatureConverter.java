import java.util.Scanner;

public class TemperatureConverter       // Declaring public class as name of the TemperatureConverter
{
    public static void main(String[] degree)      // Executing the main function of degree array space without return value
    {
        System.out.print("Enter the fahrenheit temperature: ");     // To print a message to enter a fahrenheit temperature
        Scanner source;     // Creating an object be called source
        source=new Scanner(System.in);      // fahrenheit temperature is entered a message that user enter the temperature
        float fahrenheit;       // Creating a variable 'fahrenheit' in form float
        fahrenheit=source.nextFloat();       // To Enter and return the variable 'source' in the variable 'fahrenheit'

        float celsius;      // Creating a variable 'celsius' in Float form
        celsius=(float)(5.0/9.0*(fahrenheit-32.0));      // Converting the fahrenheit temperature to celsius temperature

        System.out.print("Celsius Temperature is ");        // Printing a message informing that the converted celsius output
        System.out.print(celsius);        // Printing the variable 'celsius'
        System.out.println("°C");       // Printing unit of the variable
    }
}