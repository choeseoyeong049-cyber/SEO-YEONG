import java.util.Scanner;

public class UpDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int)(Math.random()*99)+1;
        int tries = 0; // 시도 횟수
        System.out.println("1부터 99까지의 숫자를 맞춰보세요");
        while(true){
            System.out.println("내 예상 : ");
            int guess = sc.nextInt(); //추측한 값
            tries++; // 시도횟수
        if(answer == guess){
            System.out.println("DOWN");
            System.out.println("시도 횟수: " + tries);
            break;
        }else if(answer > guess){
            System.out.println("Up");
        }else if(answer < guess){
            System.out.println("Donw");
        }else if(guess > 99) {
            System.out.println("잘못입력하셨습니다.");
            break;
        }
        }
    }
}