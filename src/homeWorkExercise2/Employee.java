package homeWorkExercise2;

import java.time.LocalDate;

public class Employee implements Person{
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String address;
    private LocalDate dateOfEmployment;
    private String position;

    public Employee(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
