import java.util.Random;
import java.util.Scanner;

public class Menu {
    Name sample = new Name();
    Scanner c = new Scanner(System.in);
    Show sh = new Show();
    MyRandom random = new MyRandom();
    private int option ;

    public Menu(){}

    public void showMenu(int i){
        sample.Start();
        System.out.println("Player"+i+":");
        System.out.println("1-Correct Your Name");
        System.out.println("2-About Us");
        System.out.println("3-Guide For Playing");
        System.out.println("4-Start Playing");
        System.out.println("Type The Number Of Your Option.");
        option = c.nextInt();
    }

    public void choices(int i){
        showMenu(i);
         switch (option){

             case 1: {
                 String name = c.next();
                 if (i == 1)
                     sample.setName1(name);
                 if (i == 2)
                     sample.setName2(name);
                 else
                     System.out.println("Error");
             }

             case 2:
                 System.out.println(); //write s.t

             case 3 :

             case 4 :{
                 sh.firstMap();
                 int turn = random.generate1();
                 if(turn == 1) {
                     System.out.println(sample.getName1() + "You Play as Allied Team.");
                     System.out.println(sample.getName2() + "You Play as Axis Team.");
                 }
                 else {
                     System.out.println(sample.getName2() + "You Play as Allied Team.");
                     System.out.println(sample.getName1() + "You Play as Axis Team.");
                 }
                 System.out.println("");//write st
                 sh.MapWithArmyBeforeStart();
                 int turn1 = random.generate1();
                 

             }

             default:
                 System.out.println("Error");
         }

    }
}