import com.diogonunes.jcolor.Attribute;

import java.util.ArrayList;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Show {
    private ArrayList<String> colors = new ArrayList<>();
    Emoji e = new Emoji();
    public Show(){}
    public void addColors(){
        colors.add(ConsoleColors.RED);
        colors.add(ConsoleColors.BLUE);
        colors.add(ConsoleColors.PURPLE);
        colors.add(ConsoleColors.GREEN);
        colors.add(ConsoleColors.WHITE);
        colors.add(ConsoleColors.YELLOW);
        colors.add(ConsoleColors.BLUE);
        colors.add(ConsoleColors.RED);
        colors.add(ConsoleColors.GREEN);
        colors.add(ConsoleColors.BLUE);
        colors.add(ConsoleColors.PURPLE);
        colors.add(ConsoleColors.WHITE);
        colors.add(ConsoleColors.YELLOW);
    }
    public void firstMap() {
        addColors();
        String s = null;
        System.out.println(colorize("_______________________________________", Attribute.MAGENTA_TEXT()));
        System.out.println("here is the first map:");
        int k = 0;
            for (k = 0; k < 9; k++) {
                int i = 0;
                    for (i = 0; i < 13; i++) {
                        s = colors.get(i);
                        System.out.print(s + "  * ** *  " + ConsoleColors.RESET);
                    }
                    System.out.println();
                int j = 0;
                for (j = 0; j < 13; j++) {
                    s = colors.get(j);
                    System.out.print(s + " *      * " + ConsoleColors.RESET);
                }
                System.out.println();
                int z = 0;
                for (z = 0; z < 13; z++) {
                    s = colors.get(z);
                    if((z==0 && k== 0) || (z==1 && k== 0) || (z==6 && k== 1) || (z==5 && k== 2) || (z==5 && k== 4) || (z==11 && k== 4) || (z==4 && k== 5) || (z==10 && k== 5)){
                        System.out.print(s + "*   "+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.GREEN+e.add("tape")+ConsoleColors.RESET);
                        System.out.print(s+"   *" + ConsoleColors.RESET);
                    continue;}

                    if((z==4 && k== 0) || (z==0 && k== 3) ){
                        System.out.print(s + "*   "+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.RED+e.add("pol")+ConsoleColors.RESET);
                        System.out.print(s+"   *" + ConsoleColors.RESET);
                        continue;}

                    if((z==1 && k== 1) || (z==2 && k== 1) || (z==3 && k== 1) || (z==1 && k== 2) || (z==0 && k== 4)){
                        System.out.print(s + " *  "+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.BLUE+e.add("water")+ConsoleColors.RESET);
                        System.out.print(s+"  * " + ConsoleColors.RESET);
                        continue;}

                    if((z==9 && k== 2) || (z==12 && k== 2) || (z==1 && k== 3) || (z==3 && k== 3) || (z==11 && k== 3) || (z==1 && k== 4) || (z==8 && k== 4)  || (z==12 && k== 4)
                            || (z==3 && k== 5) || (z==11 && k== 5) || (z==7 && k== 6) || (z==8 && k== 6)  || (z==3 && k== 9) || (z==4 && k== 9) || (z==8 && k== 9)  ){
                        System.out.print(s + " *   "+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.CYAN+e.add("jangal")+ConsoleColors.RESET);
                        System.out.print(s+"  *" + ConsoleColors.RESET);
                        continue;}

                    if(z==4 && k== 1){
                        System.out.print(s + " *   "+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.RED+e.add("panahgah")+ConsoleColors.RESET);
                        System.out.print(s+"  * " + ConsoleColors.RESET);
                        continue;}

                    if((z==3 && k== 0) || (z==0 && k== 2) || (z==6 && k== 4) || (z==10 && k== 4) || (z==2 && k== 6) || (z==11 && k== 8)){
                        System.out.print(s + " *   "+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.YELLOW+e.add("shahr")+ConsoleColors.RESET);
                        System.out.print(s+"  * " + ConsoleColors.RESET);
                        continue;}

                    System.out.print(s + "*        *" + ConsoleColors.RESET);
                }
                System.out.println();
                int e = 0;
                for (e = 0; e < 13; e++) {
                    s = colors.get(e);
                    System.out.print(s + " *      * " + ConsoleColors.RESET);
                }
                System.out.println();
                int r = 0;
                for (r = 0; r < 13; r++) {
                    s = colors.get(r);
                    System.out.print(s + "  * ** *  " + ConsoleColors.RESET);
                }
                System.out.println();
            }
        System.out.println();
        }

        public void MapWithArmyBeforeStart(){
            addColors();
            System.out.println(colorize("_______________________________________", Attribute.MAGENTA_TEXT()));
            System.out.println("here is the first map of your all army:");
            String str = null;
            int k = 0;
            for (k = 0; k < 9; k++) {
                int i = 0;
                for (i = 0; i < 13; i++) {
                    str = colors.get(i);
                    System.out.print(str + "  * ** *  " + ConsoleColors.RESET);
                }
                System.out.println();
                int j = 0;
                for (j = 0; j < 13; j++) {
                    str = colors.get(j);
                    System.out.print(str + " *      * " + ConsoleColors.RESET);
                }
                System.out.println();
                int z = 0;
                for (z = 0; z < 13; z++) {
                    str = colors.get(z);
                    if((z==1&&k==0)||(z==2&&k==0)||(z==7&&k==0)||(z==10&&k==0)||(z==5&&k==1)||(z==9&&k==1)){
                        System.out.print(str + " *  "+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.CYAN+e.add("sarbaz")+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.GREEN+"/4"+ConsoleColors.RESET);
                        System.out.print(str+" *" + ConsoleColors.RESET);
                        continue;}

                    if((z==12&& k==0)){
                        System.out.print(str + "  *  "+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.CYAN+e.add("sarbaz")+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.GREEN+"/4"+ConsoleColors.RESET);
                        System.out.print(str+" *" + ConsoleColors.RESET);
                        continue;}


                    if((z==1&&k==4)||(z==6&&k==4)||(z==8&&k==4)||(z==11&&k==4)||(z==4&&k==5)||(z==7&&k==6)||(z==10&&k==7)||(z==10&& k==7)||(z==8&&k==8)){
                        System.out.print(str + " *  "+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.CYAN+e.add("sarbaz")+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.BLUE+"/4"+ConsoleColors.RESET);
                        System.out.print(str+" *" + ConsoleColors.RESET);
                        continue;}



                    if((z==2 && k== 7) || (z==6 && k== 7) ){
                        System.out.print(str + "*  "+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.BLACK+e.add("bomb")+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.BLUE+"/2"+ConsoleColors.RESET);
                        System.out.print(str+"  * " + ConsoleColors.RESET);
                        continue;}

                    if((z==0&&k==0)||(z==5&&k==0)||(z==8&&k==0)||(z==11&&k==0)||(z==6&&k==1)||(z==11&&k==1)){
                        System.out.print(str + " *  "+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.RED+e.add("tank")+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.GREEN+"/4"+ConsoleColors.RESET);
                        System.out.print(str+" *" + ConsoleColors.RESET);
                        continue;}

                    if((z==0&&k==8)||(z==1&&k==8)||(z==12&&k==8)){
                        System.out.print(str + " *  "+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.RED+e.add("tank")+ConsoleColors.RESET);
                        System.out.print(ConsoleColors.BLUE+"/4"+ConsoleColors.RESET);
                        System.out.print(str+" *" + ConsoleColors.RESET);
                        continue;}

                    System.out.print(str + "*        *" + ConsoleColors.RESET);
                }
                System.out.println();
                int e = 0;
                for (e = 0; e < 13; e++) {
                    str = colors.get(e);
                    System.out.print(str + " *      * " + ConsoleColors.RESET);
                }
                System.out.println();
                int r = 0;
                for (r = 0; r < 13; r++) {
                    str = colors.get(r);
                    System.out.print(str + "  * ** *  " + ConsoleColors.RESET);
                }
                System.out.println();
            }
            System.out.println();
        }
}

