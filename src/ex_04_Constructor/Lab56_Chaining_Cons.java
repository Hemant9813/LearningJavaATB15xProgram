package ex_04_Constructor;

public class Lab56_Chaining_Cons {
    static void main(String[] args) {
        loginPage a=new loginPage("gmail","123");
        System.out.println(a.email);
    }

}

class loginPage{
    String email;
    String pass;

     loginPage(String pass, String email) {
        //this(email,pass); constructor chaining
    }

    String submitButton;


}
