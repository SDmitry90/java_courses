package by.itacademy.java.dserbunou.classroom.xmlmarshalling.task;

public class Shipto {
    private String name;
    private String address;
    private String city;
    private String country;

    public Shipto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ShipTo{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", city='" + city + '\''
                + ", country='" + country + '\'' + '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
