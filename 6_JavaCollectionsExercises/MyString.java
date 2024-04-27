public class MyString {

    public String str;

    public MyString(String str) {
        this.str = str;
    }

    public boolean isHexadecimalChar(char ch) {
        // Write your code here
        return ((ch >= 'A' && ch <= 'F') || (ch >='a' && ch <= 'f'));
    }

    public boolean isHexadecimal() {
        if (this.str == null) return false;
        if (this.str.isEmpty()) return false;

        char[] chars = this.str.toCharArray();
        for(char c: chars) {
            if (!Character.isDigit(c)) {
                if (!this.isHexadecimalChar(c)) return false;
            }
        }
        return true; // return true only after checking all characters
    }

    public static void main(String[] args) {
        MyString s = new MyString("1A2B*3C");
        s.isHexadecimal();
    }


}