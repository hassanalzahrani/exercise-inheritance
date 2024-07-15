import java.util.Objects;

public class Person {

    private String first_name;
    private String last_name;
    private int age;
    private String email;

    public Person()
    {

    }

    public Person(String first_name, String last_name, int age, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(first_name, person.first_name) &&
                Objects.equals(last_name, person.last_name) &&
                Objects.equals(email, person.email);
    }

    public int hashCode() {
        return Objects.hash(first_name, last_name, age, email);
    }

    public String toString() {
        return "Person{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}