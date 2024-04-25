import java.math.BigDecimal;
import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Integer> marks = new ArrayList<Integer>();

    public Student(String n, int... m) {
        this.name = n;
        for (int mark: m) {
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks() {
        return this.marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int i = 0; i < this.marks.size(); i++) {
            sum += this.marks.get(i);
        }
        return sum;
    }

    public int getMaximumMark() {
        int max = this.marks.get(0);

        for (int i = 0; i < this.marks.size(); i++) {
            if (this.marks.get(i) > max) max = this.marks.get(i);
        }
        return max;
    }

    public int getMinimumMark() {
        int min = this.marks.get(0);

        for (int i = 0; i < this.marks.size(); i++) {
            if (this.marks.get(i) < min) min = this.marks.get(i);
        }
        return min;
    }

    public BigDecimal getAverageMarks() {
        BigDecimal avg = new BigDecimal("0");

        for (int i = 0; i < this.marks.size(); i++) {
            avg = avg.add(new BigDecimal(Integer.toString(this.marks.get(i))));
        }
        return avg.divide(new BigDecimal(Integer.toString(this.marks.size())));
    }

    public void addNewMark(int m) {
        this.marks.add(m);
    }

    public void removeMarkAtIndex(int i) {
        if (i >= this.marks.size() || i < 0) return;
        this.marks.remove(i);
    }

    public void printMarks() {
        System.out.println(this.marks);
    }

    public static void main(String[] args) {
        Student student = new Student("Lucas", 98, 99, 100);
        System.out.println("Number of marks: " + student.getNumberOfMarks());
        System.out.println("Total sum of marks: " + student.getTotalSumOfMarks());
        System.out.println("Max Marks: " + student.getMaximumMark());
        System.out.println("Min Marks: " + student.getMinimumMark());
        System.out.println("Average Marks: " + student.getAverageMarks());
        student.addNewMark(75);
        student.removeMarkAtIndex(2);
        student.printMarks();
    }

}
