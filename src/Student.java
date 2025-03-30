public class Student {

    int studentId;
    String studentName;
    boolean isFullTime;
    String[] courseList;

    public Student() {

    }

    public Student(int studentId, String studentName, boolean isFullTime) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.isFullTime = isFullTime;
    }

    public Student(int studentId, String studentName, boolean isFullTime, String[] courseList) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.isFullTime = isFullTime;
        this.courseList = courseList;
    }

    public void updateFullTimeStatus() {
        this.isFullTime = true;
    }

    public void updateCourse(String oldCourse, String newCourse) {
        for (int i = 0; i < courseList.length; i++) {
            if (courseList[i].equals(oldCourse)) {
                courseList[i] = newCourse;
            }

        }
    }

    public void displayFullTimeStatus() {
        System.out.println("Hello, I am " + studentName + ", my Id is: " + studentId + " and I am a " + (isFullTime ? "Full time" : "Part time") + " student.");

    }

    public void displayCourses() {
        System.out.print("Hello, I am " + studentName + ", my Id is: " + studentId + " and I am enrolled in ");
        for (int i = 0; i < courseList.length; i++) {
            if (i < courseList.length - 1) {
                System.out.print(courseList[i] + ", ");
            } else {
                System.out.print(courseList[i]);
            }
        }
        System.out.print(" courses. \n");
    }

    @Override
    public String toString() {
        String output = "Hello, I am " + studentName + ", my Id is: " + studentId + " I am a " + (isFullTime ? "Full time" : "Part time") + " student, and I am enrolled in ";
        for (int i = 0; i < courseList.length; i++) {
            if (i < courseList.length - 1) {
                output += courseList[i] + ", ";
            } else {
                output += courseList[i];
            }
        }
        output += " courses.";
        return output;
    }
}
