package classwork14;

public class App {
    public static void main(String[] args) {
        MyStudy myStudy = new MyStudy();

        Course javaCourse = new Course("Java Programming", "SD100");
        Course mathCourse = new Course("Calculus", "SDT150");
        Course math2Course = new Course("Applied math", "SDT151");

        Assignment java1 = new Assignment("Project 10");
        java1.setGrade(95.0);
        Assignment java2 = new Assignment("Project 11");
        java2.setGrade(90.0);

        javaCourse.addAssignment(java1);
        javaCourse.addAssignment(java2);

        Assignment math1 = new Assignment("Homework 1");
        math1.setGrade(80.0);
        Assignment math2 = new Assignment("Homework 2");
        math2.setGrade(85.0);

        mathCourse.addAssignment(math1);
        mathCourse.addAssignment(math2);

        myStudy.addCourse(javaCourse);
        myStudy.addCourse(mathCourse);
        myStudy.addCourse(math2Course);


        myStudy.print();
    }
}
