public class MVCPatternTest {

    public static void main(String[] args) {

        // Create Model
        Student student = new Student(101, "Ananth", "A");

        // Create View
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller =
                new StudentController(student, view);

        System.out.println("Initial Details:");
        controller.updateView();

        // Update Student Details
        controller.setStudentName("Karthik");
        controller.setStudentGrade("A+");

        System.out.println("\nUpdated Details:");
        controller.updateView();
    }
}