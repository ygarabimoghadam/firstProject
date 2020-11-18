/**
 * this class has main and run the game by calling main menu for both player .
 */
public class Play {
    public static void main(String [] args){
        Menu myMenu = new Menu();
       myMenu.mainMenu("first");
        myMenu.mainMenu("second");
      // StartPlaying p = new StartPlaying();
       // p.secondStep_giveDirection();
    }
}