package xmas;

public class FreeMember extends MemberInfo
{
    static int qualify = 0;

    int firstuse;
    int term;
    int id;

    int getId()
    {
        return id;
    }

    int getFirstuse()
    {
        return firstuse;
    }

    int getTerm()
    {
        return term;
    }

    FreeMember()
    {

    }

    // Inputting the information of a member used free
    FreeMember(int id, String name, int age, int firstuse, int term)
    {
        this.id = id;
        this.name = name;       // Name
        this.age = age;         // Age
        this.firstuse = firstuse;   // Joined day
        this.term = term;       // Peroid
    }

    // Printing the information of a member used free
    public void printInfo()
    {
        System.out.println("name: " + name);    // Name
        System.out.println("age: " + age);      // Age
        System.out.println("start date: " + firstuse);// Joined day
        System.out.println("available: " + term);// Period
        System.out.print("\n");
    }
}