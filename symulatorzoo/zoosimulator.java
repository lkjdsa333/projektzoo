public class ZooSimulator {
    public static void main(String[] args) {
        Feedable[] animals = {
            new Lion("Simba", 5),
            new Elephant("Slon", 10),
            new Monkey("Szympans", 3)
        };

        System.out.println("=== Plan Karmienia ===");
        for (Feedable animal : animals) {
            if (animal instanceof Animal) {
                ((Animal) animal).displayInfo();
            }
            animal.feed();
            System.out.println();
        }
    }
}
