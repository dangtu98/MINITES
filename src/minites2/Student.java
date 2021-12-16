package minites2;

public class Student extends People {
    private double medium;

    public Student() {
    }

    public Student(double medium) {
        this.medium = medium;
    }

    public Student(String name, int age, int id, double medium) {
        super(name, age, id);
        this.medium = medium;
    }

    public Student(int id, String name, int age, double medium) {
    }

    public double getMedium() {
        return medium;
    }

    public void setMedium(double medium) {
        this.medium = medium;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "medium=" + medium +
                '}';
    }
}
