package xmas;

import java.util.Scanner;

// Class for member information
public class MemberInfo extends CommonMember
{
    protected String name;    // Declaring variable space to store names
    protected int age;        // Declaring variable space to store age
    protected double mass;    // Declaring variable space to store weight

    Scanner input = new Scanner(System.in);     // 스캐너 불러오기

    MemberInfo(String name, int age, double mass)
    {
        // 변수가 필드 변수임을 선언하기
        this.name = name;
        this.age = age;
        this.mass = mass;
    }

    MemberInfo(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    MemberInfo()
    {

    }

    public int getAge()
    {
        return this.age;
    }

    public String getName()
    {
        return this.name;
    }

    public double getMass()
    {
        return this.mass;
    }


    // 정보를 입력받는 함수 선언하기
    public void setInfo()
    {
        // 이름 입력받기
        System.out.println("name: ");
        this.name = input.next();

        // 나이 입력받기
        System.out.println("age: ");
        this.age = input.nextInt();

        // 몸무게 입력받기
        System.out.println("mass: ");
        this.mass = input.nextDouble();
    }

    // 저장된 정보를 출력하는 함수 선언하기
    public void printInfo()
    {
        System.out.print("\n");
        System.out.println("name: "+name);          // 이름
        System.out.println("age: "+age);            // 나이
        System.out.println("mass: "+mass);          // 몸무게
        System.out.print("\n");
    }

    // 빈 정보를 채울 기본값 설정하기
    public void initInfo()
    {
        this.name = null;       // 이름
        this.age = -1;          // 나이
        this.mass = -1;         // 몸무게
    }
}