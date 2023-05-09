package func;

import java.util.Scanner;

public class SwitchSample {
    Scanner sc = new Scanner(System.in);
    int result;

    public void function() {
        do {
            System.out.println();
            System.out.println("1. 두 개의 정수와 한 개의 연산 문자를 입력 받아 계산 결과 확인하기");
            System.out.println("2. 과일 이름을 문자열로 입력받아, 그 과일의 가격 출력하기");
            System.out.println("3. 메인 메뉴로 돌아가기");
            System.out.print("메뉴 선택 : ");
            int input = sc.nextInt();
            System.out.println();

            switch (input) {
                case 1:
                    calculator();
                    break;

                case 2:
                    fruitPrice();
                    break;
                case 3:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 입력 입니다. 다시 입력 해 주세요");
                    function();
            }
        } while (true);
    }

    public void calculator() {
        System.out.print("첫번째 정수를 입력 하세요 : ");
        int x = sc.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int y = sc.nextInt();
        System.out.print("어떤 연산을 할까요? (ex : +, -, *, %) : ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                result = x + y;
                System.out.println(x + " " + op + " " + y + " = " + result);
                break;
            case '-':
                result = x - y;
                System.out.println(x + " " + op + " " + y + " = " + result);
                break;
            case '*':
                result = x * y;
                System.out.println(x + " " + op + " " + y + " = " + result);
                break;
            case '%':
                result = x % y;
                System.out.println(x + " " + op + " " + y + " = " + result);
                break;
        }
    }

    public void fruitPrice() {
        System.out.print("과일 이름을 적어주세요 : ");
        String fruit = sc.next();
        switch (fruit) {
            case "사과":
                System.out.println(fruit + "의 가격은 1000원 입니다.");
                break;

            case "바나나":
                System.out.println(fruit + "의 가격은 3000원 입니다.");
                break;

            case "복숭아":
                System.out.println(fruit + "의 가격은 2000원 입니다.");
                break;

            case "키위":
                System.out.println(fruit + "의 가격은 5000원 입니다.");
                break;

            default:
                System.out.println("해당 과일은 준비되지 않았습니다.");
        }
    }
}

