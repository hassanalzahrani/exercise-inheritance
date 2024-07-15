public class Instractor extends Person{

    private int salary;

    public Instractor()
    {

    }

    public Instractor(String first_name, String last_name, int age, String email, int salary) {
        super(first_name, last_name, age, email);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void position()
    {
        System.out.println("Instractor " + toString());
    }

    @Override
    public String toString() {
        return "Instractor{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}