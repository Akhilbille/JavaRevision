//This contains Class, Objects, Encapsulation, Abstraction

class Student {

    // Properties
    public int id;
    public String name;
    private int marks;

    // Constructor
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getter
    public int getMarks() {
        return this.marks;
    }

    // setter
    public void setMarks(int marks) {
        if (marks > 0) {
            this.marks = marks;
            System.out.println("Marks Updated");
        } else {
            System.out.println("Enter valid marks");
        }

    }

    // toString method will display when we print the Object.
    public String toString() {
        return this.name;
    }
}

public class J31ClassesAndObjects {
    public static void main(String[] args) {
        Student akhil = new Student(1, "Akhil", 100);
        System.out.println(akhil);

        // Creating an array of Objects
        Student students[] = new Student[3];
        students[0] = new Student(2, "Deepu", 100);
        students[1] = new Student(3, "Dini", 100);
        students[2] = new Student(4, "Vinay/Vinod", 100);

        for(Student s:students){
            System.out.println(s);
        }

    }

}
    