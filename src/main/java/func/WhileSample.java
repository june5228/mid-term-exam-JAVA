package func;

import java.util.Random;
import java.util.Scanner;

public class WhileSample {
    Scanner sc = new Scanner(System.in);
    int input;
    public void function(){
        do {
            System.out.println("1. 문자 하나 입력받아, 그 문자의 유니코드 출력(반복)");
            System.out.println("2. 1~100까지 정수들의 합계 출력하기 (while)");
            System.out.println("3. 1~100사이의 임의의 정수를 발생시켜 숫자 알아맞추기");
            System.out.println("4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기");
            System.out.println("5. 문자열 값과 문자 하나를 입력 받아 문자열에 문자가 몇 개 있는 지 확인하기");
            System.out.println("6. 메인 메뉴로 돌아가기");
            System.out.print("메뉴 선택 : ");
            input = sc.nextInt();

            switch (input){
                case 1:
                    printUniCode();
                    break;
                case 2:
                    sum1To100();
                    break;
                case 3:
                    numberGame();
                    break;
                case 4:
                    countCharacter();
                    break;
                case 5:
                    countInChar();
                    break;
                case 6:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 입력 입니다. 다시 입력 해 주세요");
                    function();
            }
        }while(true);
    }
    public void printUniCode() {
        System.out.print("유니코드를 출력 할 문자를 입력하세요 :");
        char c = sc.next().charAt(0);
        while(c != '0'){
            System.out.println(c + "의 유니코드는 " + (int)c + " 입니다.");
            printUniCode();
        }
        System.out.println("이전 메뉴로 돌아갑니다.");
        function();
    }
    public void sum1To100() {

        int i = 0;
        int result = 0;
        while(i <= 100){
            result += i;
            i += 1;
        }
        System.out.println("1부터 100가지의 합은 " + result + " 입니다.");
    }
    public void numberGame() {
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int answerCount = 0;
        System.out.println("1~100 사이의 정수를 입력해 주세요");
        while(i != randomNum){
            answerCount++;
            System.out.println("정답 : ");
            i = sc.nextInt();
            if(i < randomNum){
                System.out.println("정답보다 작습니다");
            }
            if(i > randomNum){
                System.out.println("정답보다 큽니다");
            }
        }
        System.out.println("정답입니다. " + answerCount + "회 만에 맞추셨습니다.");
        System.out.println();
    }
    public void countCharacter() {
        System.out.print("글자 수를 셀 문자열을 입력 해 주세요 : ");
        String str = sc.next();
        int len = 0;
        while(len < str.length()){
            len++;}
        System.out.println(len);
    }
    public void countInChar() {
        System.out.print("문자열을 입력 해 주세요 : ");
        String str = sc.nextLine();
        char letter;
        int count = 0;
            System.out.print("검색 할 문자를 입력 해 주세요 : ");
            letter = sc.nextLine().charAt(0);
            for (int i = 0; i < str.length(); i++) {
                if (letter == str.charAt(i)) {
                    count++;
                }
            }
        System.out.println("포함된 갯수 : " + count);
        System.out.println();
    }

}
