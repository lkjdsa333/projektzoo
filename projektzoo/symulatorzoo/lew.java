public class Lew extends Animal implements Feedable {

    public Lew(String name, int age) {
        super(name, age, "Lew");
    }

    @Override
    public void feed() {
        System.out.println(name + " lew jest karmiony surowym miesem.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Lew: " + name + ", Age: " + age);
    }
}
