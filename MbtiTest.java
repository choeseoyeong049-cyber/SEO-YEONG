import java.util.Scanner;

public class MbtiTest {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String mbti = "";
            System.out.println("재미로 하는 4문항 성향 테스트");
            System.out.println("각 문항의 1또는 2를 입력하세요");
            System.out.println("[Q1] 약속이 취소되면");
            System.out.println("1. 친구를 더 만나고 싶다 / 2. 혼자쉬고싶다");
            int Q1 = sc.nextInt();
            if (Q1==1) {
                mbti += "E";
            } else if (Q1==2) {
                mbti += "I";
            }
            System.out.println("[Q2] 사과하면 떠올는 건?");
            System.out.println("1. 빨간 과일 / 2. 백설공주나 뉴턴");
            int q2 = sc.nextInt();
            if (q2==1) {
                mbti += "S"; // mbti = mbti + "S"
            } else if (q2==2) {
                mbti += "N";
            }
            System.out.println("[Q3] 친구가 시험을 망쳤다면?");
            System.out.println("1. 해결 방법을 생각한다 / 2. 먼저 위로한다");
            int q3 = sc.nextInt();
            if (q3==1) {
                mbti += "T";
            } else if (q3==2){
                mbti += "F";
            } 
                System.out.println("[Q4] 친구와 여행을 간다면?");
            System.out.println("1. 일정을 짠다 / 2. 즉흥적으로 다닌다");
            int q4 = sc.nextInt();
            if (q4==1) {
                mbti += "J";
            } else if (q4==2){
                 mbti += "P";
            }
            
            System.out.println("당신의 mbti는"+ mbti);
 
    }  
}
        
            