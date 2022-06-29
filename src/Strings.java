import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        //option 1 +
        int x = 26 ;
        String s = "Hello";
        String space = " ";
        String name = "Java";
        System.out.println(s + space + name); //Hello Java
        System.out.println("Hello"+  " " + "Java");
        System.out.println("My age is " + x);
        System.out.println("In 20" + x + " I will be 31");//In 2026 I will be 31

//        //option 2 char
        String str = "Summer";
        char c = str.charAt(2);
        System.out.println(c); //m

//        //option 3 split
        String text = "I wanna believe";
        String[] words = text.split(" ");
        for(String word : words){
            System.out.println(word);
        }
        //option 4 compare
        String str1 = "Hello";
        String str2 = "Java";
        System.out.println(str1.compareTo(str2)); //-2

        //option 5 replace
        String str4 = "Perfect day";
        System.out.println(str4.toUpperCase(Locale.ROOT));// PERFECT DAY



    }
}