class Animals {
    String name;
    int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println(name + " is Sleeping");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animals {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);// pass Value to parent class 
        this.breed = breed;
    }

    public void getBreed() {
        System.out.print(breed);
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

class Main {
    public static void main(String[] args) {
        Dog Av_dog = new Dog("Bruno", 2, "golden retriever");
        System.out.println(Av_dog.getName()); 
    }
}
