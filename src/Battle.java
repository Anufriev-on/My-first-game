import  java.util.Random;

public class Battle extends Thread{
    boolean livePlayer = true;
    boolean liveMonster = true;
    int udar = 0;

    public Battle(String name) {
        super(name);
    }
    @Override
    public void run() {

        Player player1 = new Player();
        player1.player();

        Monster skeleton = new Monster("Skeleton", 500, 20, 30, 40, 50);

        while (livePlayer == true && liveMonster == true) {

            System.out.println("Здоровье героя  = " + player1.playerHealth);
            System.out.println("Здоровье монстра  = " + skeleton.monsterHealth);

            Random random = new Random();
            udar = random.nextInt(100);
            if (player1.playerAgility*3 > udar) {

                player1.playerHealth -= skeleton.monsterForce;
                if (player1.playerHealth < 0) {
                    livePlayer = false;
                    System.out.println("Герой убит");
                }
            } else System.out.println("Герой промахнулся");
            skeleton.monsterHealth -= player1.playerForce;


            if (skeleton.monsterHealth < 0) {
                    liveMonster = false;
                    System.out.println("Монстр убит");
                    player1.playerSkill += skeleton.monsterSkill;
                    player1.playerGold += skeleton.monsterGold;

                }

        }
    }

}
