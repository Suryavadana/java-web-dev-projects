public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student student = new Student("Your Name", 12345, 1, 4.0);
        Course course = new Course("topic","Max");
        Teacher teacher = new Teacher("Phillip","Hodges","JAVA",1);
        System.out.println("Student name: " +student.getName());
        System.out.println("Student ID: " +student.getStudentId());
        System.out.println("Number of Credits: " + student.getNumberOfCredits());
        System.out.println("GPA: "+student.getGpa());
        System.out.println("topic: " + course.getTopic());
        System.out.println("Teacher instructor: "+course.getInstructor());
        System.out.println("Teacher : " + teacher.getFirstName() + " " + teacher.getLastName());
        System.out.println("Subject: " + teacher.getSubject());
        System.out.println("Years Teaching: " + teacher.getYearsTeaching());



    }
}
