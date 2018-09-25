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
        if(amIMale == true && amISleepy == true){
            finalString = "I am one sleepy man!";
        } else {
            finalString = "I am a man... But I am not sleepy!";
        }
        System.out.println(finalString);
}
}
