import java.util.Scanner;
public class subtract {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("정수 a: ");
        int a =sc.nextInt();
        System.out.println("정수 b: ");
        int b =sc.nextInt();

        System.out.println("두 값의 차는" + Math.abs(a-b));
    }
}
