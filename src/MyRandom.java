import java.util.ArrayList;
import java.util.Random;

public class MyRandom {
    private int randomNum;
    Carts carts = new Carts();

    public MyRandom() {}

    public int generate1() {
        Random r = new Random();
        int num = r.nextInt(2) + 1;
        return num;
    }

    public int  generate6() {

        Random r = new Random();
        randomNum = r.nextInt(40) + 1;
        return randomNum;
    }

    public void whichCart(int number) {
        if (number == 4)
            AlliedCarts();
        if(number==2)
            AxisCarts();
    }

    public void AlliedCarts() {
        int z = 0;
        for (z = 0; z < 4; z++) {
            int rand = generate6();
            if (rand >= 1 && rand <= 6)
                carts.printCards(1);
            if (rand >= 7 && rand <= 19)
                carts.printCards(2);
            if (rand >= 20 && rand <= 29)
                carts.printCards(3);
            if (rand >= 30 && rand <= 35)
                carts.printCards(4);
            if (rand >= 36 && rand <= 40)
                carts.printCards(5);
        }
    }

    public void AxisCarts(){
        int z = 0;
            for(z = 0 ; z<2 ; z++){
                int rand = generate6();
                if(rand>=1 && rand<=6)
                    carts.printCards(1);
                if(rand>=7 && rand<=19)
                    carts.printCards(2);
                if(rand>=20 && rand<=29)
                    carts.printCards(3);
                if(rand>=30 && rand<=35)
                    carts.printCards(4);
                if(rand>=36 && rand<=40)
                    carts.printCards(5);
            }
    }
}
