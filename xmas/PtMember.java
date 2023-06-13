package xmas;

public class PtMember extends MemberInfo
{
    int PTstartdate;
    int PTenddate;
    int id;

    int getId()
    {
        return id;
    }
    int getPTstartdate()
    {
        return PTstartdate;
    }
    int getPTenddate()
    {
        return PTenddate;
    }

    PtMember() {

    }

    // Inputting the information of a PT Member
    PtMember(int id, String name, int age, double mass, int PTstartdate, int PTenddate)
    {
        this.id=id;         // id
        this.name=name;     // Name
        this.age=age;       // Age
        this.weight=weight; // Weight
        this.PTstartdate=PTstartdate;       // PT first day
        this.PTenddate=PTenddate;           // PT Last day
    }

    // Printing the informaion of a PT Member
    public void printInfo()
    {
        System.out.println("name: " + name);    // Name
        System.out.println("age: " + age);      // Age
        System.out.println("weight: " + weight);// Weight
        System.out.println("PT start: " + PTstartdate);// PT First day
        System.out.println("PT finish: " + PTenddate); // PT Last day
        System.out.print("\n");
    }

    // Printing the informaion of a PT Member
    void printInfo(String onlystartdate)
    {
        System.out.println("name: " + name);    // Name
        System.out.println("age: " + age);      // Age
        System.out.println("weight: " + weight);// Weight
        System.out.println("PT start: " + PTstartdate);// PT First day
        System.out.println("PT finish: "+PTenddate);    // PT Last day
        System.out.print("\n");
    }
}