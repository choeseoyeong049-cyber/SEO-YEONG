import java.util.Scanner;

public class Ask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름: ");
        String name = sc.nextLine();
        System.out.println(name + "레벨: ");
        int level = sc.nextInt();
        System.out.println(name + " 레벨 " + level);
        sc.close();
    }
}
