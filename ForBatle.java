public class ForBatle {
    public static void main(String[] args) {
        int monsterHp = 100;
        int damage = 20;
        for(int i =1; i <= 3; i++){
            monsterHp -= damage;
            System.out.println(i+ "번째 공격 후 HP: " + monsterHp);
        }
        System.out.println("전투 종료, 남은 체력: " + monsterHp);
    }
}
