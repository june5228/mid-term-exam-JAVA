package func;

import java.util.Scanner;

public class ForSample {
    Scanner sc = new Scanner(System.in);
    int input;

    public void function() {
        do {
            System.out.println();
            System.out.println("1. 1~10까지 정수들의 합계 구하기");
            System.out.println("2. 1~100사이의 짝수들의 합계 구하기");
            System.out.println("3. 정수 하나 입력받아, 그 수의 구구단 출력하기");
            System.out.println("4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기");
            System.out.println("5. 줄수와 칸수를 입력 받아, 입력된 줄/칸수만큼 별표문자 출력하기");
            System.out.println("6. 7*7에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기");
            System.out.println("7. 줄 수를 입력받아, 삼각형 모양으로 별표문자 출력하기 (양각 : 직각삼각형, 음수 : 역삼각형");
            System.out.println("8. 구구단 2~9단 출력");
            System.out.println("9. 메인 메뉴로 가기");
            System.out.print("메뉴 선택 : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    sum1To10();
                    break;
                case 2:
                    sumEven1T0100();
                    break;
                case 3:
                    oneGugudan();
                    break;
                case 4:
                    sumMinToMax();
                    break;
                case 5:
                    printStar();
                    break;
                case 6:
                    printNumberStar();
                    break;
                case 7:
                    printTriangleStar();
                    break;
                case 8:
                    guguDan();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("잘못된 입력 입니다. 다시 입력 해 주세요");
                    function();

            }
        } while (true);
    }

    public void sum1To10() {
        System.out.println();
        int result = 0;
        for(int i = 1; i < 11; i++){
            result += i;
        }
        System.out.println("1부터 10까지의 합은 " + result + "입니다.");
    }
    public void sumEven1T0100(){
        System.out.println();
        int result = 0;
        for(int i = 0; i < 101; i ++){
            if(i % 2 == 0){
                result += i;
            }
        }
        System.out.println("1~100사이의 짝수의 합은" + result + "입니다");
    }
    public void oneGugudan(){
        System.out.print("출력 할 구구단 단수를 입력 해 주세요 : ");
        int input = sc.nextInt();
        for(int i = 1; i < 10; i++){
            System.out.println(input + "*" + i + "=" + (input * i));
        }
    }
    public void sumMinToMax(){
        System.out.print("최소값을 정수로 입력 해 주세요 : ");
        int min = sc.nextInt();
        System.out.print("최댓값을 정수로 입력 해 주세요 : ");
        int max = sc.nextInt();
        int result = 0;
        for(int i = min; i <= max; i++){
            result += i;
        }
        System.out.println("최소부터 최대까지 1씩 증가하며 더한 값 = " + result);
    }
    public void printStar(){
        System.out.print("칸 수를 입력 해 주세요 : ");
        int width = sc.nextInt();
        System.out.print("줄 수를 입력 해 주세요 : ");
        int height = sc.nextInt();
        for(int i = 0; i < width; i++){
            System.out.println();
            for(int j = 0; j < height; j++){
                System.out.print("*");
            }
        }
    }
    public void printNumberStar(){
        for(int i = 0; i < 7; i++){
            System.out.println();
            for(int j = 0; j < 7; j++){
                if(i == j){
                    System.out.print(i + 1);
                } else {
                    System.out.print("*");
                }
            }
        }
        System.out.println();
    }
    public void printTriangleStar() {
        System.out.print("출력할 줄 수를 입력 해 주세요 : ");
        int lines = sc.nextInt();
        if (lines > 0) {
            for (int i = 1; i <= lines; i++) {
                System.out.println();
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
        } else if(lines < 0){
            for(int i = (-1 *lines); i >= 0; i--){
                System.out.println();
                for(int j = 0; j < i; j++){
                    System.out.print("*");
                }
            }
        }
    }
    public void guguDan(){
        System.out.println("--------------");
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("--------------");
        }
    }


}


