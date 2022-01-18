import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        check();
    }

    private static void check() {
        for (int i = 100000; i <= 999999; i++){
            String s = "";
            s += i;
            if (reversible(s)){
                System.out.println(i);
            }
        }
    }

    private static boolean reversible(String s) {
        int n = s.length();
        for (int i = 0; i < n ; i++){
            if (s.charAt(i) != s.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
}