import java.util.ArrayList;

public class Course {
    private String topic;
    private  String TeacherInstructor;
    private ArrayList<Student> enrolledStudents;

    //constructor

    public Course(String topic, String TeacherInstructor ){
        this.topic=topic;
        this.TeacherInstructor=TeacherInstructor;
        this.enrolledStudents=new ArrayList<>();
    }

    //getters and setters
    public String getTopic(){ return topic;}
    public void setTopic(String topic){ this.topic=topic; }
    public String getInstructor(){ return TeacherInstructor;}
    public void setInstructor(String instructor){ this.TeacherInstructor=instructor; }
    public ArrayList<Student> getEnrolledStudents() { return enrolledStudents; }
    public void setEnrolledStudents(ArrayList<Student> enrolledStudents){ this.enrolledStudents=enrolledStudents;}
    // Additional method to add a student to the enrolled students list
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }
}
