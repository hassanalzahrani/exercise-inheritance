public class PartTime extends Instractor{

    private int bones;

    public PartTime() {

    }

    public PartTime(String first_name, String last_name, int age, String email, int salary, int bones) {
        super(first_name, last_name, age, email, salary);
        this.bones = bones;
    }

    public int getBones() {
        return bones;
    }

    public void setBones(int bones) {
        this.bones = bones;
    }

    @Override
    public int getSalary() {
        return super.getSalary() +this.bones;
    }
}