package at.fhj.msd;

public class Address {

    private String street;
    private String place;
    private String houseNumber;
    private String zipCode;
    private String floor;
    private String doorNumber;

    public Address(String street, String place, String houseNumber, String zipCode, String floor, String doorNumber) {
        this.street = street;
        this.place = place;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.floor = floor;
        this.doorNumber = doorNumber;
    }

    @Override 
    public String toString() {
        return String.format("Street: %s; Place: %s; House-number: %s; Zip-Code: %s; floor: %s; doornumber: %s;", 
            this.street, this.place, this.houseNumber, this.zipCode, this.floor, this.doorNumber);
    }


    
}
