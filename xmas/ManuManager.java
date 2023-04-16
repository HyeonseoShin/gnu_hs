package xmas;
import java.util.ArrayList;
import java.util.Scanner;

public class ManuManager
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<PtMember> PtmemberList = new ArrayList<PtMember>();
        ArrayList<FreeMember> FreeMemberList = new ArrayList<FreeMember>();

        int NumAccept = 0;

        while (true)
        {
            // Printing out the information board
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
                    while (true)                // 참값일 땨까지 반복하기
                    {
                        System.out.println("PT 회원이라면 1을, 자유 이용 회원이라면 0을 입력해주세요: ");  // 입력받을 요소를 알려주기
                        int freeorpt=input.nextInt();

                        if(freeorpt != 0 && freeorpt != 1)
                        {
                            break;
                        }

                        else if(freeorpt==1)
                        {
                            System.out.println("나이, 이름, 몸무게, PTstart date, PTend date 를 입력하시오: " );
                            System.out.println("0을 입력하시면 메뉴로 나갑니다.");
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
                                PtmemberList.add(new PtMember(mname, mage, mmass, mPTdate1, mPTdate2)); // 멤버 저장 리스트에 넣기

                                System.out.println("등록 완료");
                                System.out.println("0과 1 외의 숫자를 입력하시면 메뉴로 나갑니다.");

                                continue;
                            }
                        }

                        else if (freeorpt==0)
                        {
                            System.out.println("나이, 이름, 이용 시작일, 결제 일수를 입력하십시오: ");
                            System.out.println("0을 누르시면 메뉴로 나갑니다.");

                            int mage = input.nextInt();

                            if (mage == 0)
                            {
                                break;
                            }

                            else
                            {
                                String buffer = input.nextLine();
                                String mname = input.nextLine();
                                int mfst = input.nextInt();
                                int capable = input.nextInt();
                                FreeMemberList.add(new FreeMember(mname, mage, mfst, capable));

                                System.out.println("등록 완료!");
                                System.out.println("0과 1이외의 숫자를 입력하시면 메뉴로 나갑니다.");

                                continue;
                            }
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

                    int freeorpt = input.nextInt();

                    if (freeorpt == 1)             // 목록 비우기를 요청했으면
                    {
                        System.out.println("목록 전체를 삭제하시려면 0, 특정 번호를 삭제하시려면 멤버 번호를 입력하십시오:");
                        int deleteAll = input.nextInt();

                        if(deleteAll == 0)
                        {
                            PtmemberList.clear();         // 목록 전체를 비우기
                            continue;
                        }

                        else
                        {
                            PtmemberList.remove(deleteAll-1);
                        }
                    }

                    else if(freeorpt==0)
                    {
                        System.out.printf("목록 전체를 삭제하시려면 0, 특정 번호를 삭제하시려면 멤버 번호를 입력하십시오: ");

                        int deleteAll = input.nextInt();

                        if (deleteAll == 0) {
                            FreeMemberList.clear();
                            continue;
                        }

                        else
                        {
                            PtmemberList.remove(deleteAll - 1);
                        }
                    }

                    else if(freeorpt==0)
                    {
                        System.out.printf("목록 전체를 삭제하시려면 0, 특정 번호를 삭제하시려면 멤버 번호를 입력하십시오: ");

                        int deleteAll=input.nextInt();

                        if(deleteAll==0)
                        {
                            FreeMemberList.clear();
                            continue;
                        }

                        else
                        {
                            FreeMemberList.remove(deleteAll-1);
                        }
                    }

                    System.out.println("삭제가 완료되었습니다.\n");

                    continue;
                }
            }

            else if (a == 3)        // 정보 변경을 요청했으면
            {
                System.out.println("PT 회원이라면 1을, 일반 회원이라면 0을 입력하십시오: ");

                int freeorpt = input.nextInt();

                if(freeorpt==1)
                {
                    System.out.println("변경할 회원 번호를 입력하십시오: ");
                    int membernum=input.nextInt();
                    PtmemberList.remove(membernum-1);

                    System.out.println("변경될 회원 정보를 입력하십시오(나이, 이름, 몸무게, PTdate1, PTdate): ");
                    int mage=input.nextInt();
                    String buffer=input.nextLine();
                    String mname=input.nextLine();
                    double mmass = input.nextDouble();
                    int mPTstartdate= input.nextInt();
                    int mPTenddate=input.nextInt();

                    PtmemberList.add(membernum-1, new PtMember(mname, mage, mmass, mPTstartdate, mPTstartdate));

                    System.out.println(membernum+"번 회원 정보의 변경이 완료되었습니다.");
                }

                else if(freeorpt == 0)
                {
                    System.out.println("변경할 회원 번호를 입력하십시오: ");
                    int membernum = input.nextInt();
                    FreeMemberList.remove(membernum-1);

                    System.out.println("변경할 회원 정보를 입력하시오(나이, 이름, 이용 시작일, 결제 일수): ");
                    int mage = input.nextInt();
                    String buffer = input.nextLine();
                    String mname = input.nextLine();
                    int mfirstdate = input.nextInt();
                    int mcapable = input.nextInt();

                    FreeMemberList.add(membernum-1, new FreeMember(mname, mage, mfirstdate, mcapable));

                    System.out.println(membernum+"번 회원 정보의 변경이 완료되었습니다.");
                }
            }

            else if (a == 4)                // 멤버를 보고싶어 하면
            {
                System.out.print("\n");

                if (PtmemberList.size() == 0 && FreeMemberList.size()==0)
                {
                    System.out.println("현재 회원 정보가 없습니다.\n");        // 비어있음을 알리기
                    continue;
                }

                else if(PtmemberList.size() != 0 && FreeMemberList.size()==0)
                {
                    System.out.println("\n=========PT회원=========");

                    for(int i = 0; i<PtmemberList.size(); i++)
                    {
                        System.out.print("회원 "+(i+1)+": ");
                        PtMember member = PtmemberList.get(i);
                        member.printPTMember();
                    }

                    System.out.println("\n=========일반회원=========");
                    System.out.println("현재 일반 회원 정보가 없습니다.");
                }

                else if(PtmemberList.size() == 0 && FreeMemberList.size() != 0)
                {
                    System.out.println("\n=========PT회원=========");
                    System.out.println("현재 PT 회원 정보가 없습니다.");

                    System.out.println("\n=========일반회원=========");

                    for (int i = 0; i<FreeMemberList.size(); i++)
                    {
                        System.out.print("회원 "+(i+1)+": ");
                        FreeMember member=FreeMemberList.get(i);
                        member.printFreeMember();
                    }
                }

                else
                {
                    System.out.print("\n=========PT회원=========");

                    for(int i=0; i<PtmemberList.size(); i++)
                    {
                        System.out.print("회원: "+(i+1)+": ");
                        PtMember member = PtmemberList.get(i);
                        member.printPTMember();
                    }

                    for(int i=0; i<FreeMemberList.size(); i++)
                    {
                        System.out.print("회원: "+(i+1)+": ");
                        FreeMember member = FreeMemberList.get(i);
                        member.printFreeMember();
                    }
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