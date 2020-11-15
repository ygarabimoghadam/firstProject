import java.util.Scanner;

public class StartPlaying {
    Show sh = new Show();
    MyRandom random = new MyRandom();
    Name sample = new Name();
    Scanner scanner = new Scanner(System.in);
    public StartPlaying(){}
    public void firstStep_Carts(){
        int one = 0;
        int two = 0 ;
        sh.firstMap();

        System.out.println("");//write st
        sh.MapWithArmyBeforeStart();
        int turn1 = random.generate1();

        if(turn1 == 1) {
            if (one == 1)
                random.whichCart(4);
            else
                random.whichCart(2);
        }
        else{
            if(two == 2)
                random.whichCart(4);
            else
                random.whichCart(2);
        }
    }

    public void secondStep_giveDirection(){




    }
}
