
package petsapp;

/**
 * Mehraneh Hamedani - 30062786
 * AT3 - Activity3 - Demonstrate polymorphism
 */
public class Dog extends Pet{ // Dog class is a subclass of Pet class
    // Define variables which are inherited from the super class Pet
    
    int dogId = petId;
    String dogName = petName;
    int dogAge = petAge;
    String dogToy = petFavoriteToy;
    // Define bark method
    public void bark(){
        // Display Woof Woof
        System.out.println("Woof Woof");
    }
    
}
