// Polymorphism Example: Animal Sounds

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Moo");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();  
        a.makeSound();   // Woof

        a = new Cat();   
        a.makeSound();   // Meow

        a = new Cow();   
        a.makeSound();   // Moo
    }
}
