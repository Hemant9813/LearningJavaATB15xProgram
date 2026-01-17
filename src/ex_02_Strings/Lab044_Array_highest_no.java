package ex_02_Strings;

public class Lab044_Array_highest_no {
    static void main(String[] args) {

        int [] number={20,98,33,38,97};
        int max=number[0];

        for (int i=0; i<number.length;i++){

        if(number[i]>max) {
            max = number[i];
            System.out.println(max);
        }
        }
    }
}
