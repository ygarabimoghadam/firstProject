public class Carts {
    Emoji emoj = new Emoji();
    public Carts(){
    }

    public void printCards(){

        int i = 0 ;
        int j= 0 ;
        System.out.println("+-----------------------+");
        for(i = 0 ; i<5 ; i++){
            System.out.print("| ");
            if(i==4){
                System.out.print(ConsoleColors.BLUE_BACKGROUND+"|                   |"+ConsoleColors.RESET);
                System.out.println(" | ");
                continue;
            }
            System.out.print(ConsoleColors.BLUE_BACKGROUND+"|                   |"+ConsoleColors.RESET);
            System.out.println(" | ");

        }
        System.out.println("+-----------------------+");

    }
}
