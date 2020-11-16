
public class Places {
    public String location ;


    public Places(){
    }

    public String  locationFinding(int row , int col){
        location = "nothing";
        if((row==1 && col==1)||(row==2 && col==1)||(row==1 && col==3)||(row==2 && col==1))
            location = "water";

        if((row==0 && col==3)||(row==2 && col==0)||(row==6 && col==4)||(row==10 && col==4)||(row==6 && col==2)||(row==8 && col==11))
            location = "shahr";

        if((row==2&&col==9)||(row==2&&col==12)||(row==3&&col==1)||(row==3&&col==3)||(row==11&col==3)||(row==1&&col==4)||(row==8&&col==4)
        ||(row==12&&col==4)||(row==3&&col==5)||(row==11&&col==5)||(row==7&&col==6)||(row==8&&col==6)||(row==3&&col==9)||(row==4&&col==9)||(row==8&&col==9)
        )
            location = "jangal";

        if((row==1 && col==4))
            location = "panahgah";

        if((row==0 && col==4)||(row==3 && col==0))
            location = "pol";

        return location; }
    }
