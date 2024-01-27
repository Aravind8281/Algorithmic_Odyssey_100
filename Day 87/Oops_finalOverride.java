class Animal {
    final void makeSound() {
        System.out.println("Some generic sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof, woof!");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow, meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat(); 
        dog.makeSound();
        cat.makeSound();
    }
}
