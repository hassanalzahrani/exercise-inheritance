public class Student extends Person{

    private String bootcanp_name;
    private double gpa;

    public Student()
    {

    }

    public Student(String first_name, String last_name, int age, String email,String bootcanp_name,double gpa) {

        super(first_name,last_name,age,email);
        this.bootcanp_name = bootcanp_name;
        this.gpa = gpa;
    }

    public String getBootcanp_name() {
        return bootcanp_name;
    }

    public void setBootcanp_name(String bootcanp_name) {
        this.bootcanp_name = bootcanp_name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "bootcanp_name='" + bootcanp_name + '\'' +
                ", gpa=" + gpa +
                "} " + super.toString();
    }
}
