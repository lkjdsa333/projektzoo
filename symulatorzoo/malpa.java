public class Malpa extends Animal implements Feedable {

    public Malpa(String name, int age) {
        super(name, age, "Malpa");
    }

    @Override
    public void feed() {
        System.out.println(name + " Malpa jest karmiona orzechami i bananami.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Malpa: " + name + ", Age: " + age);
    }
}
