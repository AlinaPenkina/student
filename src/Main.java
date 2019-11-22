import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class Main {

    public static List<Student> createStudents() {
        List<Student> students = new ArrayList<>();
        City bishkek = new City(1, "Bishkek");
        City osh = new City(2, "Osh");
        City oklahomaCity = new City(3, "Oklahoma city");
        City holywood = new City(4, "Holywood");
        Student studentAlina = new Student();
        studentAlina.setName("Alina");
        studentAlina.setSurname("Penkina");
        studentAlina.setGpa(60);
        studentAlina.setCity(bishkek);

        Lesson math = new Lesson(1, "Math");
        Lesson programming = new Lesson(2, "Programming");
        Lesson english = new Lesson(3, "English");
        Lesson psychology = new Lesson(4, "Psychology");
        Lesson discreteMath = new Lesson(5, "Discrete Math");
        Lesson rocketScience = new Lesson(5, "Rocket Science");

        List<Lesson> lessons = new ArrayList<>();
        lessons.add(math);
        lessons.add(programming);
        lessons.add(english);

        studentAlina.setLessons(lessons);

        Student studentIsabek = new Student();
        studentIsabek.setName("Isabek");
        studentIsabek.setSurname("Tashiev");
        studentIsabek.setGpa(20);
        studentIsabek.setCity(osh);


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
        studentSean.setCity(oklahomaCity);

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
        studentTom.setCity(holywood);

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
        studentMonica.setCity(holywood);

        List<Lesson> monicaLessons = new ArrayList<>();
        monicaLessons.add(math);
        monicaLessons.add(discreteMath);
        monicaLessons.add(english);
        monicaLessons.add(psychology);

        studentMonica.setLessons(monicaLessons);

        Student studentAlex = new Student();
        studentAlex.setName("Alex");
        studentAlex.setSurname("Mcqueen");
        studentAlex.setGpa(99);
        studentAlex.setCity(holywood);

        List<Lesson> alexLessons = new ArrayList<>();
        alexLessons.add(math);
        alexLessons.add(discreteMath);
        alexLessons.add(english);
        alexLessons.add(psychology);
        alexLessons.add(rocketScience);

        studentMonica.setLessons(monicaLessons);

        students.add(studentAlina);
        students.add(studentIsabek);
        students.add(studentSean);
        students.add(studentTom);
        students.add(studentMonica);
        students.add(studentAlex);
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = createStudents();
        List<Student> filteredStudents = filterStudents(students);
        for (Student student : filteredStudents) {
            System.out.println(student);
        }
        List<Student> filteredByNameStudents = filteredByNameStudents(students);
        System.out.println("Student with first A");
        System.out.println(filteredByNameStudents);
        System.out.println("GroupByCity");
        System.out.println(groupByCity(students));
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

    public static List<Student> filteredByNameStudents(List<Student> students) {
        List<Student> filteredByNameStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().startsWith("A")) {
                filteredByNameStudents.add(student);
            }
        }

        return filteredByNameStudents;
    }

    public static Map<City, List<Student>> groupByCity(List<Student> students) {

        Map<City, List<Student>> result = new HashMap<>();
        for (Student student: students){

            if(!result.containsKey(student.getCity())) {
                result.put(student.getCity(), new ArrayList<>());
            }

            if (result.containsKey(student.getCity())){
               result.get(student.getCity()).add(student);
            }

        }


        return result;
    }
}
