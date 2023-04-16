package xmas;

import java.util.Scanner;

// Class for member information
public class MemberInfo
{
    String name;    // Declaring variable space to store names
    int age;        // Declaring variable space to store age
    double mass;    // Declaring variable space to store weight
    int PTdate1;    // Declaring variable space to store PT first day
    int PTdate2;    // Declaring variable space to store last day of PT

    Scanner input = new Scanner(System.in);     // 스캐너 불러오기

    MemberInfo(String name, int age, double mass, int PTdate1, int PTdate2)
    {
        // 변수가 필드 변수임을 선언하기
        this.name = name;
        this.age = age;
        this.mass = mass;
        this.PTdate1 = PTdate1;
        this.PTdate2 = PTdate2;
    }

    MemberInfo()
    {

    }

    // 정보를 입력받는 함수 선언하기
    void setInfo()
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

        // 첫 PT 날짜 입력받기
        System.out.println("PT start date (ex. yyyymmdd): ");
        this.PTdate1 = input.nextInt();

        // 마지막 PT 날짜 입력받기
        System.out.println("PT finish date (ex. yyyymmdd): ");
        this.PTdate2 = input.nextInt();
    }

    // 저장된 정보를 출력하는 함수 선언하기
    void printInfo()
    {
        System.out.print("\n");
        System.out.println("name: "+name);          // 이름
        System.out.println("age: "+age);            // 나이
        System.out.println("mass: "+mass);          // 몸무게
        System.out.println("PT start: "+PTdate1);   // 첫 PT 날짜
        System.out.println("PT finish: "+PTdate2);  // 마지막 PT 날짜
        System.out.print("\n");
    }

    // 빈 정보를 채울 기본값 설정하기
    void initInfo()
    {
        this.name = null;       // 이름
        this.age = -1;          // 나이
        this.mass = -1;         // 몸무게
        this.PTdate1 = 0;       // 첫 PT 날짜
        this.PTdate2 = 0;       // 마지막 PT 날짜
    }
}