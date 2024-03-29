import java.util.List;

public class Student {

    public City getCity() {
        return city;
    }

    private City city;
    private String name;
    private String surname;
    private Integer gpa;
    private List<Lesson> lessons;

    public Student() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getGpa() {
        return gpa;
    }

    public void setGpa(Integer gpa) {
        this.gpa = gpa;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("city='").append(city).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", gpa=").append(gpa);
        sb.append(", lessons=").append(lessons);
        sb.append('}');
        return sb.toString();
    }

    public String getFullname() {
        return this.getName() + " " + this.getSurname();
    }

    public void setCity(City city) {
        this.city = city;
    }
}
