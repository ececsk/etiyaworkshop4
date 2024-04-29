class Lion implements Animal {
    private String name;

    public Lion(String name) {
        this.name = name;
    }

 @Override
    public void makeSound() {
        System.out.println(name + " the lion roars!");
    }

    @Override
    public void eat() {
        System.out.println(name + " the lion is eating.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " the lion is sleeping.");
    }

    public void hunt() {
        System.out.println(name + " the lion is hunting.");
    }
}