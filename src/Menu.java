import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    Name sample = new Name();
    Scanner c = new Scanner(System.in);
    MyRandom random = new MyRandom();
    StartPlaying start = new StartPlaying();

    private int option ;

    public Menu(){}

    public void showMenu(String turn ){

        System.out.println("Player"+turn+":");
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
                 break;}
                 if (i == 2){
                     sample.setName2(name);
                     showMenu(turn );
                 break;
                 }
                     System.out.println("Error");
                     showMenu(turn );
                     break;
             }
             case 2: {
                 System.out.println("2"); //write s.t
                 showMenu(turn);

             }
             case 3 :{//write st.
                 System.out.println("3");
                 showMenu(turn);
                 break;
             }
             case 4 :{
                 if(turn.equals("first")){
                     showMenu(turn);
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
        sample.Start();
        String name1 = sample.getName1();
        String name2 = sample.getName2();
        showMenu(t);
        choices(t,name1,name2);

    }
}