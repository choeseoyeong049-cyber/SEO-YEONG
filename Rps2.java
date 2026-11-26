import java.util.Scanner;
public class Rps2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("선택 (0:가위, 1:바위, 2:보: ");
        int computer = (int)(Math.random()*3);
        int player = sc.nextInt();
        if (player < 0 || player > 2) {
            System.out.println("잘못된 입력입니다");
        } else if (computer == player) {
            System.out.println("무승부!");
        } else if ((player == 0 && computer == 1) || 
            (player == 1 && computer == 2) ||
            (player == 2 && computer == 0)) {
                System.out.println("승리!");
            } else {
                System.out.println("패배!");
            }
        }
    } 

