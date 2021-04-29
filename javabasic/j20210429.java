import java.util.Scanner;

public class j20210429 {
    public static void main(String[] args){
        /*
        Scanner sc=new Scanner(System.in);
        System.out.print("정수a:"); int a= sc.nextInt();
        System.out.print("정수b:"); int b= sc.nextInt();
        System.out.print("정수c:"); int c= sc.nextInt();
        System.out.print("최소값은: min(a,b,c)");

    
    }

    static int min(int a, int b, int c){

        int min=a;
        if(b<min) min=b;
        if(c<min) min=c;
        return min;
    }
    */


    /*
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 x까지의 합을 구하세요"); 
        System.out.print("x의 값:"); int x = sc.nextInt();
        System.out.print("1부터 "+x+"의 합은"+sumUp(x)+"입니다."); 

    }

    static int sumUp(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i ++)
            sum+=i;
            return sum;
    }
    */



        Scanner sc = new Scanner(System.in);
        int x;
        do{
            int n = readPlusInt();

            System.out.print("반대로 읽으면 ");
            while(n>0){
                System.out.print(n%10);
                n = n / 10;
            }
        System.out.println("입니다");

        do {
            System.out.print("다시 한 번?<Yes...1/No...0>");
            x=sc.nextInt();
        }while (x!=0 && x!=1);
        }while(x==1);

    } // main  닫기

    static int readPlusInt() {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.print("양의 정수값:");
            x = sc.nextInt();
        } while(x <=0);
        return x;
    }


}
