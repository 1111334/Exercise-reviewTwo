public class Student {
    private String name;
    private long identifier;
    private byte courseYear;

    public Student(String name, long identifier, byte courseYear) {
        this.name = name;
        this.identifier = identifier;
        this.courseYear = courseYear;
    }

    public String getName() {
        return name;
    }

    public long getIdentifier() {
        return identifier;
    }

    public byte getCourseYear() {
        return courseYear;
    }

    public static void printSeniorStudents(Student[] students) {
        for (Student student : students) {
            if (student.getCourseYear() == 3) {
                System.out.println("Identificatore: " + student.getIdentifier());
            }
        }
    }

}
