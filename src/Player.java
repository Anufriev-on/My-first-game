import java.util.Scanner;


public class Player {

    String playerName;
    int playerHealth = 0;
    int playerGold = 0;
    int playerAgility = 0;
    int playerSkill = 0;
    int playerForce = 0;

    public void player() {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите имя героя");
        playerName = sc1.nextLine();

        boolean validInput = false;
        while (!validInput) {
            try {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Введите здоровье героя");
                playerHealth = sc2.nextInt();
                validInput = true;
            }
            catch (Exception e) {
                System.out.println("Введите целое число");
            }
        }

        validInput = false;
        while (!validInput) {
            try {
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Введите количество золота у героя");
                playerGold = sc3.nextInt();
                validInput = true;
            }
            catch (Exception e) {
                System.out.println("Введите целое число");
            }
        }

        validInput = false;
        while (!validInput) {
            try {
                Scanner sc4 = new Scanner(System.in);
                System.out.println("Введите ловкость героя");
                playerAgility = sc4.nextInt();
                validInput = true;
            }
            catch (Exception e) {
                System.out.println("Введите целое число");
            }
        }

        validInput = false;
        while (!validInput) {
            try {
                Scanner sc5 = new Scanner(System.in);
                System.out.println("Введите опыт героя");
                playerSkill = sc5.nextInt();
                validInput = true;
            }
            catch (Exception e) {
                System.out.println("Введите целое число");
            }
        }

        validInput = false;
        while (!validInput) {
            try {
                Scanner sc6 = new Scanner(System.in);
                System.out.println("Введите силу героя");
                playerForce = sc6.nextInt();
                validInput = true;
            }
            catch (Exception e) {
                System.out.println("Введите целое число");
            }
        }

        System.out.println("Герой создан ");
        System.out.println("Имя      " + playerName);
        System.out.println("Здоровье " + playerHealth);
        System.out.println("Золото   " + playerGold);
        System.out.println("Ловкость " + playerAgility);
        System.out.println("Опыт     " + playerSkill);
        System.out.println("Сила     " + playerForce);
    }
}
