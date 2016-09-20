package p02_Harvest;
import java.util.Scanner;
public class Harvest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = Integer.parseInt(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        int z = Integer.parseInt(console.nextLine());
        int workers = Integer.parseInt(console.nextLine());
        double sumGrapes = x * y;
        double wine = (sumGrapes * 0.40) / 2.5;
        if (wine >= z) {
            System.out.printf("Good harvest this year! Total wine: %d liters.%n", (int)(wine));
            double result1 = (Math.ceil(wine - z));
            System.out.printf("%d liters left -> %d liters per person.", (int)result1, (int)(Math.ceil((wine - z) / workers)));
        } else if (wine < z) {
            System.out.printf("It will be a really tough winter! We need more %d liters wine needed.", (int)(z - wine));
        }
    }
}
