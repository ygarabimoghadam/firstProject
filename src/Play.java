import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.MAGENTA_BACK;
import static com.diogonunes.jcolor.Attribute.YELLOW_TEXT;

public class Play {
    public static void main(String [] args){
        Menu myMenu = new Menu();
        Show sh = new Show();
        Carts myCarts = new Carts();
      //  myCarts.printCards();
       // sh.MapWithArmyBeforeStart()
        //;
       // System.out.println(colorize("This text will be yellow on magenta", YELLOW_TEXT(), MAGENTA_BACK()));
        MyRandom r= new MyRandom();
        System.out.println(r.generate6());
    }
}
