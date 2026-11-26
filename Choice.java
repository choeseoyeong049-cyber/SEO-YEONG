import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hp = 90;
        System.out.println("1 공격/ 2회복: ");
        int action = sc.nextInt();
        if (action == 1){
            System.out.println("몬스터 공격!");
        } else if (action == 2){
            hp += 35;
        if (hp > 100) {
            hp = 100;
        }
            System.out.println("체력 회복 HP: "+hp);
        }
        sc.close();
    }
}