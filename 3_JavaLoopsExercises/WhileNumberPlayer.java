public class WhileNumberPlayer {
    int num;
    public WhileNumberPlayer(int n) {
        this.num = n;
    }

    public void printSquaresUpToLimit() {
        int limit = 1;
        while (limit * limit < 30) {
            System.out.println(limit * limit);
            limit++;
        }
    }

    public void printCubesUpToLimit() {
        int limit = 1;
        while (limit * limit * limit < 30) {
            System.out.println(limit * limit * limit);
            limit++;
        }
    }

    public static void main(String[] args) {
        WhileNumberPlayer p = new WhileNumberPlayer(10);
        p.printSquaresUpToLimit();
        p.printCubesUpToLimit();
    }
}
