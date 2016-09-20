package p03_MatchTickets;
import java.util.Scanner;
public class MatchTickets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String category = console.nextLine();
        int people = Integer.parseInt(console.nextLine());
        double transportPrice = 1;
        if (people == 1 || people <= 4) {
            transportPrice = budget * 0.75;
        } else if (people >= 5 && people <= 9) {
            transportPrice = budget * 0.60;
        } else if (people >= 10 && people <= 24) {
            transportPrice = budget * 0.50;
        } else if (people >= 25 && people <= 49) {
            transportPrice = budget * 0.40;
        } else if (people >= 50) {
            transportPrice = budget * 0.25;
        }
        double moneyLeft = budget - transportPrice;
        if (category.equalsIgnoreCase("VIP")) {
            if (moneyLeft >= (499.99 * people)) {
                System.out.printf("Yes! You have %.2f euro left.", moneyLeft - 499.99 * people);
            } else if (moneyLeft <= 499.99 * people) {
                System.out.printf("Money not enough! You need %.2f leva.", 499.99 * people - moneyLeft);
            }
        } else if (category.equalsIgnoreCase("Normal")) {
            if (moneyLeft >= (249.99 * people)) {
                System.out.printf("Yes! You have %.2f euro left.", moneyLeft - 249.99 * people);
            } else if (moneyLeft <= 249.99 * people) {
                System.out.printf("Not enough money! You need %.2f euro.", 249.99 * people - moneyLeft);
            }
        }

    }
}
