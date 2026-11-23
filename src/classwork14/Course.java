package classwork14;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String code;
    private List<Assignment> assignments;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public double getAverageScore() {
        if (assignments.isEmpty()) return 0.0;
        double sum = 0;
        for (Assignment a : assignments) {
            sum += a.getGrade();
        }
        return sum / assignments.size();
    }

    public void print() {
        System.out.println("  Course: " + name + " (" + code + ") | Average: " + getAverageScore());
        for (Assignment a : assignments) {
            a.print();
        }
    }
}