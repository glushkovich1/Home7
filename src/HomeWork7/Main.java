package HomeWork7;

public class Main {

    public static void main(String[] args) {
        System.out.println("Cats List: ");
        Cat[] x = {new Cat("Barsik", 8), new Cat("Marsik", 4), new Cat("Boris", 16)};
        Plate plate = new Plate(100);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("***********************************************");
        System.out.println("increase food by 100");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println("***********************************************");
        System.out.println("Cats take food:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);

        }
    }
}