package xmas;

public class FreeMember extends MemberInfo
{
    static int qualify = 0;

    int firstuse;
    int lastuse;
    int term;

    FreeMember(String name, int age, int firstuse, int term)
    {
        this.name = name;
        this.age = age;
        this.firstuse = firstuse;
        this.term = term;
    }

    void printFreeMember()
    {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("start date: " + firstuse);
        System.out.println("available: " + term);
        System.out.print("\n");
    }
}
