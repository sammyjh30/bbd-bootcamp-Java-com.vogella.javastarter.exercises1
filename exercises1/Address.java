package exercises1;
// Creating a package means make a folder and put the files in that folder.

public class Address {
    
    private String street;
    private String number;
    private String postalcode;
    private String city;
    private String country;
    
    @Override
    public String toString() {
        return number + " " + street + " " 
                + postalcode + " " + city + " " + country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String newStreet) {
        this.street = newStreet;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String newNumber) {
        this.number = newNumber;
    }

    public String getPostalcode() {
        return street;
    }

    public void setPostalcode(String newPostalcode) {
        this.postalcode = newPostalcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String newCity) {
        this.city = newCity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String newCountry) {
        this.country = newCountry;
    }
}