package practice.classroom;

public class LogicalOperators {
    public static void main(String[] args) {

        //Conditional statement
        //operator: if
        //switch

        boolean isStudent = true;

        if(isStudent) {
            System.out.println("He can ask for ISIC card");
        }

        boolean result = 10 > 0;

        if(10 > 11) {
            System.out.println("Yes, 10 > 0");
        }


        boolean isEmployee = false;
        // Boolean Variable Expression
        if(isEmployee) {
            System.out.println("Yes, this person is {COMPANY} employee");
        } else {
            System.out.println("No, this person no company employee");
        }

        //Inline Expression
        if (1 < 0) {
            System.out.println("Yes 1 > 0");
        } else {
            System.out.println("1 < 0");
        }

        int x = 10;
        int y = 20;

        if(x > y) {
            System.out.println("yes, this is true");
        } else {
            System.out.println("no,this is false");
        }

        // logical operators OR AND

        int speedMErcedes = 40;
        int speedBMW = 50;
        int speedPorche = 200;
        int speedMcLAren = 200;

        // 50 > 40 (true)    50 > 200 (false)
        //&& - AND (TRUE TRUE)
        if (speedBMW > speedMErcedes && speedBMW > speedPorche) {
            System.out.println("Yes,bmw speed is greater than  mercedes");
        } else {
            System.out.println("Something goes wrong");
        }

        // || - OR


        // switch

        int ukSize = 6;
        int euSize;

        switch (ukSize) {
            case 6:
                euSize = 39;
                System.out.println("EU SIZE: " + euSize);
                break;
            case 7:
                euSize = (int) 40.5;
                System.out.println("EU Size:" + ukSize);
                break;
            default:
                System.out.println("Cannot find proper size");
        }

        int dayOfTheWeek = 3;
        switch (dayOfTheWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("This value is not correct"+ dayOfTheWeek);
        }


    }
}
