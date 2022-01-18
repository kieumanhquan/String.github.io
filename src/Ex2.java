import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập xâu kí tự: ");
        String n;
        n = scanner.nextLine();
        char s[] = n.toCharArray();             //chuyển đổi chuỗi thành mảng
        for(int i = 0; i < s.length; i++){
            if(i % 2 == 0){
                if(s[i] >= 97 && s[i] <= 122) s[i] -= 32;
            }
            else if (i%2 == 1){
                if(s[i] >= 65 && s[i] <= 90) s[i] += 32;
            }
        }
        n = String.valueOf(s);              //chuyển đổi mảng thành chuỗi
        System.out.println(n);
    }
}