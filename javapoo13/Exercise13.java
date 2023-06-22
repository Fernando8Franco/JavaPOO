package javapoo13;

public class Exercise13 {
    public static void main(String[] args) {
        Course course1 = CourseService.makeCourse();

        System.out.println(course1);
        CourseService.showWeeklyProfit(course1);
    }
}
