public class Monster {

    String monsterName;
    int monsterHealth;
    int monsterGold;
    int monsterAgility;
    int monsterSkill;
    int monsterForce;

    public Monster (String monsterName, int monsterHealth, int monsterGold, int monsterAgility, int monsterSkill, int monsterForce){
        this.monsterName = monsterName;
        this.monsterHealth = monsterHealth;
        this.monsterGold = monsterGold;
        this.monsterAgility = monsterAgility;
        this.monsterSkill = monsterSkill;
        this.monsterForce = monsterForce;
    }

    public void monster() {
        Monster skeleton = new Monster("Skeleton", 500, 20, 30, 40, 50);
        Monster gonblin = new Monster("Goblin", 1000, 50, 40, 30, 20);

    }
}
