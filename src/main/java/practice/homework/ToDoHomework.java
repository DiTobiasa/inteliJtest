package practice.homework;

import java.util.Arrays;

public class ToDoHomework {

    public static void main(String[] args) {



       // Task 1

        int value = 10;
        System.out.println("Integer value is " + value);



        //Task 2

        int age = 66;

            if (age <= 17 ) {
                System.out.println("No discount for ya");
            }

            if (age >= 18 && age <=21 ) {
                System.out.println("Congratz for you will be 10% for dry cleaning");
            }

            if (age >= 22 && age <=65) {
                System.out.println("Congratz for you will be 15% for dry cleaning");
            }

            if (age >= 66) {
                System.out.println("Congrtaz for you will be 20% for dry cleaning");
            }



        //Task 3

        String[] animalName = {"Tiger", "Zebra", "Elephant", "Penguin", "Fox","Wolf", "Lion","Peacock","Lama","Panda"};
        for (int i = 0; i < animalName.length; i++){
            if (animalName[i].equals("Wolf")) {
                System.out.println("My favorite animal in zoo is : " + animalName[i]);
            }
        }


        //Task 4

        int[] evenNumbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < evenNumbers.length ; i++){
            if (i % 2 == 0) {
                System.out.println("Even numbers: " + i);

            }

        }


        //Task 5

        int carName = 3 ;

        switch (carName){
            case 1:
                System.out.println("Today I gonna go to work by Bus");
                break;
            case 2:
                System.out.println("Today I gonna go to work by Taxi");
                break;
            case 3:
                System.out.println("Today I gonna go to work by Car");
                break;
        }


        //Task 6

        for (int i = 0; i<=100; i++) {
            System.out.println("new number " + i);
        }


        //Task 7

        for (int i = 50 -1; i >= 0 ; i--) {
            System.out.println(i);

        }


        //Task 8

        for (int i = 1; i <= 10; i++) {
            for (int x = 1; x <= 10; x++) {
                System.out.print((i * x) + " ");
            }
            System.out.println();
        }



    }
}
