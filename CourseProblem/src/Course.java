public class Course {
    String Course_Id;
    String Course_Name;

    public Course(String course_Id, String course_Name, String course_Fee) {
        Course_Id = course_Id;
        Course_Name = course_Name;
        Course_Fee = course_Fee;
    }

    String Course_Fee;

    @Override
    public String toString() {
        return "Course{" +
                "Course_Id='" + Course_Id + '\'' +
                ", Course_Name='" + Course_Name + '\'' +
                ", Course_Fee='" + Course_Fee + '\'' +
                '}';
    }

    public String getCourse_Id() {
        return Course_Id;
    }
}
