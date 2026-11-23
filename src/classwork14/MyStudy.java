package classwork14;

import java.util.ArrayList;
import java.util.List;

public class MyStudy {
    private List<Course> courses;

    public MyStudy() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public double getAverageScore() {
        if (courses.isEmpty()) return 0.0;
        double sum = 0;
        for (Course c : courses) {
            sum += c.getAverageScore();
        }
        return sum / courses.size();
    }

    public void print() {
        System.out.println("My Study Dashboard");
        System.out.println("Overall Average Score: " + getAverageScore());
        System.out.println("Courses:");
        for (Course c : courses) {
            c.print();
        }
    }
}