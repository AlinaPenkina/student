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
        Lesson psychology = new Lesson(4, "Psychology");
        Lesson discreteMath = new Lesson(5, "Discrete Math");

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

        Student studentSean = new Student();
        studentSean.setName("Sean");
        studentSean.setSurname("Mc. Kensey");
        studentSean.setGpa(70);
        studentSean.setCity("Oklahoma city");

        List<Lesson> seanLessons = new ArrayList<>();
        seanLessons.add(math);
        seanLessons.add(discreteMath);
        seanLessons.add(english);
        seanLessons.add(programming);

        studentSean.setLessons(isabekLessons);

        Student studentTom = new Student();
        studentTom.setName("Tom");
        studentTom.setSurname("Cruise");
        studentTom.setGpa(80);
        studentTom.setCity("Holywood");

        List<Lesson> tomLessons = new ArrayList<>();
        tomLessons.add(math);
        tomLessons.add(discreteMath);
        tomLessons.add(english);
        tomLessons.add(psychology);

        studentTom.setLessons(seanLessons);

        Student studentMonica = new Student();
        studentMonica.setName("Monica");
        studentMonica.setSurname("Bellucci");
        studentMonica.setGpa(100);
        studentMonica.setCity("Hollywood");

        List<Lesson> monicaLessons = new ArrayList<>();
        monicaLessons.add(math);
        monicaLessons.add(discreteMath);
        monicaLessons.add(english);
        monicaLessons.add(psychology);

        studentMonica.setLessons(monicaLessons);

        students.add(studentAlina);
        students.add(studentIsabek);
        students.add(studentSean);
        students.add(studentTom);
        students.add(studentMonica);
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
