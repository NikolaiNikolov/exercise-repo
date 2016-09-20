package p04_BackToThePast;
import java.text.DecimalFormat;
import java.util.Scanner;
public class BackToThePast {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double money = Double.parseDouble(console.nextLine());
        int year = Integer.parseInt(console.nextLine());
        DecimalFormat df = new DecimalFormat("#.##");
        int age = 18;
        double budget = money;
        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                budget -= 12000;
            } else {
                budget -= 12000 + 50 * age;
            }
            age++;
        }
        if (budget >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", budget);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", budget - budget - budget);
        }
    }
}
