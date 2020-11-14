
import java.util.Scanner;

public class Name {
    private String name1;
    private String name2;
    Scanner scan = new Scanner(System.in);

    public Name(){}

    public void Start(){
        System.out.println("First Player,Type Your Name Please.");
        name1 = scan.next();
        System.out.println("Second Player,Type Your Name Please.");
        name2 = scan.next();
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

