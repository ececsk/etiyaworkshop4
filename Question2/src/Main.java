 public class Main {
    public static void main(String[] args) {
        //2-) Polymorphism örneği
        Pet hayvan1 = new Dog();
        Pet hayvan2 = new Cat();
        Pet hayvan3 = new Bird();


        hayvan1.makeSound();
        hayvan2.makeSound();
        hayvan3.makeSound();
    }
}
