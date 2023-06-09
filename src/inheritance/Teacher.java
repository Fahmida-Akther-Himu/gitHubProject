package inheritance;

public class Teacher extends University {
    public String course;

    public Teacher() {
        super();
        this.course = course;
    }

    public void takeCourse() {
        System.out.println("A teacher can take five courses.");
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.print();
        teacher.takeCourse();
    }

}
