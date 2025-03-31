package at.fhj.msd;

public class Customer {

    private String name;
    private Address address;
    private String country;

    public Customer(String name, Address address, String country) {
        this.name = name;
        this.address = address;
        this.country = country;
    }

    public String getName() {
        return this.name;
    }

    public Address getAddress() {
        return this.address;
    }

    public String getCountry() {
        return this.country;
    }

    @Override 
    public String toString() {
        return String.format("Name: %s; Address: %s; Country: %s", this.name, this.address, this.country);
    }
   
}
