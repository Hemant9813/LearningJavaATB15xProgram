package ex_02_Strings;

public class Lab045_Array_smallest_no {

    static void main(String[] args) {

        int [] array={23,99,77,34,44};
        int Min=array[0];
        for(int i=0; i<array.length;i++){
            if(array[i]<=Min){
                Min=array[i];
                System.out.println(Min);
            }

        }
    }
}
