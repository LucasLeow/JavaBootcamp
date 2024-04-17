public class BiNumber {
    private int num1;
    private int num2;
    public BiNumber(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return this.num1 + this.num2;
    }

    public int multiply() {
        return this.num1 * this.num2;
    }

    public void _double() {
        this.num1 *= 2;
        this.num2 *= 2;
    }

    public int getNum1() {
        return this.num1;
    }

    public int getNum2(){
        return this.num2;
    }

    public static void main(String[] args) {
        BiNumber numbers = new BiNumber(2, 3);
        System.out.println(numbers.add());
        System.out.println(numbers.multiply());
        numbers._double();
        System.out.println(numbers.getNum1());
        System.out.println(numbers.getNum2());
    }
}
