package xmas;

public class PtMember extends MemberInfo
{
    static int qualify=1;
    int PTstartdate;
    int PTenddate;

    int getPTstartdate()
    {
        return PTstartdate;
    }
    int getPTenddate()
    {
        return PTenddate;
    }

    // Inputting the information of a PT Member
    PtMember(String name, int age, double mass, int PTstartdate, int PTenddate)
    {
        this.name=name;     // Name
        this.age=age;       // Age
        this.mass=mass;     // Weight
        this.PTstartdate=PTstartdate;       // PT first day
        this.PTenddate=PTenddate;           // PT Last day
    }

    // Printing the informaion of a PT Member
    public void printInfo()
    {
        System.out.println("name: " + name);    // Name
        System.out.println("age: " + age);      // Age
        System.out.println("mass: " + mass);    // Weight
        System.out.println("PT start: " + PTstartdate);// PT First day
        System.out.println("PT finish: " + PTenddate); // PT Last day
        System.out.print("\n");
    }

    // Printing the informaion of a PT Member
    void printInfo(String onlystartdate)
    {
        System.out.println("name: " + name);    // Name
        System.out.println("age: " + age);      // Age
        System.out.println("mass: " + mass);    // Weight
        System.out.println("PT start: " + PTstartdate);// PT First day
    }
}