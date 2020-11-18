import java.util.ArrayList;
import java.util.Scanner;

/**
 * this class after menu start the game by showing map and after that give direction and attack ...
 */
public class StartPlaying {
    Show sh = new Show();
    MyRandom random = new MyRandom();
    Places selectPlace = new Places();
    MyArmy myarm = new MyArmy();
    Scanner scanner = new Scanner(System.in);
    boolean Allied = false;
    boolean Axis = false;
    boolean choseMap = false;
    boolean Attack = false;
    Tas tas = new Tas();
    private ArrayList<Integer> rowsarbazchose = new ArrayList<>();
    private ArrayList<Integer> colsarbazchose = new ArrayList<>();
    private ArrayList<Integer> rowtankchose = new ArrayList<>();
    private ArrayList<Integer> coltankchose = new ArrayList<>();
    private ArrayList<Integer> rowbombchose = new ArrayList<>();
    private ArrayList<Integer> colbombchose = new ArrayList<>();
    private ArrayList<Integer> rowsarbazalliedchose = new ArrayList<>();
    private ArrayList<Integer> colsarbazalliedchose = new ArrayList<>();
    private ArrayList<Integer> rowtankalliedchose = new ArrayList<>();
    private ArrayList<Integer> coltankalliedchose = new ArrayList<>();

    public StartPlaying() {
    }

    public void firstStep_Carts(String name1, String name2) {
        int one = 0;
        int two = 0;
        sh.firstMap();
        int tur = random.generate1();
        if (tur == 1) {
            System.out.println(name1 + " Play as Allied Team.");
            System.out.println(name2 + " Play as Axis Team.");
            one = 1;
        } else {
            System.out.println(name2 + " Play as Allied Team.");
            System.out.println(name1 + " Play as Axis Team.");
            two = 2;
        }

        System.out.println("1_do u want the first map ");
        System.out.println("2_do u want pick your army by your self?");
        int pick = scanner.nextInt();
        if (pick == 1) {
            sh.MapWithArmyBeforeStart();
        }
        if (pick == 2) {
            System.out.println("axis pick");
            String p = "Axis";
            sh.mapThatPlayerChose(p);
            System.out.println("Allied pick ");
            String pi = "Allied";
            sh.mapThatPlayerChose(pi);
            choseMap = true;
        }
        int turn1 = random.generate1();

        if (turn1 == 1) {
            System.out.println(name1 + ": your turn ");
            if (one == 1) {
                random.whichCart(4);
                Allied = true;
            } else {
                random.whichCart(2);
                Axis = true;
            }
        } else {
            System.out.println(name2 + ": your turn ");
            if (two == 2) {
                random.whichCart(4);
                Allied = true;
            } else {
                random.whichCart(2);
                Axis = true;
            }
        }
    }

    public void secondStep_giveDirection() {
        Axis= true ;
        int row;
        int col;
        int counter;
        String direction;
        String place;
        String order = scanner.next();
        if (order.equals("1")) {
            System.out.println("select your army");
            String select = scanner.next();
            if (Axis) {
                if (select.equals("t")) {
                    System.out.println("which one? how?");
                    sh.MapWithArmyBeforeStart();
                    System.out.println();//jadval naghshe
                    System.out.println();//direction
                    row = scanner.nextInt();
                    col = scanner.nextInt();
                    counter = scanner.nextInt();
                    direction = scanner.next();
                    System.out.println("hi");
                    if (row == 0 && (direction.equals("U") || direction.equals("UR") || direction.equals("UL"))) {
                        System.out.println("1");//s.t
                        secondStep_giveDirection();
                    }
                    if (row == 8 && (direction.equals("D") || direction.equals("DR") || direction.equals("DL"))) {
                        System.out.println("2");
                        secondStep_giveDirection();
                    }
                    if (counter > 4) {
                        System.out.println("3");
                        secondStep_giveDirection();
                    }
                    if (direction.equals("U")) {
                        int temp = 0;
                        int j = 0;
                        for (j = 0; j < counter; j++) {
                            temp = row - j;
                            place = selectPlace.locationFinding(temp, col);

                            if (place.equals("shahr") || place.equals("panahgah") || place.equals("water")) {
                                System.out.println("4");
                                break;
                            }
                            secondStep_giveDirection();
                            break;
                        }


                        if (choseMap) {
                            int temprow = 0;

                            rowtankchose = sh.getRowtank();
                            coltankchose = sh.getColtank();
                            int z = 0;
                            for (z = 0; z < counter; z++) {
                                temprow = row - z;
                                if (rowtankchose.contains(temprow) && coltankchose.contains(col)) {
                                    System.out.println();
                                    secondStep_giveDirection();
                                }
                            }
                            int index = rowtankchose.indexOf(row);
                            rowtankchose.remove(index);
                            rowtankchose.add(index, temprow);
                            sh.setRowtank(rowtankchose);
                            sh.mapThatPlayerChose("Axis");
                            Attack = true;
                            String selecta;
                            int rowa;
                            int cola;
                            if (Attack) {
                                selecta = tas.canAttack();
                                System.out.println(" you can attack to " + selecta);
                                if(selecta.equals("nothing")){
                                return ;}
                                System.out.println("write the exact house of the army you want to attack that?");
                                rowa = scanner.nextInt();
                                cola = scanner.nextInt();
                                if (selecta.equals("sarbaz")) {
                                    if(sh.getRowsarbazallied().contains(rowa) && sh.getColsarbazallied().contains(cola)){
                                        int home =row-rowa;
                                        boolean hamle  =tas.isItAttack(select,home);
                                        if(hamle)
                                            System.out.println("you can attack");
                                        else
                                            System.out.println("you cannot attack");
                                    }
                                }
                            }
                        }
                        else {
                            int temproww = 0;
                            rowtankchose = myarm.getRowtankax();
                            coltankchose = myarm.getColtankax();
                            int z = 0;
                            for (z = 0; z < counter; z++) {
                                temproww = row - z;
                                if (rowtankchose.contains(temproww) && coltankchose.contains(col)) {
                                    System.out.println("error");
                                    secondStep_giveDirection();
                                }
                            }
                            int index = rowtankchose.indexOf(row);
                            rowtankchose.remove(index);
                            rowtankchose.add(index, temproww);
                            myarm.setRowtankax(rowtankchose);
                            sh.MapWithArmyBeforeStart();
                            Attack = true;
                            String selecta;
                            int rowa;
                            int cola;
                            if (Attack) {
                                selecta = tas.canAttack();
                                System.out.println(" you can attack to " + selecta);
                                if(selecta.equals("nothing")){
                                    return ;}
                                System.out.println("write the exact house of the army you want to attack that?");
                                rowa = scanner.nextInt();
                                cola = scanner.nextInt();
                                if (selecta.equals("sarbaz")) {
                                    if(myarm.getRowsarbazallied().contains(rowa) && myarm
                                            .getColsarbazallied().contains(cola)){
                                        int home =row-rowa;
                                        boolean hamle  =tas.isItAttack(select,home);
                                        if(hamle)
                                            System.out.println("you can attack");
                                        else
                                            System.out.println("you cannot attack");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}