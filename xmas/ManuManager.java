package xmas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManuManager
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<PtMember> PtmemberList=new ArrayList<PtMember>();
        ArrayList<FreeMember> FreememberList=new ArrayList<FreeMember>();

        int NumAccept = 0;

        while (true)
        {
            try
            {
                // Printing out the information board
                System.out.println("1. Add Members");
                System.out.println("2. Delete Members");
                System.out.println("3. Edit Members");
                System.out.println("4. View Members");
                System.out.println("5. Menu");
                System.out.println("6. Exit");

                System.out.print("\n");

                int a = input.nextInt();        // Getting the desired way you want it to do

                if(a == 1)      // Wanting to add more members
                {
                    System.out.println("메뉴로 나가시려면 0을, 회원 입력을 계속하시려면 1을 입력하십시오: ");
                    NumAccept = input.nextInt();

                    if (NumAccept == 0)     // Coming in wrong
                    {
                        continue;           // Going out again
                    }

                    else if (NumAccept == 1)        // Wanting to add more members
                    {
                        while (true)                // Repeating until true value
                        {
                            try
                            {
                                System.out.println("PT 회원이라면 1을, 자유 이용 회원이라면 0을 입력해주십시오.");
                                int freeorpt = input.nextInt();

                                if(freeorpt != 0 && freeorpt != 1)
                                {
                                    break;
                                }

                                if (freeorpt == 1)
                                {
                                    System.out.println("나이, 이름, 몸무게, PTstart date, PTend date 를 입력하십시오.");
                                    System.out.println("0을 입력하시면 메뉴로 나갑니다.");

                                    int mage = input.nextInt();

                                    if (mage == 0)
                                    {
                                        break;
                                    }

                                    else
                                    {
                                        String buffer = input.nextLine();
                                        String mname = input.nextLine();            // Receiving name input
                                        double mmass = input.nextDouble();          // Receiving weight input
                                        int mPTdate1 = input.nextInt();             // Receiving First day input
                                        int mPTdate2 = input.nextInt();             // Receiving Last day input
                                        PtmemberList.add(new PtMember(mname, mage, mmass, mPTdate1, mPTdate2)); // Putting in Member Save List

                                        System.out.println("등록 완료");
                                        System.out.println("0과 1 이외의 숫자를 입력하시면 메뉴로 나갑니다. 추가 등록을 원할 경우 계속해서 입력해주십시오.");

                                        continue;
                                    }
                                }

                                else if(freeorpt == 0)
                                {
                                    System.out.println("나이, 이름, 이용 시작일, 결제 일수를 입력하십시오: ");
                                    System.out.println("0을 입력하시면 메뉴로 나갑니다.");

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

                                        if(mage < 1 || mage > 110 || mfst < 20000000 || mfst > 21000000 || capable < 1 || capable > 1000)
                                        {
                                            throw new MyException();
                                        }

                                        FreememberList.add(new FreeMember(mname, mage, mfst, capable));

                                        System.out.println("등록 완료");
                                        System.out.println("0과 1 이외의 숫자를 입력하시면 메뉴로 나갑니다.");

                                        continue;
                                    }
                                }
                            }

                            catch(MyException e)
                            {
                                System.out.println("나이 또는 날짜를 올바르게 입력해 주십시오. 메뉴로 돌아갑니다.");
                                break;
                            }
                        }

                        continue;
                    }
                }

                else if (a == 2)        // Asking me to delete a member
                {
                    System.out.println("메뉴로 나가시려면 0을, 회원 정보를 삭제하시려면 1을 입력하십시오. ");
                    NumAccept = input.nextInt();

                    if (NumAccept == 0)
                    {
                        break;
                    }

                    else if (NumAccept == 1)
                    {
                        System.out.printf("PT 회원이라면 1을, 일반 회원이라면 0을 입력하십시오: ");
                        int freeorpt = input.nextInt();

                        if(freeorpt==1)
                        {
                            System.out.println("목록 전체를 삭제하시려면 0, 특정 번호를 삭제하시려면 멤버 번호를 입력하십시오. ");

                            int deleteAll = input.nextInt();

                            if(deleteAll < 0)
                            {
                                continue;
                            }

                            if (deleteAll == 0)             // Asking me to empty the list
                            {
                                PtmemberList.clear();         // Empty the entire list
                                continue;
                            }

                            else                            // Unless
                            {
                                PtmemberList.remove(deleteAll-1);     // Deleting a received number
                            }
                        }

                        else if(freeorpt == 0)
                        {
                            System.out.println("목록 전체를 삭제하시려면 0, 특정 번호를 삭제하시려면 멤버 번호를 입력하십시오.");
                            int deleteAll = input.nextInt();

                            if (deleteAll == 0)             // Asking me to empty the list
                            {
                                FreememberList.clear();         // Empty the entire list
                                continue;
                            }

                            else                            // Unless
                            {
                                FreememberList.remove(deleteAll-1);     // Deleting a received number
                            }
                        }

                        System.out.println("삭제가 완료되었습니다.\n");

                        continue;
                    }
                }

                else if (a == 3)        // Requesting a change of information
                {
                    System.out.println("PT 회원이라면 1을, 일반 회원이라면 0을 입력하십시오.");
                    int freeorpt = input.nextInt();

                    if(freeorpt==1)
                    {
                        System.out.printf("변경할 회원 번호를 입력하십시오: ");
                        int membernum = input.nextInt();        // Entering member number to change
                        PtmemberList.remove(membernum-1);   // Clearing information stored in the received membership number

                        // 변경된 회원 정보 입력받기
                        System.out.println("변경할 회원 정보를 입력하십시오(나이, 이름, 몸무게, PTdate1, PTdate2): ");
                        int mage = input.nextInt();         // Receiving age input
                        String buffer = input.nextLine();
                        String mname = input.nextLine();    // Receiving name input
                        double mmass = input.nextDouble();  // Receiving weight input
                        int mPTstartdate = input.nextInt(); // Receiving PT First day input
                        int mPTenddate = input.nextInt();   // Receiving PT Last day input

                        // Putting the entered information into the list
                        PtmemberList.add(membernum-1, new PtMember(mname,mage,mmass,mPTstartdate,mPTenddate));

                        System.out.println(membernum+"번 회원 정보의 변경이 완료되었습니다.");
                    }

                    else if(freeorpt == 0)
                    {
                        System.out.printf("변경할 회원 번호를 입력하십시오. ");
                        int membernum = input.nextInt();
                        FreememberList.remove(membernum-1);

                        System.out.println("변경할 회원 정보를 입력하십시오(나이, 이름, 이용 시작일, 결제 일수)");
                        int mage = input.nextInt();
                        String buffer = input.nextLine();
                        String mname = input.nextLine();
                        int mfirstdate = input.nextInt();
                        int mcapable = input.nextInt();

                        FreememberList.add(membernum-1, new FreeMember(mname, mage, mfirstdate, mcapable));

                        System.out.println(membernum+"번 회원 정보의 변경이 완료되었습니다.");
                    }
                }

                else if (a == 4)                // Wanting to see the members
                {
                    System.out.print("\n");

                    if (PtmemberList.size() == 0 && FreememberList.size() == 0)
                    {
                        System.out.println("현재 회원 정보가 없습니다.");        // A notice of emptiness
                        System.out.print("\n");
                        continue;
                    }

                    else if(PtmemberList.size() != 0 && FreememberList.size() == 0)
                    {
                        // Printing out information about PT members
                        System.out.println("\n=========PT회원=========");

                        for (int i=0; i<PtmemberList.size();i++)
                        {
                            System.out.println("회원 "+(i+1)+": ");
                            PtMember member = PtmemberList.get(i);
                            member.printInfo();
                        }

                        System.out.println("\n=========일반 회원=========");
                        System.out.println("현재 일반 회원 정보가 없습니다.");   // A notice of emptiness
                    }

                    else if(PtmemberList.size() == 0 && FreememberList.size() != 0)
                    {
                        System.out.println("\n=========PT회원=========");
                        System.out.println("현재 PT 회원에 대한 정보가 없습니다.");   // A notice of emptiness

                        // Printing out information about general members
                        System.out.println("\n=========일반 회원=========");

                        for (int i=0; i<FreememberList.size();i++)
                        {
                            System.out.print("회원 "+(i+1)+": ");
                            FreeMember member = FreememberList.get(i);
                            member.printInfo();
                        }
                    }

                    else
                    {
                        // Printing out information about PT members
                        System.out.println("\n=========PT회원=========");

                        for (int i = 0; i < PtmemberList.size(); i++) {
                            System.out.print("회원 " + (i + 1) + ": ");
                            PtMember member = PtmemberList.get(i);
                            member.printInfo();
                        }

                        // Printing out information about general members
                        System.out.println("\n=========일반 회원=========");

                        for (int i=0; i<FreememberList.size();i++)
                        {
                            System.out.print("회원 "+(i+1)+": ");
                            FreeMember member = FreememberList.get(i);
                            member.printInfo();
                        }
                    }

                    System.out.print("\n");
                }

                else if (a == 5)        // Wanting to see the menu again
                {
                    continue;           // Back to Menu
                }

                else if (a == 6)        // Wanting to end it
                {
                    break;              // Ending repeat
                }
            }

            catch(InputMismatchException e)
            {
                input.nextLine();
                System.out.println("입력 타임 에러: 메뉴로 돌아갑니다.");
                System.out.println("==================================================");
                continue;
            }

            catch (IndexOutOfBoundsException e)
            {
                System.out.println("선택한 번호의 회원이 존재하지 않습니다. 메뉴로 돌아갑니다.");
                System.out.println("==================================================");
                continue;
            }

        }
    }
}