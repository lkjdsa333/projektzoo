public class ZooSimulator {
    public static void main(String[] args) {
        Feedable[] animals = {
            new Lew("Simba", 5),
            new Slon("Slon", 10),
            new Malpa("Szympans", 3)
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
