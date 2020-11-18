import java.util.Scanner;

/**
 * this class give and keep the name of each player .
 */
public class Name {
    private String name1;
    private String name2;
    Scanner scan = new Scanner(System.in);

    public Name(){}

    /**
     * in the first of the game,this method give and set the name of players.
     */
    public void Start(){
        System.out.println("First Player,Type Your Name Please.");
        name1 = scan.next();
        setName1(name1);
        System.out.println("Second Player,Type Your Name Please.");
        name2 = scan.next();
        setName2(name2);
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
}

