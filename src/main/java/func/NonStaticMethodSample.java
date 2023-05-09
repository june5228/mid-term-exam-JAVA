package func;

import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {
    Scanner sc = new Scanner(System.in);
    int input;
    public void function(){
        do {
            System.out.println();
            System.out.println("1. 자료형 종류별로 값 입력 받아 출력하기");
            System.out.println("2. 저웃와 실수에 대한 난수 출력");
            System.out.println("3. 메인 메뉴로");
            System.out.print("메뉴 선택 : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    testScanner();
                    break;
                case 2:
                    testRandom();
                    break;
                case 3:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 입력 입니다. 다시 입력 해 주세요");
                    function();
            }
        }while(true) ;

    }

    public void testScanner(){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력 해 주세요 : ");
        int i = sc.nextInt();
        System.out.print("실수를 입력 해 주세요 : ");
        double d = sc.nextDouble();
        System.out.print("문자를 입력 해 주세요 (1개) : ");
        char c = sc.next().charAt(0);
        System.out.print("문자열을 입력 해 주세요 : ");
        String s = sc.next();
        System.out.print("참과 거짓 중 한가지를 true 또는 false로 입력 해 주세요 : ");
        boolean b = sc.nextBoolean();

        System.out.println("정수 : " + i);
        System.out.println("실수 : " + d);
        System.out.println("문자 : " + c);
        System.out.println("문자열 : " + s);
        System.out.println("참 거짓 : " + b);
        System.out.println();
    }
    public void testRandom(){
        Random random = new Random();
        int randomInt = random.nextInt();

        double randomDouble = random.nextDouble();

        System.out.println("정수형 난수 : " + randomInt);
        System.out.println("실수형 난수 : " + randomDouble);
    }
}
