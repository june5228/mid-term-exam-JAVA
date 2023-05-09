package func;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DoWhileSample {

    Scanner sc = new Scanner(System.in);
    int input;
    public void function() {
        do {
            System.out.println();
            System.out.println("1. 문자열을 입력받아 문자 사이에 '-'끼워 넣어 출력하기");
            System.out.println("2. 버거킹 메뉴 주문 테스트");
            System.out.println("3. 문자열을 입력받아 '모든 글자가 영어다/아니다' 출력하기");
            System.out.println("4. 메인 메뉴로");
            System.out.print("메뉴 선택 : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    addDashToken();
                    break;
                case 2:
                    burgerKingMenu();
                    break;
                case 3:
                    isStringAlphabet();
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

    public void addDashToken(){
        System.out.print("문자열을 입력 해 주세요 : ");
        String str = sc.next();
        String result = "";
        do{
            for(int i = 0; i < str.length(); i++){
                if(i + 1 >= str.length()) {
                    result += str.charAt(i);
                } else {
                    result += str.charAt(i) + "-";
                }
            }
        }while(str.length() < 0);
        System.out.println(result);
    }
    public void burgerKingMenu(){
        int order;
        String orderlist ="";
        int price = 0;
        do{
            System.out.println("============ 버거킹 메뉴 ============");
            System.out.println("1. 통새우 와퍼 주니어 세트 : 6600원");
            System.out.println("2. 트러플 콰트로 머쉬룸 와퍼 세트 : 8000원");
            System.out.println("3. 불고기와퍼 7700원");
            System.out.println("4. 와퍼 주니어 4000원");
            System.out.println("5. 21 치즈스틱 1500원");
            System.out.println("6. 코코넛 쉬림프 3조각 2800원");
            System.out.println("7. 프렌치프라이 1600원");
            System.out.println("8. 초코선데 1500원");
            System.out.println("9. 주문하기");
            System.out.print("메뉴 선택 :");
            order = sc.nextInt();
            switch (order){
                case 1:
                    orderlist += "통새우 와퍼 주니어 세트\n";
                    price += 6600;
                    break;
                case 2:
                    orderlist += "트러플 콰트로 머쉬룸 와퍼 세트\n";
                    price += 8000;
                    break;
                case 3:
                    orderlist += "불고기 와퍼\n";
                    price += 7700;
                    break;
                case 4:
                    orderlist += "와퍼 주니어\n";
                    price += 4000;
                    break;
                case 5:
                    orderlist += "21 치즈스틱\n";
                    price += 1500;
                    break;
                case 6:
                    orderlist += "코코넛 쉬림프 3조각\n";
                    price += 2800;
                    break;
                case 7:
                    orderlist += "프렌치프라이\n";
                    price += 1600;
                    break;
                case 8:
                    orderlist += "초코선데\n";
                    price += 1500;
                    break;
                case 9:
                    System.out.println();
                    System.out.println("주문 내용은 : \n" + orderlist + "이고, 가격은 : " + price + "입니다.");
                    return;

            }
        }while(order != 9);


    }
    public void isStringAlphabet(){

        String pattern = "^[a-zA-Z]*$";

        do{
            System.out.print("확인 할 문자열을 입력 해 주세요 : ");
            String str = sc.next();
            boolean match = Pattern.matches(pattern, str);
            if(match != false){
                System.out.println("모든 문자가 영문자");
            } else {
                System.out.println("다른 문자가 섞여있음");
            }
        }while(true);
    }
}
