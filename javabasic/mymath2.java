public class mymath2 {
    long a,b;

    // 인스턴스 a,b 만을 이용해서 작업하므로 매개변수 불필요
    long add()  {return a+b;}
    long sub()  {return a-b;}
    long mul()  {return a*b;}
    double div()  {return a/b;}
    
    // 인스턴스변수와 관계없이 매개변수로만 작업 가능
    // a,b는 지역변수
    static long add(long a, long b) {return a+b;}
    static long sub(long a, long b) {return a-b;}
    static long mul(long a, long b) {return a*b;}
    static double div(double a, double b) {return a/b;}
}

class mymathtest2{
    public static void main(String args[]){
        // 클래스메서드 호출, 인스턴스 생성없이 호출가능
        System.out.println(mymath2.add(200,100));
        System.out.println(mymath2.sub(200,100));
        System.out.println(mymath2.mul(200,100));
        System.out.println(mymath2.div(200.0,100.0));
    }
}