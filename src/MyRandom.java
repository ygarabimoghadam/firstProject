import java.util.Random;

/**
 * this class provide all the random numbers that might be needed in this game .
 */

public class MyRandom {
    private int randomNum;
    Carts carts = new Carts();

    public MyRandom() {}

    /**
     * this method decide whiche player start first .
     * @return if 1 first player start first if 2 second player.
     */
    public int generate1() {
        Random r = new Random();
        int num = r.nextInt(2) + 1;
        return num;
    }

    /**
     * this method choose one cart between all the 40 cart that exist.
     * @return from 1 to 40
     */
    public int  generate6() {

        Random r = new Random();
        randomNum = r.nextInt(40) + 1;
        return randomNum;
    }

    /**
     * this mmethod choose the carts that shows for allied team and axis team
     * @param number if =2 axis team start first and if =4 alllied team start first.
     */
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

    /**
     * thus method give a number between 1 to 6 randomly .
     * @return 1 to 6
     */
    public int  tas(){
        Random r = new Random();
        int num = r.nextInt(6) + 1;
        return num;
    }
}
