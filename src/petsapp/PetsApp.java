
package petsapp;
/**
 * Mehraneh Hamedani - 30062786
 * AT3 - Activity3 - Demonstrate polymorphism
 */
public class PetsApp {

    public static void main(String[] args) {
        // Pet variable "p" is declared
        Pet p;
        // Assign a Pet instance
        p = new Pet();
        // Display "Pet"
        System.out.println("Pet:");
        // Call speak method in Pet class
        p.speak();
        // Print a blank line
        System.out.println();
        // Assign a dog instance with polymorphism
        p = new Dog();
        // Display "Dog"
        System.out.println("Dog:");
        // Call speak method in Pet class
        p.speak();
        // cast to dog class to call bark method
        ((Dog)p).bark();
        System.out.println();
        // Assign a cat instance with polymorphism
        p = new Cat();
        // Display Cat
        System.out.println("Cat:");
        // Call speak method in Pet class
        p.speak();
        // cast to cat class to call meow method
        ((Cat)p).meow();
        
    }
    
}
