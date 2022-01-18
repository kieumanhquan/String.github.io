import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex5 {
    public static void main(String[] args) {
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập xâu họ tên: ");
        str = scanner.nextLine();
        convert(str);
    }

    static void convert(String s){
        StringTokenizer s1 = new StringTokenizer(s);
        StringBuffer kq = new StringBuffer();
        String a[] = new String[10];        //khởi tạo độ rộng của mảng
        int i = 1;                          //khởi tạo số phần tử trong mảng
        while ((s1.hasMoreTokens())){        //kiểm tra xem token còn trong chuỗi không
            a[i] = s1.nextToken();             //thêm token vào mảng
            i++;                                //tăng  phần tử của mảng
        }
        kq.append(a[3]).append(" ");
        kq.append(a[1]).append(" ");
        kq.append(a[2]).append(" ");
        System.out.println(kq);
    }
}
