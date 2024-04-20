public class MyNumber {
    int num;
    public MyNumber(int n) {
        this.num = n;
    }

    public boolean isPrime() {
        for (int i = 2; i < this.num; i++) {
            if (this.num % i == 0) return false;
        }
        return true;
    }

    public int sumUpToN() {
        int sum = 0;
        for (int i = 1; i <= this.num; i++) {
            sum += i;
        }
        return sum;
    }

    public void printANumberTriangle() {
        for (int i = 1; i < this.num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyNumber num = new MyNumber(6);
        System.out.println(num.isPrime());
        System.out.println(num.sumUpToN());
        num.printANumberTriangle();
    }
}
