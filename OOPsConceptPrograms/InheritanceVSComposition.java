/*
 Use inheritance when there's an "is-a" relationship.

Dog is an Animal, Teacher is a Person

Use composition when there's a "has-a" relationship.

Car has an Engine, Library has Books
 */

 //Inheritance
 // Superclass
// class Animal {
//     public void makeSound() {
//         System.out.println("Some generic animal sound");
//     }
// }

// // Subclass
// class Dog extends Animal {
//     @Override
//     public void makeSound() {
//         System.out.println("Woof! Woof!");
//     }
// }

// public class InheritanceExample {
//     public static void main(String[] args) {
//         Animal a = new Dog(); // Upcasting
//         a.makeSound(); // Dynamic method dispatch -> "Woof! Woof!"
//     }
// }


//Incorrect use of Inheritance
/*
 * class Car {
    public void drive() {
        System.out.println("Driving the car...");
    }
}

// This is incorrect
class Engine extends Car {
    // What does an engine have to do with 'drive'?
}

 */


 //Composition
//  class Engine {
//     public void start() {
//         System.out.println("Engine starting...");
//     }
// }

// class Car {
//     private Engine engine;

//     public Car() {
//         this.engine = new Engine(); // Composition
//     }

//     public void startCar() {
//         engine.start();
//         System.out.println("Car is ready to go!");
//     }
// }

// public class CompositionExample {
//     public static void main(String[] args) {
//         Car myCar = new Car();
//         myCar.startCar();
//     }
// }
