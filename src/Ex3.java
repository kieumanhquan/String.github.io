import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex3 {
    public static void main(String[] args) {
        String s = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        s = scanner.nextLine();
        chuHoa(s);
    }

    static void chuHoa(String s) {
        StringTokenizer s1 = new StringTokenizer(s);
        StringBuffer kq = new StringBuffer();
        while (s1.hasMoreTokens()){         // trả về true nếu còn nhiều token trong chuỗi.
            String s2 = s1.nextToken();         //trả về token tiếp theo
            s2 = s2.toLowerCase();              //chuyển đổi về dạng chữ thường
            String s3 = s2.substring(0, 1);      //trả về chuỗi con từ vitri 0 -> 1.
            s2 = s2.replaceFirst(s3, s3.toUpperCase()); // dùng replaceFirst để thay thế chuỗi con đầu tiên của s3 rồi cho thành chữ in Hoa
            kq.append(s2).append(" ");      // nối tham số vào cuối chuỗi
        }
        System.out.println(kq);
    }
}