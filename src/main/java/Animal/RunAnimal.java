package Animal;

public class RunAnimal {

    public static void main(String[] args) {

        //cat
        Animal cat = new Animal("Loie" , "male");
        cat.nickname = ("Loie");
        cat.gender = "male";
        cat.age = 2;
        cat.weight = 10.5;
        cat.height = 15.2;
        cat.isSterilized = false;
        cat.retrieveInformation();


        //bunny
        Animal bunny = new Animal("Dolly", "female");
        bunny.nickname = "Dolly";
        bunny.gender = "female";
        bunny.age = 3;
        bunny.weight = 5.5;
        bunny.height = 8.2;
        bunny.isSterilized = true;
        bunny.retrieveInformation();

        //fish
        Animal fish = new Animal ( "Shell", "female");
        fish.nickname = "Shell";
        fish.gender = "male";
        fish.age = 5;
        fish.weight = 0.1;
        fish.height = 5.2;
        fish.isSterilized = false;
        fish.retrieveInformation();


        //parrot
        Animal parrot = new Animal ( "Lary","male");
        parrot.nickname = "Lary";
        parrot.gender = "male";
        parrot.age = 10;
        parrot.weight = 4;
        parrot.height = 8.0;
        parrot.isSterilized = false;
        parrot.retrieveInformation();


        //humster
        Animal humster = new Animal ( "Fluffy", "female");
        humster.nickname = "Fluffy";
        humster.gender = "female";
        humster.age = 7;
        humster.weight = 3.2;
        humster.height = 9.0;
        humster.isSterilized = false;
        humster.retrieveInformation();


        //dog
        Animal dog = new Animal ( "Rex","male");
        dog.nickname = "Rex";
        dog.gender = "male";
        dog.age = 12;
        dog.weight = 25.2;
        dog.height = 30.1;
        dog.isSterilized = true;
        dog.retrieveInformation();


        parrot.goPlay();
        parrot.goTraining();
        parrot.goEat();


        dog.goWalk();
        dog.goTraining();
        dog.goPlay();
        dog.goSleep();

        humster.goSleep();


    }






}
