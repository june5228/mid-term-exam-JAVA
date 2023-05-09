package func;

import java.util.Scanner;

public class VariableSample {
    Scanner sc = new Scanner(System.in);
    public void function(){
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("1. 내 신상 정보를 변수에 담아 출력하기");
            System.out.println("2. 사원 정보를 키보드로 입력받아 출력하기");
            System.out.println("3. 메인 메뉴로 돌아가기");
            System.out.print("메뉴 선택 : ");
            int input = sc.nextInt();
            System.out.println();
            switch (input) {
                case 1:
                    myProfile();
                    break;
                case 2:
                    empInformation();
                    break;
                case 3:
                    System.out.println("메인메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 입력 입니다. 다시 입력 해 주세요");
                    function();
            }
        }while (true);
    }
    public void myProfile(){

        System.out.println();
        String name = "김준열";
        int birth = 19960517;
        double weight = 83.5;
        int height = 180;
        System.out.println("이름 : " + name + "\n생일 : " + birth + "\n몸무게 : " + weight + "\n키 : " + height);
        System.out.println();
    }
    public void empInformation(){
        System.out.println();
        System.out.print("이름을 입력 해 주세요 : ");
        String name = sc.next();

        System.out.print("생년월일을 입력 해 주세요(ex : 19960517) : ");
        int birth = sc.nextInt();

        System.out.print("소속 부서를 입력 해 주세요 : " );
        String depart = sc.next();

        System.out.print("입사 년도를 입력 해 주세요 (ex : 2020) : ");
        int joinDate = sc.nextInt();
        System.out.println();

        System.out.println("입력 된 사원은 이름 : " + name + "\n생년월일 : " + birth + "\n소속부서 : " + depart + "\n입사년도 : " + joinDate + "\n");
        System.out.println();
    }
}
