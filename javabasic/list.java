import java.util.ArrayList;

public class list {
    public static void main(String[] args){
        ArrayList<String> ar= new ArrayList<String>();
        ar.add("123");
        ar.add("456");
        ar.add("789");

        System.out.println(ar);
        System.out.println(ar.get(1)); // 1번째 인자 출력
        System.out.println(ar.size()); // list길이 출력
        System.out.println(ar.contains("456"));  // 456을 포함하고 있는지 여부
        
        System.out.println(ar.remove("123"));
        System.out.println(ar.remove(0));
        System.out.println(ar);
    }
}
