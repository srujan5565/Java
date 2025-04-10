interface NoiseCapable{
    void makeNoise();
}
abstract class Animal{
    String name;
    Animal(String name){
        this.name=name;   
    }
    abstract void eat();
    abstract void sleep();
    String getName(){
        return this.name;
    }
}
class Dog extends Animal implements NoiseCapable{
    Dog(){
        this("Dog");
    }
    Dog(String name) {
        super(name);
    }
    void eat(){
        System.out.println(this.name+" Eats");
    }
    void sleep(){
        System.out.println(this.name+" Sleeps");
    }
    void bark(){
        System.out.println(this.name+ " barks");
    }
    public void makeNoise(){
        bark();
    }
}
class Cat extends Animal implements NoiseCapable{
    Cat(){
        this("Cat");
    }
    Cat(String name) {
        super(name);
    }
    void eat(){
        System.out.println(this.name+" Eats");
    }
    void sleep(){
        System.out.println(this.name+" Sleeps");
    }
    void purr(){
        System.out.println(this.name+ " Purrs");
    }
    public void makeNoise(){
        purr();
    }
}
public class AbstractAnimal {
    public static void main(String[] args) {
//         Dog dog = new Dog();
// dog.bark();
// dog.eat();

// Dog fido = new Dog("Fido");
// fido.bark();
// Cat cat = new Cat();
// cat.purr();
// cat.eat();

// Cat garfield = new Cat("Garfield");
// garfield.purr();
NoiseCapable dog = new Dog();
dog.makeNoise();

NoiseCapable cat = new Cat("Garfield");
cat.makeNoise();
Cat c = (Cat) cat;
c.purr();
    }
}
