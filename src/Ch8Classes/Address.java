package Ch8Classes;

public class Address {
  private int housenum;
    private String aptnum;
    private String street;
    private String city;
    private String state;
    private int zipcode;

    public Address(int housenum, String street, String city, String state, int zipcode) {
        this.housenum = housenum;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;

    }

}
