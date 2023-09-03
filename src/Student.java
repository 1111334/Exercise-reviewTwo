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

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentifier(long identifier) {
        this.identifier = identifier;
    }

    public void setCourseYear(byte courseYear) {
        this.courseYear = courseYear;
    }

    public void printSeniorStudents(Student[] arr) {
       for (Student student : arr) {
           if (student.getCourseYear() == 3) {
               System.out.println("stampa identificativo: " + getIdentifier());
           }
       }

    }
}
