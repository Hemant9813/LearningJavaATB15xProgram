package ex_02_Strings;

public class Lab042_String_Interview {
    public static void main(String[] args){
        String a="JAVA";
        String b="java";
        String f="java";

        String c=new String("Java");
        String d=new String("java");
        String e=new String("java");

        System.out.println(a==c);
        System.out.println(b==d);
        System.out.println(b==f);
        System.out.println(d==e);



    }
}
