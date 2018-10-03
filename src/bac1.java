import java.util.Scanner;

public class bac1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a,b,c;
        System.out.println("a:");
        a=Double.parseDouble(sc.nextLine());
        System.out.println("b:");
        b=Double.parseDouble(sc.nextLine());
        System.out.println("c:");
        c=Double.parseDouble(sc.nextLine());
        if(a!=0) {
            double answer=(c-b)/a;
            System.out.println("answer :"+answer);
        }else {
            System.out.println("phương trình không hợp lẹ");
        }


    }
}
