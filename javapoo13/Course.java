package javapoo13;

import java.util.Arrays;

public class Course {
    private String courseName;
    private int hoursPerDay;
    private int daysPerWeek;
    private String shift;
    private float pricePerHour;
    private String[] students;
    private static final int numStudents = 5;

    public Course(String courseName, int hoursPerDay, int daysPerWeek, String shift, float pricePerHour, String[] students) {
        this.courseName = courseName;
        this.hoursPerDay = hoursPerDay;
        this.daysPerWeek = daysPerWeek;
        this.shift = shift;
        this.pricePerHour = pricePerHour;
        this.students = Arrays.copyOf(students, students.length);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(int hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public int getDaysPerWeek() {
        return daysPerWeek;
    }

    public void setDaysPerWeek(int hoursPerWeek) {
        this.daysPerWeek = hoursPerWeek;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public float getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public String[] getStudents() {
        return students;
    }

    public static int getNumStudents() {
        return numStudents;
    }

    public void setStudentsName(String name, int numberStudent) {
        this.students[numberStudent] = name;
    }

    public float calculateWeeklyProfit() {
        float profit = (hoursPerDay * daysPerWeek * pricePerHour * numStudents);
        return profit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", hoursPerDay=" + hoursPerDay +
                ", hoursPerWeek=" + daysPerWeek +
                ", shift='" + shift + '\'' +
                ", pricePerHour=" + pricePerHour +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
