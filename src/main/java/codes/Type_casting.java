package codes;

public class Type_casting {
    public static void main(String[]args){
        //widening casting
        int myInt = 100;
        double myDouble = myInt;
        System.out.println("myInt:"+ myInt);
        System.out.println("myDouble:"+ myDouble);
        //Narrowing casting

        double numDouble = 9.234d;
        int numInt = (int) numDouble;
        System.out.println("numInt:"+ numInt);
        System.out.println("numDouble:"+ numDouble);

    }
}

