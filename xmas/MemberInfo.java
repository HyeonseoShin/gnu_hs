package xmas;

import java.util.Scanner;

// Class for member information
public class MemberInfo extends CommonMember
{
    protected String name;    // Declaring variable space to store names
    protected int age;        // Declaring variable space to store age
    protected double weight;    // Declaring variable space to store weight

    Scanner input = new Scanner(System.in);     // 스캐너 불러오기

    MemberInfo(String name, int age, double weight)
    {
        // 변수가 필드 변수임을 선언하기
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public double getWeight()
    {
        return this.weight;
    }

    // 저장된 정보를 출력하는 함수 선언하기
    public void printInfo()
    {
        System.out.print("\n");
        System.out.println("name: "+name);          // 이름
        System.out.println("age: "+age);            // 나이
        System.out.println("weight: "+weight);      // 몸무게
        System.out.print("\n");
    }

    // 빈 정보를 채울 기본값 설정하기
    public void initInfo()
    {
        this.name = null;       // 이름
        this.age = -1;          // 나이
        this.weight = -1;       // 몸무게
    }
}