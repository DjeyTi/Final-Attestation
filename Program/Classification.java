class Classification {
    public static void main(String[] args) {
        Cat Barsik = new Cat("Барсик", "28.01.2021");
        Barsik.Affection();
    }
}

interface Create();

abstract class Animal implements Create {
    private String name;
    private String DoB;

    public void setName(String name) {
        this.name = name;        
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }

    public String getName() {
        return name;
    }

    public String getDoB() {
        return DoB;
    }
}

abstract class HouseAnimal extends Animal {
    public void Affection() {
        System.out.println(getName() + " проявляет ласку!");
    }
}

class Cat extends HouseAnimal {
    public Cat(String name, String DoB) {
        setName(name);
        setDoB(DoB);
    }

    @Override
    public Cat Create(String name, String DoB) {
        Cat name = new Cat(String name, String DoB)
        return name;
    }

    private void Purr() {
        System.out.println(getName() + " мурлычит!");
    }
}

class Dog extends HouseAnimal {
    public Dog(String name, String DoB) {
        setName(name);
        setDoB(DoB);
    }

    private void Guard() {
        System.out.println(getName() + " охраняет собственность!");
    }
}

class Hamster extends HouseAnimal {
    public Hamster(String name, String DoB) {
        setName(name);
        setDoB(DoB);
    }

    private void Eat() {
        System.out.println(getName() + " ест!");
    }
}

abstract class PackAnimal extends Animal {
    private void Work() {
        System.out.println(getName() + " работает!");
    }
}

class Horse extends PackAnimal {
    public Horse(String name, String DoB) {
        setName(name);
        setDoB(DoB);
    }

    private void Run() {
        System.out.println(getName() + " скачет!");
    }
}

class Donkey extends PackAnimal {
    public Donkey(String name, String DoB) {
        setName(name);
        setDoB(DoB);
    }

    private void Move() {
        System.out.println(getName() + " переносит груз!");
    }
}

class Camel extends PackAnimal {
    public Camel(String name, String DoB) {
        setName(name);
        setDoB(DoB);
    }

    private void Drink() {
        System.out.println(getName() + " пьёт воду!");
    }
}