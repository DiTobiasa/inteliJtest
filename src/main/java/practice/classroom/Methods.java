package practice.classroom;

public class Methods {
    public static void main(String[] args) {

        int y = 1;
        int x = 2;
        int result = y + x;
        System.out.println("Your result:" + result);

        name("Diana");
        printName("Kolya");

    }

    //void - returns nothing
    //public static int sum(int firstNumber , int secondNumber)
    //return value



    public static void sum(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        System.out.println("Your result : " + result);
    }


    public static int returnSum (int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }


    public static void printName (String name) {
        System.out.println("Print provided name " + name);
    }

    public static String name(String name) {
        printName(name);
        return name;
    }



    

}
