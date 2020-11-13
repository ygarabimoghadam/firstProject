import java.util.ArrayList;

public class Show {
    private ArrayList<String> colors = new ArrayList<>();
    private int l = 0 ;

    public Show(){
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
    public void fiveSingle() {

        String s = null;


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

    }}

