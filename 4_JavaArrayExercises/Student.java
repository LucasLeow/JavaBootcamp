import java.math.BigDecimal;

public class Student {
    String name;
    int[] marks;

    public Student(String n, int... m) {
        this.name = n;
        this.marks = m;
    }

    public int getNumberOfMarks() {
        return this.marks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int i = 0; i < this.marks.length; i++) {
            sum += this.marks[i];
        }
        return sum;
    }

    public int getMaximumMark() {
        int max = this.marks[0];

        for (int i = 0; i < this.marks.length; i++) {
            if (this.marks[i] > max) max = this.marks[i];
        }
        return max;
    }

    public int getMinimumMark() {
        int min = this.marks[0];

        for (int i = 0; i < this.marks.length; i++) {
            if (this.marks[i] < min) min = this.marks[i];
        }
        return min;
    }

    public BigDecimal getAverageMarks() {
        BigDecimal avg = new BigDecimal("0");

        for (int i = 0; i < this.marks.length; i++) {
            avg = avg.add(new BigDecimal(Integer.toString(this.marks[i])));
        }
        return avg.divide(new BigDecimal(Integer.toString(this.marks.length)));
    }

    public static void main(String[] args) {
        Student student = new Student("Lucas", 98, 99, 100);
        System.out.println("Number of marks: " + student.getNumberOfMarks());
        System.out.println("Total sum of marks: " + student.getTotalSumOfMarks());
        System.out.println("Max Marks: " + student.getMaximumMark());
        System.out.println("Min Marks: " + student.getMinimumMark());
        System.out.println("Average Marks: " + student.getAverageMarks());
    }

}
