/**
 * this class detemine if the player caAttack or is the Attack is possible or not by the rule of the gamw .
 */
public class Tas {
    MyRandom random = new MyRandom();
    private int myRandomNumber;
    private int myRandomNumberCan;

    public Tas(){}

    public boolean isItAttack(String  army , int number){
        int i = 0;
        int j = 0;
        int z = 0;
        int k = 0;
        int m = 0;
        int n = 0;
        int h = 0;
        int u = 0;
        if(army.equals("sarbaz")&&(number == 1)){
            for (i = 0 ; i<3 ; i++){
               myRandomNumber =  random.tas();
               if(myRandomNumber == number){
                   return true;
               }
            }
        }
        if(army.equals("sarbaz")&&(number == 2)){
            for (j = 0 ; j<2 ; j++){
                myRandomNumber =  random.tas();
                if(myRandomNumber == number){
                    return true;
                }
            }
        }
        if(army.equals("sarbaz")&&(number == 3)){
            for (k = 0 ; k<1 ; k++){
                myRandomNumber =  random.tas();
                if(myRandomNumber == number){
                    return true;
                }
            }
        }
        if(army.equals("bomb")&&((number == 1)||(number == 2))) {
            for (z = 0; z < 3; z++) {
                myRandomNumber = random.tas();
                if (myRandomNumber == number) {
                    return true;
                }
            }
        }
        if(army.equals("bomb")&&((number == 3)||(number == 4))) {
            for (h = 0; h < 4; h++) {
                myRandomNumber = random.tas();
                if (myRandomNumber == number) {
                    return true;
                }
            }
        }
        if(army.equals("bomb")&&((number == 5)||(number == 6))) {
            for (u = 0; u < 1; u++) {
                myRandomNumber = random.tas();
                if (myRandomNumber == number) {
                    return true;
                }
            }
        }
        if(army.equals("tank")) {
            for (m = 0; m < 3; m++) {
                myRandomNumber = random.tas();
                if (myRandomNumber == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public String canAttack(){
        myRandomNumberCan = random.tas();
        if(myRandomNumberCan == 1 || myRandomNumberCan == 6){
                return "sarbaz";
        }
        if(myRandomNumberCan == 2){
                return "tank";
        }
        if(myRandomNumberCan == 5){
                return "anything";
        }
        return "nothing";
    }
}