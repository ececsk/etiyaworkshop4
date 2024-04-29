class Cat extends Pet {
    // Hayvan sınıfından miras alınan sesCikar() metodunu ezme (override)
    @Override
    public void makeSound() {
        System.out.println("Miyav!");
    }
}