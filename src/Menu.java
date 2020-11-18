import java.util.Scanner;

/**
 * this class show menu of the game and give players option and run the game
 */
public class Menu {
    Name sample = new Name();
    Scanner c = new Scanner(System.in);
    MyRandom random = new MyRandom();
    StartPlaying start = new StartPlaying();
    Emoji emoji = new Emoji();

    private int option ;

    public Menu(){}

    public void showMenu(String turn ){

        System.out.println("Player "+turn+":");
        System.out.println("1-Correct Your Name");
        System.out.println("2-About Us");
        System.out.println("3-Guide For Playing");
        System.out.println("4-Start Playing");
        System.out.println("Type The Number Of Your Option.");
        option = c.nextInt();

    }

    public void choices(String turn, String n1 , String n2){
        int i = 0;
         if(turn.equals("first"))
             i=1;
         else
             i=2;
         switch (option){
             case 1: {
                 String name = c.next();
                 if (i == 1){
                     sample.setName1(name);
                     showMenu(turn );
                     choices(turn , n1 , n2);
                 break;}
                 if (i == 2){
                     sample.setName2(name);
                     showMenu(turn );
                     choices(turn , n1 , n2);
                 break;
                 }
                     System.out.println("Error");
                     showMenu(turn );
                 choices(turn , n1 , n2);
                     break;
             }
             case 2: {
                 System.out.println("this a sample of 44 Memoir game that give as a homework for advance programming course-99-2020"); //write s.t
                 showMenu(turn);
                 choices(turn , n1 , n2);
                 break;

             }
             case 3 :{
                 System.out.println("here is a list that explain meaning of the emoji in the game:");
                 System.out.println("this is tape:"+ emoji.add("tape") );
                 System.out.println("this is rudkhune:"+ emoji.add("water") );
                 System.out.println("this is janagal:"+ emoji.add("jangal") );
                 System.out.println("this is panahgah:"+ emoji.add("panahgah") );
                 System.out.println("this is shahr:"+ emoji.add("shahr") );
                 System.out.println("this is sarbaz:"+ emoji.add("sarbaz") );
                 System.out.println("this is tank:"+ emoji.add("tank") );
                 System.out.println("this is bomb:"+ emoji.add("bomb") );
                 showMenu(turn);
                 choices(turn , n1 , n2);
                 break;
             }
             case 4 :{
                 if(turn.equals("first")){
                     break;
                 }
                 else{

                     start.firstStep_Carts(n1,n2);
                 }
                 break;
             }
             default: {
                 System.out.println("Error");
                 showMenu(turn);
                 break;
             }
         }
    }
    public void mainMenu(String t){
        if(t.equals("first")){
        sample.Start();}
        String name1 = sample.getName1();
        String name2 = sample.getName2();
        showMenu(t);
        choices(t,name1,name2);

    }
}