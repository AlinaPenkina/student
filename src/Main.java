import java.util.ArrayList;
import java.util.List;

public class Main {

    Student student = new Student();


    public void createStudent() {

        student.setName("Alina");
        student.setSurname("Penkina");
        student.setGpa(60);
        student.setCity("Bishkek");
        List<Lesson> lessons = new ArrayList<>();
        lessons.add(new Lesson(1, "Math"));
        lessons.add(new Lesson(2, "Programming"));
        lessons.add(new Lesson(3, "English"));

        student.setLessons(lessons);
        System.out.println(student);
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Hello World!");
        main.createStudent();
    }

}
