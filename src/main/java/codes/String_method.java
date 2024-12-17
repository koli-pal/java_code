package codes;

public class String_method {
    public static void main(String[]args){
        String text ="Hello World ,How are YOU? How was your day?";
        String text2 = "Are you there?";
        String text3 = "we are \"Bengali\" people.";
        System.out.println(text);
        System.out.println(text.length());
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.replace('o','a'));
        System.out.println(text.indexOf("How"));
        System.out.println(text.concat(text2));
        System.out.println(text3);
    }
}

