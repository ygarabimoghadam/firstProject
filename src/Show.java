import com.diogonunes.jcolor.Attribute;
import java.util.ArrayList;
import java.util.Scanner;
import static com.diogonunes.jcolor.Ansi.colorize;
/**
 * this class print all the maps that exist in the game .
 * map that shows all the places include jangal , shahr , ...
 * maps that game choose for armies ' place
 * maps that players chose how its army be
 * updating map .
 */
public class Show {
    private ArrayList<String> colors = new ArrayList<>();
    private ArrayList<Integer> rowsarbaz = new ArrayList<>();
    private ArrayList<Integer> colsarbaz = new ArrayList<>();
    private ArrayList<Integer> rowtank = new ArrayList<>();
    private ArrayList<Integer> coltank = new ArrayList<>();
    private ArrayList<Integer> rowbomb = new ArrayList<>();
    private ArrayList<Integer> colbomb = new ArrayList<>();
    private ArrayList<Integer> rowsarbazallied = new ArrayList<>();
    private ArrayList<Integer> colsarbazallied = new ArrayList<>();
    private ArrayList<Integer> rowtankallied = new ArrayList<>();
    private ArrayList<Integer> coltankallied = new ArrayList<>();
    private ArrayList<Integer> rowsarbazaxisf = new ArrayList<>();
    private ArrayList<Integer> colsarbazaxisf = new ArrayList<>();
    private ArrayList<Integer> rowtankaxisf = new ArrayList<>();
    private ArrayList<Integer> coltankaxisf = new ArrayList<>();
    private ArrayList<Integer> rowbomballiedf = new ArrayList<>();
    private ArrayList<Integer> colbomballiedf = new ArrayList<>();
    private ArrayList<Integer> rowsarbazalliedf = new ArrayList<>();
    private ArrayList<Integer> colsarbazalliedf = new ArrayList<>();
    private ArrayList<Integer> rowtankalliedf = new ArrayList<>();
    private ArrayList<Integer> coltankalliedf = new ArrayList<>();
    Emoji e = new Emoji();
    Scanner scan = new Scanner(System.in);
    Places myplace = new Places();
    MyArmy myarm = new MyArmy();

    private int r;
    private int c;

    public Show() {}


    public void addColors() {
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
        colors.add(ConsoleColors.YELLOW); }
    /***
     * map that shows water , jangal , ... the first map that shows in the game
     */
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
                if ((z == 0 && k == 0) || (z == 1 && k == 0) || (z == 6 && k == 1) || (z == 5 && k == 2) || (z == 5 && k == 4) || (z == 11 && k == 4) || (z == 4 && k == 5) || (z == 10 && k == 5)) {
                    System.out.print(s + "*   " + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.GREEN + e.add("tape") + ConsoleColors.RESET);
                    System.out.print(s + "   *" + ConsoleColors.RESET);
                    continue;
                }

                if ((z == 4 && k == 0) || (z == 0 && k == 3)) {
                    System.out.print(s + "*   " + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.RED + e.add("pol") + ConsoleColors.RESET);
                    System.out.print(s + "   *" + ConsoleColors.RESET);
                    continue;
                }

                if ((z == 1 && k == 1) || (z == 2 && k == 1) || (z == 3 && k == 1) || (z == 1 && k == 2) || (z == 0 && k == 4)) {
                    System.out.print(s + " *  " + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.BLUE + e.add("water") + ConsoleColors.RESET);
                    System.out.print(s + "  * " + ConsoleColors.RESET);
                    continue;
                }

                if ((z == 9 && k == 2) || (z == 12 && k == 2) || (z == 1 && k == 3) || (z == 3 && k == 3) || (z == 11 && k == 3) || (z == 1 && k == 4) || (z == 8 && k == 4) || (z == 12 && k == 4)
                        || (z == 3 && k == 5) || (z == 11 && k == 5) || (z == 7 && k == 6) || (z == 8 && k == 6) || (z == 3 && k == 9) || (z == 4 && k == 9) || (z == 8 && k == 9)) {
                    System.out.print(s + " *   " + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.CYAN + e.add("jangal") + ConsoleColors.RESET);
                    System.out.print(s + "  *" + ConsoleColors.RESET);
                    continue;
                }

                if (z == 4 && k == 1) {
                    System.out.print(s + " *   " + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.RED + e.add("panahgah") + ConsoleColors.RESET);
                    System.out.print(s + "  * " + ConsoleColors.RESET);
                    continue;
                }

                if ((z == 3 && k == 0) || (z == 0 && k == 2) || (z == 6 && k == 4) || (z == 10 && k == 4) || (z == 2 && k == 6) || (z == 11 && k == 8)) {
                    System.out.print(s + " *   " + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.YELLOW + e.add("shahr") + ConsoleColors.RESET);
                    System.out.print(s + "  * " + ConsoleColors.RESET);
                    continue;
                }

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

    /**
     * game map for how armies place in teh game
     */
    public void MapWithArmyBeforeStart() {
        addColors();
        myarm.add();
        rowsarbazaxisf = myarm.getRowsarbazax();
        colsarbazaxisf = myarm.getColsarbazax();
        rowtankaxisf = myarm.getRowtankax();
        coltankaxisf = myarm.getColtankax();
        rowsarbazalliedf = myarm.getRowsarbazallied();
        colsarbazalliedf = myarm.getColsarbazallied();
        rowtankalliedf = myarm.getRowtankallied();
        coltankalliedf = myarm.getColtankallied();
        rowbomballiedf = myarm.getRowbomb();
        colbomballiedf = myarm.getColbomb();
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
                if((k==rowsarbazaxisf.get(0)&&z==colsarbazaxisf.get(0))||(k==rowsarbazaxisf.get(1)&&z==colsarbazaxisf.get(1))||(k==rowsarbazaxisf.get(2)&&z==colsarbazaxisf.get(2))||
                        (k==rowsarbazaxisf.get(3)&&z==colsarbazaxisf.get(3))||(k==rowsarbazaxisf.get(4)&&z==colsarbazaxisf.get(4))||(k==rowsarbazaxisf.get(5)&&z==colsarbazaxisf.get(5))||(k==rowsarbazaxisf.get(6)&&z==colsarbazaxisf.get(6))) {
                    System.out.print(str + " *  " + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.CYAN + e.add("sarbaz") + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.GREEN + "/4" + ConsoleColors.RESET);
                    System.out.print(str + " *" + ConsoleColors.RESET);
                    continue;
                }
               if ((k==rowsarbazalliedf.get(0)&&z==colsarbazalliedf.get(0))||(k==rowsarbazalliedf.get(1)&&z==colsarbazalliedf.get(1))||(k==rowsarbazalliedf.get(2)&&z==colsarbazalliedf.get(2))|| (k==rowsarbazalliedf.get(3)&&z==colsarbazalliedf.get(3))||
                       (k==rowsarbazalliedf.get(4)&&z==colsarbazalliedf.get(4))||(k==rowsarbazalliedf.get(5)&&z==colsarbazalliedf.get(5))||(k==rowsarbazalliedf.get(6)&&z==colsarbazalliedf.get(6))||(k==rowsarbazalliedf.get(7)&&z==colsarbazalliedf.get(7))||(k==rowsarbazalliedf.get(8)&&z==colsarbazalliedf.get(8))) {
                    System.out.print(str + " *  " + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.CYAN + e.add("sarbaz") + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.BLUE + "/4" + ConsoleColors.RESET);
                    System.out.print(str + " *" + ConsoleColors.RESET);
                    continue;
                }

                if ((k==rowbomballiedf.get(0)&&z==colbomballiedf.get(0))||(k==rowbomballiedf.get(1)&&z==colbomballiedf.get(1))) {
                    System.out.print(str + "*  " + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.BLACK + e.add("bomb") + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.BLUE + "/2" + ConsoleColors.RESET);
                    System.out.print(str + "  * " + ConsoleColors.RESET);
                    continue;
                }

                if ((k==rowtankaxisf.get(0)&&z==coltankaxisf.get(0))||(k==rowtankaxisf.get(1)&&z==coltankaxisf.get(1))||(k==rowtankaxisf.get(2)&&z==coltankaxisf.get(2))||
                        (k==rowtankaxisf.get(3)&&z==coltankaxisf.get(3))||(k==rowtankaxisf.get(4)&&z==coltankaxisf.get(4))||(k==rowtankaxisf.get(5)&&z==coltankaxisf.get(5))) {
                    System.out.print(str + " *  " + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.RED + e.add("tank") + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.GREEN + "/4" + ConsoleColors.RESET);
                    System.out.print(str + " *" + ConsoleColors.RESET);
                    continue;
                }

                if ((k==rowtankalliedf.get(0)&&z==coltankalliedf.get(0))||(k==rowtankalliedf.get(1)&&z==coltankalliedf.get(1))||(k==rowtankalliedf.get(2)&&z==coltankalliedf.get(2))) {
                    System.out.print(str + " *  " + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.RED + e.add("tank") + ConsoleColors.RESET);
                    System.out.print(ConsoleColors.BLUE + "/4" + ConsoleColors.RESET);
                    System.out.print(str + " *" + ConsoleColors.RESET);
                    continue;

                }

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

    public void getInput() {
        r = scan.nextInt();
        c = scan.nextInt();
    }

    public void pickSoldiers(String name) {
        int v = 0;
        int a = 0;
        System.out.println("pick your soldiers.");
        //print your row and col
        if (name == "Axis") {
            for (v = 0; v < 7; v++) {
                getInput();
                String locate = myplace.locationFinding(r, c);
                if ((locate.equals("water")) || (locate.equals("shahr")) || (locate.equals("panahgah"))) {
                    System.out.println(r+","+c);
                    System.out.println("this is "+locate);
                    System.out.println("pick again ");
                    pickSoldiers(name);
                }
                rowsarbaz.add(r);
                colsarbaz.add(c);
            }
        }
        if(name.equals("Allied")){
            for (a = 0; a < 9; a++) {
                getInput();
                String locate = myplace.locationFinding(r, c);
                if ((locate.equals("water")) || (locate.equals("shahr")) || (locate.equals("panahgah"))) {
                    System.out.println(r+","+c);
                    System.out.println("this is "+locate);
                    System.out.println("pick again");

                    pickSoldiers(name);
                }
                rowsarbazallied.add(r);
                colsarbazallied.add(c);
            }

        }
    }

    public void picktank(String name) {
        System.out.println("pick your tanks.");
        //print your row and col
        int s = 0;
        int al = 0;
        if (name.equals("Axis")) {
            for (s = 0; s < 6; s++) {
                getInput();
                String locate = myplace.locationFinding(r, c);
                if ((locate.equals("water")) || (locate.equals("shahr")) || (locate.equals("panahgah"))) {
                    System.out.println(r+","+c);
                    System.out.println("this is "+locate);
                    System.out.println("pick again ");
                    picktank(name);
                }
                rowtank.add(r);
                coltank.add(c);
            }
        }
        if (name.equals("Allied")) {
            for (al = 0; al < 3; al++) {
                getInput();
                String locate = myplace.locationFinding(r, c);
                if ((locate.equals("water")) || (locate.equals("shahr")) || (locate.equals("panahgah"))) {
                    System.out.println(r+","+c);
                    System.out.println("this is "+locate);
                    System.out.println("pick again ");
                    picktank(name);
                }
                rowtankallied.add(r);
                coltankallied.add(c);
            }
        }
    }

    public void pickbomb(String name){
        System.out.println("pick your bombs.");
        int b = 0;
        if (name.equals("Allied")) {
            for (b = 0; b < 2; b++) {
                getInput();
                String locate = myplace.locationFinding(r, c);
                if ((locate.equals("water")) || (locate.equals("shahr")) || (locate.equals("panahgah"))) {
                    System.out.println(r+","+c);
                    System.out.println("this is "+locate);
                    System.out.println("pick again ");
                    pickbomb(name);
                }
                rowbomb.add(r);
                colbomb.add(c);
            }
        }
    }

    public ArrayList<Integer> getRowsarbaz() {
        return rowsarbaz;
    }

    public void setRowsarbaz(ArrayList<Integer> rowsarbaz) {
        this.rowsarbaz = rowsarbaz;
    }

    public ArrayList<Integer> getColsarbaz() {
        return colsarbaz;
    }

    public void setColsarbaz(ArrayList<Integer> colsarbaz) {
        this.colsarbaz = colsarbaz;
    }

    public ArrayList<Integer> getRowtank() {
        return rowtank;
    }

    public void setRowtank(ArrayList<Integer> rowtank) {
        this.rowtank = rowtank;
    }

    public ArrayList<Integer> getColtank() {
        return coltank;
    }

    public void setColtank(ArrayList<Integer> coltank) {
        this.coltank = coltank;
    }

    public ArrayList<Integer> getRowbomb() {
        return rowbomb;
    }

    public void setRowbomb(ArrayList<Integer> rowbomb) {
        this.rowbomb = rowbomb;
    }

    public ArrayList<Integer> getColbomb() {
        return colbomb;
    }

    public void setColbomb(ArrayList<Integer> colbomb) {
        this.colbomb = colbomb;
    }

    public ArrayList<Integer> getRowsarbazallied() {
        return rowsarbazallied;
    }

    public void setRowsarbazallied(ArrayList<Integer> rowsarbazallied) {
        this.rowsarbazallied = rowsarbazallied;
    }

    public ArrayList<Integer> getColsarbazallied() {
        return colsarbazallied;
    }

    public void setColsarbazallied(ArrayList<Integer> colsarbazallied) {
        this.colsarbazallied = colsarbazallied;
    }

    public ArrayList<Integer> getRowtankallied() {
        return rowtankallied;
    }

    public void setRowtankallied(ArrayList<Integer> rowtankallied) {
        this.rowtankallied = rowtankallied;
    }

    public ArrayList<Integer> getColtankallied() {
        return coltankallied;
    }

    public void setColtankallied(ArrayList<Integer> coltankallied) {
        this.coltankallied = coltankallied;
    }

    public void mapThatPlayerChose(String name) {

        if (name.equals("Axis")) {
            pickSoldiers(name);
            picktank(name);
            addColors();
            String str = null;
            int k = 0;
            for (k = 0; k < 3; k++) {
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
                int inr = 9 , inc = 8;
                int z = 0;
                for (z = 0; z < 13; z++) {
                    str = colors.get(z);
                    if((k==rowsarbaz.get(0)&&z==colsarbaz.get(0))||(k==rowsarbaz.get(1)&&z==colsarbaz.get(1))||(k==rowsarbaz.get(2)&&z==colsarbaz.get(2))||
                    (k==rowsarbaz.get(3)&&z==colsarbaz.get(3))||(k==rowsarbaz.get(4)&&z==colsarbaz.get(4))||(k==rowsarbaz.get(5)&&z==colsarbaz.get(5))||(k==rowsarbaz.get(6)&&z==colsarbaz.get(6)))
                    {       System.out.print(str + " *  " + ConsoleColors.RESET);
                            System.out.print(ConsoleColors.CYAN + e.add("sarbaz") + ConsoleColors.RESET);
                            System.out.print(ConsoleColors.GREEN + "/4" + ConsoleColors.RESET);
                            System.out.print(str + " *" + ConsoleColors.RESET);
                            continue;
                    }
                    if ((k==rowtank.get(0)&&z==coltank.get(0))||(k==rowtank.get(1)&&z==coltank.get(1))||(k==rowtank.get(2)&&z==coltank.get(2))||
                            (k==rowtank.get(3)&&z==coltank.get(3))||(k==rowtank.get(4)&&z==coltank.get(4))||(k==rowtank.get(5)&&z==coltank.get(5))) {
                                    System.out.print(str + " *  " + ConsoleColors.RESET);
                                    System.out.print(ConsoleColors.RED + e.add("tank") + ConsoleColors.RESET);
                                    System.out.print(ConsoleColors.GREEN + "/4" + ConsoleColors.RESET);
                                    System.out.print(str + " *" + ConsoleColors.RESET);
                                    continue;
                                }
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
        }
        if(name.equals("Allied")){
            pickSoldiers(name);
            picktank(name);
            pickbomb(name);
            addColors();
            String str = null;
            int k = 0;
            for (k = 3; k < 9; k++) {
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
                int inr = 9 , inc = 8;
                int z = 0;
                for (z = 0; z < 13; z++) {
                    str = colors.get(z);
                    if((k==rowsarbazallied.get(0)&&z==colsarbazallied.get(0))||(k==rowsarbazallied.get(1)&&z==colsarbazallied.get(1))||(k==rowsarbazallied.get(2)&&z==colsarbazallied.get(2))||
                            (k==rowsarbazallied.get(3)&&z==colsarbazallied.get(3))||(k==rowsarbazallied.get(4)&&z==colsarbazallied.get(4))||(k==rowsarbazallied.get(5)&&z==colsarbazallied.get(5))
                            ||(k==rowsarbazallied.get(6)&&z==colsarbazallied.get(6))||(k==rowsarbazallied.get(7)&&z==colsarbazallied.get(7)))
                    {       System.out.print(str + " *  " + ConsoleColors.RESET);
                        System.out.print(ConsoleColors.CYAN + e.add("sarbaz") + ConsoleColors.RESET);
                        System.out.print(ConsoleColors.BLUE + "/4" + ConsoleColors.RESET);
                        System.out.print(str + " *" + ConsoleColors.RESET);
                        continue;
                    }
                    if ((k==rowtankallied.get(0)&&z==coltankallied.get(0))||(k==rowtankallied.get(1)&&z==coltankallied.get(1))
                            ||(k==rowtankallied.get(2)&&z==coltankallied.get(2)))
                    {
                        System.out.print(str + " *  " + ConsoleColors.RESET);
                        System.out.print(ConsoleColors.RED + e.add("tank") + ConsoleColors.RESET);
                        System.out.print(ConsoleColors.BLUE + "/4" + ConsoleColors.RESET);
                        System.out.print(str + " *" + ConsoleColors.RESET);
                        continue;
                    }


                    if ((k==rowbomb.get(0)&&z==colbomb.get(0))||(k==rowbomb.get(1)&&z==colbomb.get(1))) {
                        System.out.print(str + "*  " + ConsoleColors.RESET);
                        System.out.print(ConsoleColors.BLACK + e.add("bomb") + ConsoleColors.RESET);
                        System.out.print(ConsoleColors.BLUE + "/2" + ConsoleColors.RESET);
                        System.out.print(str + "  * " + ConsoleColors.RESET);
                        continue;
                    }
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
        }
    }
}