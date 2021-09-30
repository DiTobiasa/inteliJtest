package practice.classroom;

public class MethodOverLoading {

    public static void main (String[] args) {

        printInformation("Nikita");
        printInformation("Michial", 30, "leo");
        printInformation("Sandra", 18, "virgo");

    }

    public static  void printInformation(String name) {
        System.out.println("Your name is: " + name);
    }

    public static void printInformation( String name , int age, String horoscope){
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your horoscope is: " + horoscope);
    }
}
