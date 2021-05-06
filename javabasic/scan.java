import java.util.Scanner;
public class scan {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.print("반지름:");
        Float x= scr.nextFloat();
        System.out.print("높이:");
        Float y= scr.nextFloat();
        System.out.println((x*y/2) +"를 입력했습니다.");

    }
}
