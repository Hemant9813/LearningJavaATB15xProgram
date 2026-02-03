package ex_04_Constructor;

public class Lab55_Cons_Overloading {
    static void main(String[] args) {
browser b=new browser();
browser c=new browser("windows");
browser d=new browser("Linux");
browser e=new browser("Windows","Chrome",12);
      //  browser f=new browser()
System.out.println(c.os_type);
System.out.println(d.os_type);
        System.out.println(e.os_type);
        System.out.println(e.name);
        System.out.println(e.version);
    }
}

class browser{
    String name;
    String os_type;
    int version;

    browser(){      //Default constructor
        System.out.println("Default-Constructor");
    }

    browser(String os_typeGiven){      //Parameterized constructor
        this.os_type=os_typeGiven;
    }

    browser(String os_typeGiven, String nameGiven, int versionNum){
        this.os_type=os_typeGiven;
        this.version=versionNum;
        this.name=nameGiven;

    }
}