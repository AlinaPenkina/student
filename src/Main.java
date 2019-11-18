import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Student> createStudents() {
        List<Student> students = new ArrayList<>();

        Student studentAlina = new Student();
        studentAlina.setName("Alina");
        studentAlina.setSurname("Penkina");
        studentAlina.setGpa(60);
        studentAlina.setCity("Bishkek");

        Lesson math = new Lesson(1, "Math");
        Lesson programming = new Lesson(2, "Programming");
        Lesson english = new Lesson(3, "English");
        Lesson psychology = new Lesson(3, "English");

        List<Lesson> lessons = new ArrayList<>();
        lessons.add(math);
        lessons.add(programming);
        lessons.add(english);

        studentAlina.setLessons(lessons);

        Student studentIsabek = new Student();
        studentIsabek.setName("Isabek");
        studentIsabek.setSurname("Tashiev");
        studentIsabek.setGpa(20);
        studentIsabek.setCity("Osh");


        List<Lesson> isabekLessons = new ArrayList<>();
        isabekLessons.add(math);
        isabekLessons.add(programming);
        isabekLessons.add(english);
        isabekLessons.add(psychology);
        studentIsabek.setLessons(isabekLessons);


        students.add(studentAlina);
        students.add(studentIsabek);

        return students;
    }

    public static void main(String[] args) {
        List<Student> students = createStudents();
        List<Student> filteredStudents = filterStudents(students);
        for (Student student : filteredStudents) {
            System.out.println(student);
        }
    }

    public static List<Student> filterStudents(List<Student> students) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getGpa() >= 20) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
}
