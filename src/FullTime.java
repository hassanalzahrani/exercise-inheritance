public class FullTime extends Instractor{

    private int bones;

    public FullTime(String first_name, String last_name, int age, String email, int salary,int bones) {
        super(first_name, last_name, age, email, salary);
        this.bones = bones;
    }

    public FullTime() {
    }

    public int getBones() {
        return bones;
    }

    public void setBones(int bones) {
        this.bones = bones;
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "bones=" + bones +
                "} " + super.toString();
    }




    @Override
    public void position() {
        System.out.println("instructor full time");
    }

    @Override
    public int getSalary() {
        return super.getSalary() +this.bones;
    }
}