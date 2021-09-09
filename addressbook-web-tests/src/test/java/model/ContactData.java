package model;

public class ContactData {
    private final String name;
    private final String surname;
    private final String address;
    private final String phone;
    private final String email;
    private final String bday;
    private final String bmonth;
    private final String byear;

    public ContactData(String name, String surname, String address, String phone, String email, String bday, String bmonth, String byear) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getBday() {
        return bday;
    }

    public String getBmonth() {
        return bmonth;
    }

    public String getByear() {
        return byear;
    }
}
