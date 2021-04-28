import java.util.Random;
import java.util.Scanner;

public class j04210428 {
    public static void main(String[] args){
      /*
      Random rand = new Random();
      Scanner sc = new Scanner(System.in);

      String[] dayKor = {"일","월","화","수","목","금","토"};
      String[] dayEng = {"sun","mon","tue","wed","thu","fri","sat"};

      System.out.println("요일명을 영어 소문자로 입력하시오");

      int last= -1; // 이전 요일
      int retry = 0; 
      do {
          int day;
        do {
          day = rand.nextInt(7);
        } while(day == last);
        last = day;

        while (true) {
          System.out.print(dayKor[day]+"요일 : ");
          String s = sc.next();
          if (s.equals(dayEng[day])) break;  //정답일경우

          System.out.println("틀렸습니다. ");
        }
        System.out.print("정답입니다. 다시 한번? 1...Yes/0...No :");
        retry = sc.nextInt();
        }while(retry == 1);
        
      */


      /*
      Scanner sc = new Scanner(System.in);

      int[][] a = new int[4][3];
      int[][] b = new int[3][4];
      int[][] c = new int[4][4];

      System.out.println("행렬 a의 요소를 입력하세요");
      for (int i = 0; i < 4;i++){
        for (int j = 0; j < 3;j++) {
          System.out.print("a["+i+"]["+j+"] :");
          a[i][j] = sc.nextInt();
        }
      }

      System.out.println("행렬 b의 요소를 입력하세요");
      for (int i = 0; i < 3;i++){
        for (int j = 0; j < 4;j++) {
          System.out.print("b["+i+"]["+j+"] :");
          b[i][j] = sc.nextInt();
        }
      }

      for (int i = 0; i < 4;i++){
        for (int j = 0; j < 4;j++) {
          c[i][j] = 0;
          for (int k = 0;k < 3; k++){
            c[i][j] += a[i][k] * b[k][j];
          }
        }
      }

      System.out.println("행렬 a와 b의 곱");
      for (int i = 0; i < 4;i++){
        for (int j = 0; j < 4;j++) {
          System.out.print(c[i][j]+ "  ");
        }
        System.out.println();
      }
      */

      Scanner sc = new Scanner(System.in);

      System.out.print("학급수 : ");
      int classNum = sc.nextInt();
      int[][] point = new int[classNum][];
      int totNumber = 0;
      
      for (int i = 0 ; i < point.length ; i ++){
        System.out.print(i+1+"반의 학생수 : ");
        int num = sc.nextInt();
      
        point[i] = new int[num];
        totNumber += num;
      
        for (int j = 0; j < point[i].length; j++){
          System.out.print((i+1) + "반"+ (j+1) +"번의 점수 :");
          point[i][j] = sc.nextInt();
          }
        }
        System.out.println("  반 |   합계  평균");
        System.out.println("----+-----------------");
        int total = 0;
        for (int i = 0 ; i < point.length; i++) {
          int sum = 0;
          for (int j = 0; j <point[i].length; j++) {
            sum += point[i][j];
          }
          total += sum;
          System.out.printf("%2d반 | %7d %7.1f\n",i+1,sum, (double)sum/point[i].length);
        }    
      
        System.out.println("----+-----------------");
        System.out.printf("  합 | %7d %7.1f\n",total, (double)total/totNumber);
      


  }
    
}
