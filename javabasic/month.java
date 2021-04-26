import java.util.Scanner;
import java.util.Random;

public class month {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] months= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int re = 0;
        System.out.println("해당월의 영어 단어를 입력하시오.\n세 글자로 잛게 첫 글자는 대문자, 나머지는 소문자로 입력하세요.");

        do {
            int month = 1 + rand.nextInt(12);

            while(true){
            System.out.print(month + "월 :");
            String s = sc.next();
    
            if (s.equels(months[month-1])) break;
            System.out.println("틀렸습니다.");
            }
        
            System.out.print("정답입니다.");
            System.out.print("다시 한번?1...Yes/0...No:0");
            re = sc.nextInt();
        } 
        while (re == 1);
       
        
    }
}
