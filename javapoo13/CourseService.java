package javapoo13;

import java.util.Scanner;

public class CourseService {
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static String[] updateStudents() {
        String[] nameStudents = new String[Course.getNumStudents()];
        for (int i = 0; i < nameStudents.length; i++) {
            System.out.println("Ingrese el nombre del alumno no. " + (i + 1) + " :");
            nameStudents[i] = sc.next();
        }
        return nameStudents;
    }

    public static Course makeCourse() {
        System.out.println("Ingrese el nombre del curso: ");
        String courseName = sc.next();

        System.out.println("Ingrese la cantidad de horas por día del curso: ");
        int hoursPerDay = sc.nextInt();

        System.out.println("Ingrese la cantidad de dias por semana del curso: ");
        int hoursPerWeek = sc.nextInt();

        String shift;
        while (true) {
            System.out.println("Ingrese el turno del curso [MAÑANA / TARDE]: ");
            shift = sc.next();
            if (shift.toUpperCase().equals("MAÑANA") || shift.toUpperCase().equals("TARDE")) {
                shift = shift.toUpperCase();
                break;
            }
            else
                System.out.println("El turno no es valido");
        }

        System.out.println("Precio por hora del curso: ");
        float pricePerHour = sc.nextFloat();

        return new Course(courseName, hoursPerDay, hoursPerWeek, shift, pricePerHour, updateStudents());
    }

    public static void showWeeklyProfit(Course course) {
        System.out.println("Ganacia semanal: " + course.calculateWeeklyProfit());
    }
}
