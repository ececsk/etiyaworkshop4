class Elephant implements Animal {
    private String name;

    public Elephant(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the elephant trumpets!");
    }

    @Override
    public void eat() {
        System.out.println(name + " the elephant is eating.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " the elephant is sleeping.");
    }
}