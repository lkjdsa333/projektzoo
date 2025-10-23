public class Slon extends Animal implements Feedable {

    public Slon(String name, int age) {
        super(name, age, "Slon");
    }

    @Override
    public void feed() {
        System.out.println(name + " Slon jest karmiony warzywami i owocami.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Slon: " + name + ", Age: " + age);
    }
}
