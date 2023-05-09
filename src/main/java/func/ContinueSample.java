package func;

import java.util.Scanner;

public class ContinueSample {
    public void function(){
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println();
            System.out.println("1. 1부터 100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력");
            System.out.println("2. 3행 5열의 행렬값 출력하되, 1행 3열부터 1행 5열까지 생략 후 출력");
            System.out.println("3. 메인 메뉴로");
            System.out.print("메뉴 선택 : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    sumJumpThree();
                    break;
                case 2:
                    rowColJump();
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

    public void sumJumpThree(){
        int sum = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 3 ==0){
                continue;
            }
            System.out.println(sum);
            sum += i;
        }
        System.out.println("1부터 100까지 3의 배수를 제외한 수의 합은 " + sum + " 입니다.");
    }
    public void rowColJump(){
        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                if(i == 0 && j == 2 || i == 0 && j == 4){
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
        }
    }
}
