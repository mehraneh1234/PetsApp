
package petsapp;

/**
 * Mehraneh Hamedani - 30062786
 * AT3 - Activity3 - Demonstrate polymorphism
 */
public class Pet { // Define a super class
    // Define variables
    int petId;
    String petName;
    int petAge;
    // Create an object of toy class
    Toy t = new Toy();
    // Assign the toy name from toy class to a string variable
    String petFavoriteToy = t.toyName;
    // Define speak method
    public void speak(){
        // Display Pet speaks
        System.out.println("Pet speaks");
    }
}
