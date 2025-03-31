package at.fhj.msd;


public class App {
    public static void main(String[] args) {
        
        Customer c1 = new Customer("Umejr Dzinovic", "Algersdorfer Straße 53", "Austria");
        System.out.printf("Name: %s; Address: %s, Country: %s", c1.getName(), c1.getAddress(), c1.getCountry());


    }
}
