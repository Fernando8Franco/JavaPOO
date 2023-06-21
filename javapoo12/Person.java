package javapoo12;

import java.util.Date;

public class Person {
    private String name;
    private Date birth_day;

    public Person(String name, int year, int month, int day) {
        this.name = name;
        this.birth_day = new Date(year - 1900, month - 1, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(int year, int month, int day) {
        this.birth_day = new Date(year - 1900, month - 1, day);
    }

    public int getBirthYear() {
        return birth_day.getYear();
    }

    public static int getActualYear() {
        return new Date().getYear();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birth_day=" + birth_day +
                '}';
    }
}
