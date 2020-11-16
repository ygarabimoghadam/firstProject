import java.util.Scanner;

public class StartPlaying {
    Show sh = new Show();
    MyRandom random = new MyRandom();
    Name sample = new Name();
    Scanner scanner = new Scanner(System.in);
    boolean Allied = false;
    boolean Axis = false;
    public StartPlaying(){}
    public void firstStep_Carts(String name1 , String name2){


        int one = 0;
        int two = 0 ;
        sh.firstMap();
        int tur = random.generate1();
        if(tur == 1) {
            System.out.println(name1 + " Play as Allied Team.");
            System.out.println(name2 + " Play as Axis Team.");
            one = 1;
        }
        else {
            System.out.println(name2 + " Play as Allied Team.");
            System.out.println(name1 + " Play as Axis Team.");
            two = 2;
        }

        System.out.println("");//write st
        sh.MapWithArmyBeforeStart();
        int turn1 = random.generate1();

        if(turn1 == 1) {
            System.out.println(name1 + ": your turn ");
            if (one == 1){
                random.whichCart(4);
                Allied = true ;}
            else{
                random.whichCart(2);
                Axis = true ;}
        }
        else{
            System.out.println(name2 + ": your turn ");
            if(two == 2){
                random.whichCart(4);
                 Allied = true ;   }
            else{
                random.whichCart(2);
                Axis = true ;}
        }
    }

    public void secondStep_giveDirection(){
       String order = scanner.next();
       if(order.equals("order 1 units")){
           System.out.println("select your army");
           String select =scanner.next();
           if(Axis){
               if(select.equals("tank")){
                   System.out.println("which one? how?");
                   sh.MapWithArmyBeforeStart();
                   System.out.println();//jadval naghshe
                   System.out.println();//direction
               }
           }
       }
    }
}
