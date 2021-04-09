public class stringBuffer {
    public static void main(String[] args){
        StringBuffer sb= new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb.toString());


        String temp="";
        temp+="hello";
        temp+=" ";
        temp+="dive to java";
        System.out.println(temp);


        sb.insert(0,"i'm first time");
        System.out.println(sb);

        System.out.println(sb.substring(0,5));
    }
}
