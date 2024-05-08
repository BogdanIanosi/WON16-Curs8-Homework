package homeWorkExercise2;

import java.time.LocalDate;

public class Programmer extends Employee {
    private final String language;

    public Programmer(LocalDate birthday) {
        super(birthday);
        this.language = "Default";
    }

    public Programmer(LocalDate birthday, String language) {
        super(birthday);
        this.language = language;
    }

    @Override
    public String getPosition() {
        return "programmer";
    }

    public String getLanguage() {
        return language;
    }

}
