package homeWorkExercise2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PersonData {
    private Person person;

    public PersonData(Person person) {
        this.person = person;
    }

    public String getFullName() {
        return person.getFirstName() + " " + person.getLastName();
    }

    public byte getAge() {
        return (byte) ChronoUnit.YEARS.between(person.getBirthday(), LocalDate.now());
    }

    public static void main(String[] args) {
        PersonData personData = new PersonData(new Programmer(LocalDate.of(2004, 2, 25)));
        System.out.println(personData.getAge());
        System.out.println(ChronoUnit.YEARS.between(LocalDate.of(2004, 2, 29), LocalDate.of(2005,3,1)));
    }

}
