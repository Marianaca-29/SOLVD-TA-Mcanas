package homework2;

public class Customer {


    // fields
    private String name;
    private String lastname;
    private int idCostumer;
    
    //Constructor

    public Customer(String name, String lastname, int idCostumer) {
        this.name = name;
        this.lastname = lastname;
        this.idCostumer = idCostumer;
    }

    public void showCustomerDetails() {
        System.out.println("client name: " + name + " " + lastname + " " + "Customer ID: " + idCostumer);
    }

}
