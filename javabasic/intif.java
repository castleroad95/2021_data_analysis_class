import java.util.Scanner;

public class intif {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("정수값: ");
        int n =sc.nextInt();

        if (n>0){
            System.out.println("값이 양수 입니다");
        }else if(n<0){
            System.out.println("값이 음수 입니다");
        }else{
            System.out.println("값이 0 입니다");
        }
        
    }
}
