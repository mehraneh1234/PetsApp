
package petsapp;
/**
 * Mehraneh Hamedani - 30062786
 * AT3 - Activity3 - Demonstrate polymorphism
 */
public class Cat extends Pet{ // Cat class is a subclass of Pet class
    // Define variables which are inherited from Pet super class
    int catId = petId;
    String catName = petName;
    int catAge = petAge;
    String catToy = petFavoriteToy;
    // Define meow method
    public void meow(){
        // Display Meow Meow
        System.out.println("Meow Meow");
    }
    
}
