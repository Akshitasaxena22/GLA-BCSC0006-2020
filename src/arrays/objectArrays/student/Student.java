/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 06/01/20
 *   Time: 2:07 PM
 */

package arrays.objectArrays.student;

public class Student {
    private int rollNumber;
    private String name;
    private float marks;

    public Student(int rollNumber, String name, float marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("rollNumber=").append(rollNumber);
        sb.append(", name='").append(name).append('\'');
        sb.append(", marks=").append(marks);
        sb.append('}');
        return sb.toString();
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
}
