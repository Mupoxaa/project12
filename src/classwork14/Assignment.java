package classwork14;

public class Assignment {
    private String name;
    private double grade;

    public Assignment(String name) {
        this.name = name;
        this.grade = 0.0;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void print() {
        System.out.println("    - Assignment: " + name + " | Grade: " + grade);
    }
}
