public class HelloWorld {
    public static void main(String args[]) {

        System.out.println("Hello World!");
    }
}

public class PrintFavoriteNumber {
    public static void main(String args[]) {

        double favoriteNumber = 28.8;
        System.out.println("My favorite number is " + favoriteNumber);
    }
}

public class BooleanExampleClass {
    public static void main(String args[]) {

        boolean amIMale = true;
        boolean amISleepy = true;
        String finalString = "";
        if (amIMale == true && amISleepy == true) {
            finalString = "I am one sleepy man!";
        } else {
            finalString = "I am a man... But I am not sleepy!";
        }
        System.out.println(finalString);
    }
}

public class WorkingWithStrings {
    public static void main(String args[]) {

        String myString = "asdawdawdaw2123123";
        System.out.println(myString.length());
    }
}

public class CombineMyAgeCharacterLength {
    public static void main(String args[]) {

        String first = "Anthony";
        String last = "Ledesma";

        int val = first.length() + last.length();

        System.out.println("Your name is " + first + " " + last + ".");
        System.out.println("Your first name is " + first.length() + " characters long.");
        System.out.println("Your last name is " + last.length() + " characters long.");

        System.out.println("That means that your total name length would be " + val + " characters long.");

    }
}

import java.util.*;

public class ListClass {
    public static void main(String args[]) {

        List list = new ArrayList();
        list.add("United States");
        list.add("Great Britain");
        list.add("Canada");
        System.out.println(list.toString());

        list.remove(1);
        list.add("Germany");

        System.out.println(list.toString());

    }
}