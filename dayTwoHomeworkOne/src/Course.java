public class Course {

    private int id;
    private String courseName;
    private String courseDescription;
    private String instructor;
    private String price;

    public Course(int id, String courseName, String courseDescription, String instructor, String price) {
        this.id = id;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.instructor = instructor;
        this.price = price;
    }

    public Course() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
