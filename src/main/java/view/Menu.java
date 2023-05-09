package view;

import func.*;

import java.util.Scanner;

public class Menu {
    public int input;
    Scanner sc = new Scanner(System.in);
    public void mainMenu(){

        System.out.println();
        System.out.println("***** 프로그래밍 기본 기능 테스트 프로그램 *****");
        System.out.println();
        System.out.println("1. 변수 테스트");
        System.out.println("2. 기본 자료형 테스트");
        System.out.println("3. if문 테스트");
        System.out.println("4. switch문 테스트");
        System.out.println("5. for문 테스트");
        System.out.println("6. while문 테스트");
        System.out.println("7. do-while문 테스트");
        System.out.println("8. break문 테스트");
        System.out.println("9. continue문 테스트");
        System.out.println("10. static 메소드 사용 테스트");
        System.out.println("11. non-static 메소드 사용 테스트");
        System.out.println("12. 프로그램 종료");
        System.out.print("메뉴 번호 입력 : ");

        input = sc.nextInt();
        System.out.println();
        switch (input) {
            case 1:
                subVarMenu();
                break;
            case 2:
                subPTypeMenu();
                break;
            case 3:
                subIfMenu();
                break;
            case 4:
                subSwitchMenu();
                break;
            case 5:
                subForMenu();
                break;
            case 6:
                subWhileMenu();
                break;
            case 7:
                subDoWhileMenu();
                break;
            case 8:
                subBreakMenu();
                break;
            case 9:
                subContinueMenu();
                break;
            case 10:
                subStaticMethodMenu();
                break;
            case 11:
                subNonStaticMethodMenu();
                break;
            case 12:
                shutDown();
                break;

        }
    }
    public void subVarMenu(){
        VariableSample vs = new VariableSample();
        vs.function();
    }

    public void subPTypeMenu(){
        PrimitiveTypeSample pts = new PrimitiveTypeSample();
        pts.function();
    }

    public void subIfMenu(){
        IfSample is = new IfSample();
        is.function();
    }

    public void subSwitchMenu(){
        SwitchSample ss = new SwitchSample();
        ss.function();
    }

    public void subForMenu(){
        ForSample fs = new ForSample();
        fs.function();
    }

    public void subWhileMenu(){
        WhileSample ws = new WhileSample();
        ws.function();
    }

    public void subDoWhileMenu(){
        DoWhileSample dws = new DoWhileSample();
        dws.function();
    }

    public void subBreakMenu(){
        BreakSample bs = new BreakSample();
        bs.function();
    }

    public void subContinueMenu(){
        ContinueSample cs = new ContinueSample();
        cs.function();
    }

    public void subStaticMethodMenu(){
        StaticMethodSample sms = new StaticMethodSample();
        sms.function();
    }

    public void subNonStaticMethodMenu(){
        NonStaticMethodSample nsms = new NonStaticMethodSample();
        nsms.function();
    }
    public void shutDown(){
        System.out.println("정말로 종료 하겠습니까? : (예 : Y / 아니오 : N )");
        char yn = sc.next().charAt(0);
        switch (yn){
            case 'Y': case 'y':
                System.out.println("사용을 종료합니다.");
                break;
            case 'N': case 'n':
                System.out.println("메인 메뉴로 돌아갑니다.");
                mainMenu();
            default:
                System.out.println("확인 되지 않은 입력입니다. 다시 입력 해 주세요.");
                shutDown();
        }
    }
}
