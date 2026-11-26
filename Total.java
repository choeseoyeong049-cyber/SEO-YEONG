import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while (true) { //반복 (참일때)
            System.out.print("1아이스티 / 2초코라뗴 / 0 종료: ");
            int menu = sc.nextInt();
            if(menu == 0){
                break; //멈춤 (자신을 둘러싼 가장 가까운 반복문 종료)
            } else if(menu == 1) {
                total += 4000;
            }  else if(menu == 2){
                total += 3000;
            }
        }
        System.out.println("아이스티가 주문되었습니다. (총 금액: " + total + ")" );
        sc.close();
    }
}