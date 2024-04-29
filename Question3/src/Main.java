//3-) interface yapısına uygun örnek yapınız.
public class Main {
    public static void main(String[] args) {

        Animal lion = new Lion("Simba");

        System.out.println("--- Lion ---");
        lion.makeSound();
        lion.eat();
        lion.sleep();

        Animal elephant = new Elephant("Bambu");
        System.out.println("--- Elephant ---");
        elephant.makeSound();
        elephant.eat();
        elephant.sleep();

        Animal turtle = new Turtle("Shelly");
        System.out.println("--- Turtle ---");
        turtle.makeSound();
        turtle.eat();
        turtle.sleep();
    }
}