package xmas;

public class PtMember extends MemberInfo
{
    static int qualify=1;
    int PTstartdate;
    int PTenddate;

    PtMember(String name, int age, double mass, int PTstartdate, int PTenddate)
    {
        super();
        this.name=name;
        this.age=age;
        this.mass=mass;
        this.PTstartdate=PTstartdate;
        this.PTenddate=PTenddate;
    }

    void printPTMember()
    {
        System.out.print("\n");
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("mass: "+mass);
        System.out.println("PT start: "+PTstartdate);
        System.out.println("PT finish: "+PTenddate);
        System.out.print("\n");
    }
}