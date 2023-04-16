package xmas;

import java.util.Scanner;

// Class for member information
public class MemberInfo
{
    String name;    // Declaring variable space to store names
    int age;        // Declaring variable space to store age
    double mass;    // Declaring variable space to store weight
    Scanner input = new Scanner(System.in);     // Calling the Scanner method

    MemberInfo()
    {
        // Declaring variables as a field variable
        this.name = name;
        this.age = age;
        this.mass = mass;
    }

    // Declaring the function that receives information
    void setInfo()
    {
        // Receiving name input
        System.out.println("name: ");
        this.name = input.next();

        // Receiving age input
        System.out.println("age: ");
        this.age = input.nextInt();

        // Receiving weight input
        System.out.println("Weight: ");
        this.mass = input.nextDouble();
    }

    // Declaring a function that outputs stored information
    void printInfo()
    {
        System.out.print("\n");
        System.out.println("name: "+name);          // name
        System.out.println("age: "+age);            // age
        System.out.println("mass: "+mass);          // weight
        System.out.print("\n");
    }

    // Setting default values to fill in empty information
    void initInfo()
    {
        this.name = null;       // name
        this.age = -1;          // age
        this.mass = -1;         // weight
    }
}