import java.util.Random;

public class MyRandom {

    public MyRandom(){}

    public int generate1(){
        Random r = new Random();
        int tmp = r.nextInt(2)+1;
        return tmp;
    }

    public int generate6(){
        Random r = new Random();
        int tmp = r.nextInt(40)+1;
        return tmp;
    }


}
