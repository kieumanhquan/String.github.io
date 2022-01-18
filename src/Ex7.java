import java.util.Scanner;

public class Ex7 {
    public static String Delete(String s1, String s2){
        if(!s1.contains(s2)){
            return s1;
        }else{
            s1 = s1.replaceAll(s2, "");
            return Delete(s1, s2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập xâu 1: ");
        String str1=scanner.nextLine();
        System.out.println("Mời bạn nhập xâu 2: ");
        String str2=scanner.nextLine();
        Ex7 ex7=new Ex7();
        System.out.println("Xâu s1 sau khi xóa: ");
        System.out.println(ex7.Delete(str1, str2));
    }
}