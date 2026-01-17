package ex_02_Strings;

public class Lab50_2nd_Highest_No {
    static void main(String[] args) {

    int [] number={26,74,97,23,45,19};
    int highest=0;
    int secondHighest=0;

    for(int num:number){
        if(num > highest){
            secondHighest=highest;
            highest=num;
        }
    }
        System.out.println(secondHighest);
    }
}
