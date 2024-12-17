package codes;

public class Java_Math {
    public static void main(String[]args){
        int x=5,y=10, z=-54;
        int random = (int)( Math.random()*101);
        System.out.println("max="+ Math.max(x,y));
        System.out.println("min="+Math.min(x,y));
        System.out.println(Math.random());
        System.out.println("random number ="+random);
        System.out.println("Absolute z ="+Math.abs(z));
        System.out.println("Square root ="+Math.sqrt(y));

    }
}

