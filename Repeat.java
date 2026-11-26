import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { //반복 (참일때)
            System.out.print("1아이스티 / 0 종료: ");
            int menu = sc.nextInt();
            if(menu == 0){
                break; //멈춤 (자신을 둘러싼 가장 가까운 반복문 종료)
            } else {
                System.out.println("아이스티가 주문되었습니다.");
            }
        }
        sc.close();
    }
}
