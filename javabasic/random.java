import java.util.Random;
public class random {
    public static void main(String[] args){
        Random rand=new Random();

        int x= rand.nextInt(9);
        int y= rand.nextInt(9);
        int z= rand.nextInt(9);

        System.out.println("한자리 양의 정수: "+ x);
        System.out.println("두자리 양의 정수: "+ y);
        System.out.println("세자리 양의 정수: "+ z);
    } 
    
}
