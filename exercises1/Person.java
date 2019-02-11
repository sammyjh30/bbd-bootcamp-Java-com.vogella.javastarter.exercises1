package exercises1;
// Creating a package means make a folder and put the files in that folder.

public class Person {
    String firstName;
    String lastName;
    int age;
    private Address address;

    public Person() {
        firstName = "Tony";
        lastName = "Stark";
        age = 53;
    }

    public Person(String a, String b, int num) {
        firstName = a;
        lastName = b;
        age = num;
    }

    @Override
    public String toString() {
        // TODO replace "" with the following:
        // firstName + " " + lastName
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newName) {
        this.firstName = newName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newName) {
        this.lastName = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address newAddress) {
        this.address = newAddress;
    }

}