public class MyChar {
    char ch;
    public MyChar(char c) {
        this.ch = c;
    }
    public boolean isVowel() {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U';
    }

    public boolean isAlphabet() {
        return (this. ch >= 'a' && this.ch <= 'z') || (this.ch >= 'A' && this.ch <= 'Z');
    }

    public boolean isNumber() {
        return (this.ch >= '0' && this.ch <= '9');
    }

    public static void printLowerCaseAlphabets() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println((ch));
        }
    }

    public static void printUpperCaseAlphabets() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((ch));
        }
    }

    public static void main(String[] args) {
        MyChar mychar = new MyChar('5');
        System.out.println(mychar.isVowel());
        System.out.println(mychar.isAlphabet());
        System.out.println(mychar.isNumber());
        mychar.printLowerCaseAlphabets();
    }

}
