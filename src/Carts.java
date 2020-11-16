import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class Carts {
    Attribute one = RED_TEXT();
    Attribute two = BLUE_TEXT();
    Attribute three = MAGENTA_TEXT();
    Attribute four = BRIGHT_CYAN_TEXT();
    Attribute five = YELLOW_TEXT();

    Attribute oneb = BRIGHT_RED_BACK();
    Attribute twob = BRIGHT_BLUE_BACK();
    Attribute threeb = BRIGHT_MAGENTA_BACK();
    Attribute fourb = BRIGHT_CYAN_BACK();
    Attribute fiveb = BRIGHT_YELLOW_BACK();
    Attribute choice1 ;
    Attribute choice2;

    private String number ;

    public Carts(){}

    public void printCards(int c ){
        if(c ==1){
            choice1 = one ;
            choice2 = oneb;
            number = " 1  "; }
        if(c ==2){
            choice1 = two ;
            choice2= twob;
            number = " 2  ";}
        if(c ==3){
            choice1 = three;
            choice2= threeb;
            number = " 3  ";}
        if(c ==4){
           choice1 = four ;
           choice2= fourb;
           number = " 4  ";}
        if(c ==5){
            choice1= five ;
            choice2= fiveb;
            number = "3of1";}
        int i = 0 ;
        System.out.println(colorize( "+-----------------------+",choice1));
        for(i = 0 ; i<5 ; i++){
            System.out.print(colorize("| ",choice1));
            if(i==2){
                System.out.print(colorize("|", choice1, choice2));
                System.out.print(colorize("  order"+number+ "Units",BRIGHT_BLACK_TEXT(),choice2));
                System.out.print(colorize("   |", choice1, choice2));
                System.out.println(colorize(" |",choice1));
                continue;
            }
            System.out.print(colorize("|                   |",choice1,choice2));
            System.out.println(colorize(" | ",choice1));
        }
        System.out.println(colorize( "+-----------------------+",choice1));
    }
}
