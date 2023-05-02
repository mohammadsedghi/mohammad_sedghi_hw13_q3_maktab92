public class Address {
    String city;
    int zone;
    String street;
    String postalCode;

    public String getCity() {
        return city;
    }

    public int getZone() {
        return zone;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Address(String city, int zone, String street, String postalCode) {
        this.city = city;
        this.zone = zone;
        this.street = street;
        this.postalCode = postalCode;
    }
}
