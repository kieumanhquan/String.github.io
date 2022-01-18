import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex6 {
    public static void main(String[] args) {
        String s = new String();
        System.out.println("Nhập 1 câu:  ");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        sapXep(s);
    }

    static void sapXep(String s){
        StringTokenizer s1 = new StringTokenizer(s);
        int n = s1.countTokens();
        String arr[] = new String[n];
        int i = 0;
        while (s1.hasMoreTokens()){
            arr[i] = s1.nextToken();
            i++;
        }
        String tg = new String();

        for (int j = 0; j < n - 1; j++) {
            for(int k = j+1; k < n; k++){
                if(arr[j].compareTo(arr[k]) > 0){
                    tg = arr[j];
                    arr[j] = arr[k];
                    arr[k] = tg;
                }
            }
        }

        for(int k = 0; k < n; k++){
            System.out.println(arr[k]);
        }
    }
}