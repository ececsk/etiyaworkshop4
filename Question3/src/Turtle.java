class Turtle implements Animal {
    private String name;

    public Turtle(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the turtle makes a hissing sound.");
    }

    @Override
    public void eat() {
        System.out.println(name + " the turtle is eating lettuce.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " the turtle is basking in the sun.");
    }
}
