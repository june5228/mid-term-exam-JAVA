package func;

import java.util.Random;
import java.util.Scanner;

public class StaticMethodSample {
    public void function(){
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println();
            System.out.println("1. 1~45사이의 임의의 정수 출력");
            System.out.println("2. -12.77의 절대값 구하기");
            System.out.println("3. 두 정수중 큰 값 구하는 메소드");
            System.out.println("4. 메인 메뉴로");
            System.out.print("메뉴 선택 : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    testMathRandom();
                    break;
                case 2:
                    testMathAbs();
                    break;
                case 3:
                    testMathMax();
                    break;
                case 4:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 입력 입니다. 다시 입력 해 주세요");
                    function();
            }
        }while(true) ;
    }

    public void testMathRandom(){
        int randomNum = (int) (Math.random()*100 +1);
        System.out.println("랜덤으로 생성 된 정수는 " + randomNum);
    }
    public void testMathAbs(){
        double i = -12.77;
        double doubleAbs = Math.abs(i);
        System.out.println("입력되어 있는 값인 " + i + "의 절대값은 " + doubleAbs + "입니다.");
    }
    public void testMathMax(){
        int first = 120;
        int second = 54;
        int max = Math.max(first, second);
        System.out.println(first + "와 " + second + "중 더 큰 수는 " + max + "입니다.");
    }

}

