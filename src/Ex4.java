import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex4 {
    public static void main(String[] args) {
        String s = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập xâu kí tự ban đầu: ");
        s = scanner.nextLine();
        String a[] = new String[200];           //khơi tạo 1 mảng string
        int max = 1;
        int n = 0;
        StringTokenizer s1 = new StringTokenizer(s);    //phân tách chuỗi s
        while (s1.hasMoreTokens()){                     //kiểm tra xem còn token trong chuỗi hay không
            a[n] = s1.nextToken();                      // còn thì gán token vào mảng a
            n++;
        }

        for (int i = 0; i < n; i++) {
            if(a[i].length() > max) max = a[i].length();
        }

        System.out.println("Độ dài của phần tử thứ lớn nhất là: " + max);
        System.out.print("Từ dài nhất là: ");

        for (int i = 0; i < n; i++) {
            if(a[i].length() == max){
                System.out.println(" " + a[i]);
            }
        }

        System.out.print("Vị trí từ dài nhất là: ");
        for (int i = 0; i < n; i++) {
            if(a[i].length() == max) System.out.println(" " + i);
        }
    }
}