import java.util.Scanner;

public class Rps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computer = 0;
        System.out.println("0 바위/ 1가위 / 2보: ");
        int player = sc.nextInt();
        if(computer == player){
            System.out.println("무승부");
        }else if(player == 1){
            System.out.println("패배...");
        }else if(player == 2){
            System.out.println("승리!!");
        }else {
            System.out.println("잘못된 선택!");
        }
        sc.close();

    }
}
