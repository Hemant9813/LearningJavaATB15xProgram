package ex_04_Constructor;

public class Lab54_Para_Cons {
    public  static void main(String[] args) {
      cat a =new cat();
      cat b=new cat("Jojo", "Singh");
        cat c=new cat("Lucky","Ji");
        System.out.println(b.name);
       // System.out.println(b.lastname,);
        System.out.println(c.name);
        System.out.println(c.lastname);
    }
}
class cat{
    String name;
    String lastname;

    cat() {
        System.out.println("lucky");
    }
    cat(String namegiven, String lastnamegiven){
        this.name=namegiven;
        this.lastname=lastnamegiven;
    }


}