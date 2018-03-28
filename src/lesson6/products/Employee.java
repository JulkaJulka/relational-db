package lesson6.products;

import java.util.Date;

/**
 * Created by user on 29.03.2018.
 */
public class Employee {
    private long employeeId;
    private String lastName;
    private String firstName;
    private String title;
    private String titleOfCourtsey;
    private Date birthDate;
    private Date hireDate;
    private String address;
    private String city;
    private String region;
    private int postalCode;
    private String country;
    private String homePhone;
    private String extension;
    private String photo;
    private String notes;
    private String reportsTo;

    public Employee(long employeeId, String lastName, String firstName, String title, String titleOfCourtsey,
                    Date birthDate, Date hireDate, String address, String city, String region, int postalCode,
                    String country, String homePhone, String extension, String photo, String notes, String reportsTo) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
        this.titleOfCourtsey = titleOfCourtsey;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.homePhone = homePhone;
        this.extension = extension;
        this.photo = photo;
        this.notes = notes;
        this.reportsTo = reportsTo;
    }
}
