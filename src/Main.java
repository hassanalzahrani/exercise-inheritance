import java.util.Scanner;
public class Main{
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        Student student1 =
                new Student("Hassan","alzhrani",23,"hassan@gmail.com","java",60.0);

        student1.setFirst_name("Ahmed");
        student1.setLast_name("fahad");
        student1.setAge(60);
        student1.setEmail("khaled@gmail.com");
        student1.setBootcanp_name("C++");
        student1.setGpa(12.5);

        System.out.println(student1.toString());

        Instractor instractor1 = new Instractor();

        instractor1.setFirst_name("Sara");
        instractor1.setLast_name("Alfify");
        instractor1.setAge(44);
        instractor1.setEmail("sssaaa09@gmail.com");
        instractor1.setSalary(7000);

        System.out.println(instractor1.toString());

        instractor1.position();

        FullTime fullTime1 =
                new FullTime("Sami","Bashar",55,"samiooo_1@gmail.com",13000,500);

        PartTime partTime1 =
                new PartTime("Amani","Alfozan",42,"amani_a@gmail.com",6500,400);

        System.out.println(fullTime1);
        System.out.println(partTime1);

        fullTime1.position();

        System.out.println(fullTime1.getSalary());
        System.out.println(partTime1.getSalary());

    }
}