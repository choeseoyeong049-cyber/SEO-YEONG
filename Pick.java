import java.util.Scanner;

public class Pick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = "초코라뗴"; 
        int price = 3000;

        String menu2 = "딸기라뗴";
        int price2 = 4000;

        System.out.println("1 " + menu + " / " + price + "원");
        System.out.println("2 " + menu2 + " / " + price2 + "원");

        int Choice = sc.nextInt();

        if (Choice == 1){
            System.out.println(menu + "를 선텍했습니다");
            System.out.println("가격: " + price + "원");

        } else if (Choice == 2) {
            System.out.println(menu2 + "를 선텍했습니다");
            System.out.println("가격: " + price2 + "원");
        }

        sc.close();
    }
}