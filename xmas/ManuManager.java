package xmas;
import java.util.ArrayList;
import java.util.Scanner;

public class ManuManager
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<MemberInfo> memberList=new ArrayList<MemberInfo>();

        int NumAccept = 0;

        while (true)
        {
            // 안내판 출력하기
            System.out.println("1. Add Members");
            System.out.println("2. Delete Members");
            System.out.println("3. Edit Members");
            System.out.println("4. View Members");
            System.out.println("5. Menu");
            System.out.println("6. Exit");

            int a = input.nextInt();        // 원하는 작동 방식 입력받기

            if(a == 1)      // 멤버를 추가하고 싶으면
            {
                System.out.println("메뉴로 나가시려면 0을, 회원 입력을 계속하시려면 1을 입력하십시오: ");
                NumAccept = input.nextInt();

                if (NumAccept == 0)     // 잘못 들어왔으면
                {
                    continue;           // 다시 나가기
                }

                else if (NumAccept == 1)        // 멤버를 추가하기를 원하면
                {
                    System.out.println("나이, 이름, 몸무게, PTdate1, PTdate2 를 입력하십시오: ");  // 입력받을 요소를 알려주기
                    System.out.println("0을 입력하시면 메뉴로 나갑니다.");               // 잘못 들어왔을 때 나가는 방법 알리기

                    while (true)                // 참값일 땨까지 반복하기
                    {
                        int mage = input.nextInt();

                        if (mage == 0)
                        {
                            break;
                        }

                        else
                        {
                            String buffer = input.nextLine();
                            String mname = input.nextLine();            // 이름 입력받기
                            double mmass = input.nextDouble();          // 몸무게 입력받기
                            int mPTdate1 = input.nextInt();             // 첫 PT 날짜 입력받기
                            int mPTdate2 = input.nextInt();             // 마지막 PT 날짜 입력받기
                            memberList.add(new MemberInfo(mname, mage, mmass, mPTdate1, mPTdate2)); // 멤버 저장 리스트에 넣기

                            System.out.println("등록 완료");
                            System.out.println("0을 입력하시면 메뉴로 나갑니다. 추가 등록을 원할 경우 계속해서 입력해주십시오.");

                            continue;
                        }
                    }
                }
            }

            else if (a == 2)        // 멤버 삭제를 요청했으면
            {
                System.out.println("메뉴로 나가시려면 0을, 회원 정보를 삭제하시려면 1을 입력하십시오. ");
                NumAccept = input.nextInt();

                if (NumAccept == 0)
                {
                    break;
                }

                else if (NumAccept == 1)
                {
                    System.out.println("목록 전체를 삭제하시려면 0, 특정 번호를 삭제하시려면 멤버 번호를 입력하십시오. ");

                    int deleteAll = input.nextInt();

                    if (deleteAll == 0)             // 목록 비우기를 요청했으면
                    {
                        memberList.clear();         // 목록 전체를 비우기
                        continue;
                    }

                    else                            // 아니라면
                    {
                        memberList.remove(deleteAll-1);     // 입력받은 번호를 삭제하기
                    }
                }

                System.out.println("삭제가 완료되었습니다.\n");

                continue;
            }

            else if (a == 3)        // 정보 변경을 요청했으면
            {
                System.out.println("변경할 회원 번호를 입력하십시오: ");
                int membernum = input.nextInt();        // 변경할 회원 번호 입력받기
                memberList.remove(membernum-1);   // 입력받은 회원 번호에 저장된 정보 지우기

                // 변경된 회원 정보 입력받기
                System.out.println("변경할 회원 정보를 입력하십시오(나이, 이름, 몸무게, PTdate1, PTdate2): ");
                int mage = input.nextInt();         // 나이 입력받기
                String buffer = input.nextLine();
                String mname = input.nextLine();    // 이름 입력받기
                double mmass = input.nextDouble();  // 몸무게 입력받기
                int mPTdate1 = input.nextInt();     // 첫 PT 날짜 입력받기
                int mPTdate2 = input.nextInt();     // 마지막 PT 날짜 입력받기

                memberList.add(membernum-1, new MemberInfo(mname,mage,mmass,mPTdate1,mPTdate2));
                // 입력받은 정보를 리스트에 넣기

                System.out.println(membernum+"번 회원 정보의 변경이 완료되었습니다.");
            }

            else if (a == 4)                // 멤버를 보고싶어 하면
            {
                System.out.print("\n");

                if (memberList.size() == 0)
                {
                    System.out.println("empty");        // 비어있음을 알리기
                    System.out.print("\n");
                    continue;
                }

                for(int i=0; i<memberList.size(); i++)
                {
                    System.out.print("회원 "+(i+1)+": ");     // 멤버 번호 출력하기
                    MemberInfo member=memberList.get(i);     // 입력받은 멤버의 정보에 접근하기
                    member.printInfo();                      // 입력받은 멤버에 대한 정보 출력하기
                }

                System.out.print("\n");
            }

            else if (a == 5)        // 메뉴를 다시 보고 싶으면
            {
                continue;           // 메뉴판으로 돌아가기
            }

            else if (a == 6)        // 끝내고 싶으면
            {
                break;              // 반복을 끝내기
            }
        }
    }
}