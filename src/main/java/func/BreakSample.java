package func;

import java.util.Scanner;

public class BreakSample {
    public void function(){
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println();
            System.out.println("1. 1부터 100까지 정수들의 합계 출력");
            System.out.println("2. 구구단 1~9단까지 출력 중 * 5 에서 break사용");
            System.out.println("3. 메인 메뉴로");
            System.out.print("메뉴 선택 : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    sumBreak();
                    break;
                case 2:
                    guguDanBreak();
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

    public void sumBreak(){
        int i = 0;
        int result = 0;
        while(true){
            if(i > 100){
                break;
            }
            result += i;
            i++;
        }
        System.out.println(result);
    }
    public void guguDanBreak(){
        for(int i = 1; i <= 9; i++){
            System.out.println("----------------------");
            for(int j = 1; j <= 9; j++){
                if(j > 5){
                    break;
                }
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }

}
