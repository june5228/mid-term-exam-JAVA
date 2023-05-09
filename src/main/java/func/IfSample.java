package func;

import java.util.Scanner;

public class IfSample {
    Scanner sc = new Scanner(System.in);
    int input;
    public void function(){
        do{
            System.out.println();
            System.out.println("1. 두 수 중 더 큰 값");
            System.out.println("2. 두 수 중 더 작은 값");
            System.out.println("3. 세 개의 수 중 가장 큰 값과 가장 작은 값");
            System.out.println("4. 홀짝 구분하기");
            System.out.println("5. 합격 / 불합격 분류기");
            System.out.println("6. 학점 확인하기");
            System.out.println("7. 양수인지 음수인지 또는 0인지 확인");
            System.out.println("8. 무슨 문자인지 확인");
            System.out.println("9. 메인 메뉴로");
            System.out.println();
            System.out.print("메뉴 선택 : ");
            input = sc.nextInt();
            switch (input){
                case 1:
                    maxNumber();
                    break;
                case 2:
                    minNumber();
                    break;
                case 3:
                    threeMaxMin();
                    break;
                case 4:
                    oddOrEven();
                    break;
                case 5:
                    isPassFail();
                    break;
                case 6:
                    scoreGrade();
                    break;
                case 7:
                    checkPlusMinusZero();
                    break;
                case 8:
                    whatCharacter();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("잘못된 입력 입니다. 다시 입력 해 주세요");
                    function();
                    
            }
        }while(true);
    }
    public void maxNumber(){
        System.out.println();
        System.out.print("첫번째 값을 입력하세요 : ");
        int x = sc.nextInt();
        System.out.print("두번째 값을 입력하세요 : ");
        int y = sc.nextInt();
        if(x > y){
            System.out.println(x);
        }
        else if(x < y){
            System.out.println(y);
        } else{
            System.out.println("두 수는 같습니다.");
        }
        System.out.println();
    }
    public void minNumber(){
        System.out.println();
        System.out.print("첫번째 값을 입력하세요 : ");
        int x = sc.nextInt();
        System.out.print("두번째 값을 입력하세요 : ");
        int y = sc.nextInt();
        if(x > y){
            System.out.println(y);
        }
        else if(x < y){
            System.out.println(x);
        } else{
            System.out.println("두 수는 같습니다.");
        }
        System.out.println();
    }
    public void threeMaxMin(){
        System.out.println();
        System.out.print("첫번째 값을 입력하세요 : ");
        int x = sc.nextInt();
        System.out.print("두번째 값을 입력하세요 : ");
        int y = sc.nextInt();
        System.out.print("세번째 값을 입력하세요 : ");
        int z = sc.nextInt();
        if(x >= y && x >= z){
            System.out.println("제일 큰 수는 " + x + "입니다.");
        } else if (x <= y && y >= z) {
            System.out.println("제일 큰 수는 " + y + "입니다.");
        }else if(x <= z && y <= z) {
            System.out.println("제일 큰 수는 " + z + "입니다.");
        }
        if(x <= y && x <= z){
            System.out.println("제일 작은 수는 " + x + "입니다.");
        } else if (x >= y && y <= z) {
            System.out.println("제일 작은 수는 " + y + "입니다.");
        }else if(x >= z && y >= z) {
            System.out.println("제일 작은 수는 " + z + "입니다.");
        }
        System.out.println();
    }
    public void oddOrEven(){
        System.out.println();
        System.out.print("구분할 수를 입력 해 주세요(0은 짝수로 처리 합니다) : ");
        int input = sc.nextInt();
        if(input % 2 == 0){
            System.out.println("짝수입니다.");
        }
        else{
            System.out.println("홀수 입니다.");
        }
        System.out.println();
    }
    public void isPassFail(){
        System.out.println();
        System.out.print("국어 점수를 입력 해 주세요 : ");
        int korean = sc.nextInt();
        System.out.print("영어 점수를 입력 해 주세요 : ");
        int english = sc.nextInt();
        System.out.print("수학 점수를 입력 해 주세요 : ");
        int math = sc.nextInt();
        int avg = (korean + english + math) / 3;

        if (avg >= 60) {
            if (korean >= 40 && english >= 40 && math >= 40) {
                System.out.println("합격입니다.");
            }
        }
        if (korean < 40) {
            System.out.println("국어 점수 미달로 불합격 입니다.");
        }
        if (english < 40) {
            System.out.println("영어 점수 미달로 불합격 입니다.");
        }
        if (math < 40) {
            System.out.println("수학 점수 미달로 불합격 입니다.");
        }
        if(avg < 60){
            System.out.println("평균 점수 미달입니다.");
        }
        System.out.println();
    }
    public void scoreGrade(){
        System.out.println();
        System.out.print("점수를 입력 해 주세요 : ");
        int score = sc.nextInt();
        if(score <= 100 && score >= 95){
            System.out.println("A+ 학점 입니다.");
        } else if (score < 95 && score >= 90) {
            System.out.println("A 학점 입니다.");
        } else if (score < 90 && score >= 85) {
            System.out.println("B+ 학점 입니다.");
        } else if (score < 85 && score >= 80) {
            System.out.println("B 학점 입니다.");
        } else if (score < 80 && score >= 75) {
            System.out.println("C+ 학점 입니다.");
        } else if (score < 75 && score >= 70) {
            System.out.println("C 학점 입니다.");
        } else if (score < 70 && score >= 65) {
            System.out.println("D+ 학점 입니다.");
        } else if (score < 65 && score >= 60) {
            System.out.println("D 학점 입니다.");
        } else if (score < 60 && score >= 0) {
            System.out.println("축하합니다! F 학점 입니다.");
        } else {
            System.out.println("정확한 점수를 입력 해 주세요.");
        }
        System.out.println();
    }
    public void checkPlusMinusZero(){
        System.out.println();
        System.out.print("확인 할 정수를 입력 해 주세요 : ");
        int check = sc.nextInt();
        if(check == 0){
            System.out.println("입력한 정수는 0 입니다.");
        }else if(check > 0) {
            System.out.println("입력한 정수는 양수 입니다.");
        }else{
            System.out.println("입력한 정수는 음수 입니다.");
        }
        System.out.println();
    }
    public void whatCharacter(){
        System.out.println();
        System.out.print("확인할 문자를 입력 해 주세요 : ");
        char character = sc.next().charAt(0);
        if(character >= 'A' && character <= 'Z'){
            System.out.println("입력한 문자는 " + character + "로, 영어 대문자 입니다.");
        }else if(character >= 'a' && character <= 'z'){
            System.out.println("입력한 문자는 " + character + "로, 영어 소문자 입니다.");
        }else if(character >= '0' && character <= '9'){
            System.out.println("입력한 문자는 " + character + "로, 숫자문자 입니다.");
        }else{
            System.out.println("입력한 문자는 " + character + "로, 기타 문자입니다.");
        }
        System.out.println();
    }
}
