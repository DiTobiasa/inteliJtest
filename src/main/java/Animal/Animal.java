package Animal;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Animal {



    public String nickname;
    public String gender;
    public int age;
    public double weight;
    public double height;
    public boolean isSterilized;
    boolean isSleeping;
    public int animalEnergy = 4;




    public Animal(String nickname,String gender) {
        this.nickname = nickname;
        this.gender = gender;

    }

    public void retrieveInformation() {
        log.info("Nickname is: {} Gender is: {} Age is: {} Weight is: {} Height is: {} Is sterilized: {} ",
                nickname, gender, age, weight, height, isSterilized);

    }

    //Sleep

    public void goSleep(){

        if (animalEnergy <=3 && animalEnergy <= 2 && animalEnergy <=1) {
            isSleeping = true;
            log.info("Your animal " + nickname + " is sleeping");
            animalEnergy = animalEnergy + 4;
        }

        if (animalEnergy ==4 ) {
                isSleeping = true;
                log.info("Your animal " + nickname + " doesnt want to sleep,so go walk or play with him!");

            }
    }


    //Walk

    public void goWalk(){

        if ( animalEnergy > 0){
            log.info("Your animal "  + nickname + " is walking right now");
            animalEnergy--;
            log.info("Your animal lost -1 of energy count");
            }


        else if ( animalEnergy <= 3){
            log.info("Your animal " +nickname + " is walking but tired,soon animal will need a rest");
            animalEnergy--;
            log.info("Your animal lost -1 of energy count");
        }


        else if ( animalEnergy <= 0){
            log.info("Your animal " +nickname + " wont go anywhere, animal must to go to sleep!");

        }


    }


    //Training

    public void goTraining(){

        if(animalEnergy >= 4){
            log.info("Your animal " + nickname +  " is training");
            animalEnergy--;
            log.info("Your animal lost -1 of energy count");

        }else if(animalEnergy <= 3 || animalEnergy <= 2){
            log.info("Your animal " + nickname +  " is training and a bit tired but still can continue training");
            animalEnergy--;
            log.info("Your animal lost -1 of energy count");
        }

        else if (animalEnergy <= 1){
            log.info("Your animal " +nickname+ " is tired , feed him! " );
            animalEnergy--;
            log.info("Your animal lost -1 of energy count");
        }

        else if (animalEnergy <=0 ) {
            log.info("No more training for animal " + nickname + " , you must to send animal go to sleep");

        }

    }


    //Playing


    public void goPlay(){
        if(animalEnergy > 0 || animalEnergy >= 4 ){
            log.info("Your animal " +nickname+ " is playing with You right now");
            animalEnergy--;
            log.info("Your animal lost -1 of energy count");
        }
        else if (animalEnergy <= 3 ) {
            log.info("Your animal " + nickname+ " is playing, but a bit tired ,it is time to eat ");
            animalEnergy--;
            log.info("Your animal lost -1 of energy count");
        }

        else if (animalEnergy <= 0){
            log.info("Your animal "+nickname+ " is tired of playing , animal must to go to sleep!");

        }


    }


    //Feeding

    public void goEat(){
        if(animalEnergy >= 4 ){
            log.info("Animal" + nickname+  "doesnt want to eat");
        };
        if(animalEnergy == 3){
            animalEnergy++;
            log.info("Your animal is eating and increased +1 to energy count");

        }
        else if (animalEnergy == 2){
            animalEnergy=animalEnergy+2;
            log.info("Your animal is eating and increased +2 to energy count");

        }
        else if (animalEnergy == 1 ){
            animalEnergy=animalEnergy+3;
            log.info("Your animal is eating and increased +3 to energy count");
        }
        else if (animalEnergy == 0 ){
            animalEnergy=animalEnergy+4;
            log.info("Your animal is eating and increased +4 to energy count");
        }

    }



}
