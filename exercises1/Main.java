package exercises1;
// Creating a package means make a folder and put the files in that folder.


//To run:
//1) get out of the package (cd ..)
//2) run javac exercises1\*.java     to compile all the files
//3) run java exercises1.Main       to run the program

public class Main {

    // Java only capitalises classes, not methods
    
    public static void main(String[] args) {
        Person pers1 = new Person();
        Person pers2 = new Person("Kim", "Possible", 22);

        //  this calls the toString method on the pers object
         System.out.println(pers1);
         System.out.println(pers2);
         pers2.setFirstName("Ron");
         pers2.setLastName("Stoppable");
         System.out.println(pers2);

         // Creating address
         Address address = new Address();
         //set the values
         address.setNumber("24");
         address.setStreet("Random Road");
         address.setPostalcode("2468");
         address.setCity("The City of Dreams");
         address.setCountry("Somewhere that isn't falling apart");

        // assign the address to the person
         pers2.setAddress(address);
        // dispose reference to address object
        address = null;
        System.out.println(pers2.getAddress());
        // person is moving to the next house in the same street
        pers2.getAddress().setNumber("105");
        System.out.println(pers2.getAddress());
    }
}