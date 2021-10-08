package practice.classroom;

public class LoopPractice {
    public static void main(String[] args) {

        // for

        for (int i = 0; i < 10; i++) {
            System.out.println("HelloWorld");
        }

        //i = 0;
        //0 < 10 (true)
        //code is executing

        //i = 1;
        //i < 10 (true)
        //code is executing

        //i = 2;
        //2 < 10 (true)
        //executing

        //i = 10;
        //10<10 (false);
        //stop

        String[] names = {"Nikita", "Andrey","Sofija", "Max"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 3){
                System.out.println(numbers[i]);
            } else {
                System.out.println("Number is less then 4: " + numbers[i]);
            }
        }


        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Sofija")) {
                System.out.println("I found Sofija!");
            }

        }
        for (int i = numbers.length -1; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }

    }
}
