package func;

import java.util.Scanner;

public class PrimitiveTypeSample {
    Scanner sc = new Scanner(System.in);
    public void function() {
        do {
            System.out.println("1. 기본자료형 메모리 크기(byte) 출력하기");
            System.out.println("2. 메인 메뉴로 돌아가기");
            System.out.print("메뉴 선택 : ");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    typeSize();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("잘못된 입력 입니다. 다시 입력 해 주세요");
                    function();
            }
        } while(true);
    }

    public void typeSize(){
        System.out.println();
        System.out.printf("byte형의 크기 : %d\n",Byte.SIZE);
        System.out.printf("short형의 크기 : %d\n",Short.SIZE);
        System.out.printf("int형의 크기 : %d\n",Integer.SIZE);
        System.out.printf("long형의 크기 : %d\n",Long.SIZE);
        System.out.printf("float형의 크기 : %d\n",Float.SIZE);
        System.out.printf("double형의 크기 : %d\n",Double.SIZE);
        System.out.printf("char형의 크기 : %d\n",Character.SIZE);
        System.out.println();
    }
}
