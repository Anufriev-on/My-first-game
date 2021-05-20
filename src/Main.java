import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        System.out.println("Куда вы хотите пойти?");
        System.out.println("1 - к торговцу");
        System.out.println("2 - в темный лес");
        System.out.println("3 - на выход");

        while ( (choice != 1 && choice != 2 && choice != 3)) {

            if(scanner.hasNextInt()) {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1: System.out.println("Тоговец в отпуске. Попробуйте еще раз...");
                        break;
                    case 2:


                        Battle battle1 = new Battle("Битва");
                        battle1.start();

                        while (battle1.isAlive()) {
                            try {
                                Thread.sleep(25000);
                              } catch (InterruptedException e) {
                            }
                        }
                        try {
                            battle1.join();
                        } catch (InterruptedException e) {

                        }

                        break;
                    case 3:
                        break;

                    default: System.out.println("Ввод некорректен. Попробуйте еще раз...");
                        break;
                }
            }
            else {
                System.out.println("Ввод вообще некорректен. Попробуйте еще раз...");
                scanner.next();
            }
        }
        scanner.close();
   }
}
