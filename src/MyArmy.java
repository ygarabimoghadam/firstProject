import java.util.ArrayList;

/**
 * this class give all the places that armies should be in there in the first map .
 * map that we decide how armies be in the map ot the players .
 */
public class MyArmy {
    private ArrayList<Integer> rowsarbazax0 = new ArrayList<>();
    private ArrayList<Integer> colsarbazax0 = new ArrayList<>();
    private ArrayList<Integer> rowtankax0 = new ArrayList<>();
    private ArrayList<Integer> coltankax0 = new ArrayList<>();
    private ArrayList<Integer> rowbomb0 = new ArrayList<>();
    private ArrayList<Integer> colbomb0 = new ArrayList<>();
    private ArrayList<Integer> rowsarbazallied0 = new ArrayList<>();
    private ArrayList<Integer> colsarbazallied0 = new ArrayList<>();
    private ArrayList<Integer> rowtankallied0 = new ArrayList<>();
    private ArrayList<Integer> coltankallied0 = new ArrayList<>();

    public MyArmy(){}

    public void add(){
        rowsarbazax0.add(0);
        rowsarbazax0.add(0);
        rowsarbazax0.add(0);
        rowsarbazax0.add(0);
        rowsarbazax0.add(0);
        rowsarbazax0.add(1);
        rowsarbazax0.add(1);
        colsarbazax0.add(1);
        colsarbazax0.add(2);
        colsarbazax0.add(07);
        colsarbazax0.add(10);
        colsarbazax0.add(12);
        colsarbazax0.add(5);
        colsarbazax0.add(9);
        rowtankax0.add(0);
        rowtankax0.add(0);
        rowtankax0.add(0);
        rowtankax0.add(0);
        rowtankax0.add(1);
        rowtankax0.add(1);
        coltankax0.add(0);
        coltankax0.add(5);
        coltankax0.add(8);
        coltankax0.add(11);
        coltankax0.add(6);
        coltankax0.add(11);
        rowtankallied0.add(8);
        rowtankallied0.add(8);
        rowtankallied0.add(8);
        coltankallied0.add(0);
        coltankallied0.add(1);
        coltankallied0.add(12);
        rowbomb0.add(7);
        rowbomb0.add(7);
        colbomb0.add(2);
        colbomb0.add(6);
        rowsarbazallied0.add(4);
        rowsarbazallied0.add(4);
        rowsarbazallied0.add(4);
        rowsarbazallied0.add(4);
        rowsarbazallied0.add(5);
        rowsarbazallied0.add(6);
        rowsarbazallied0.add(7);
        rowsarbazallied0.add(7);
        rowsarbazallied0.add(8);
        colsarbazallied0.add(1);
        colsarbazallied0.add(6);
        colsarbazallied0.add(8);
        colsarbazallied0.add(11);
        colsarbazallied0.add(4);
        colsarbazallied0.add(7);
        colsarbazallied0.add(1);
        colsarbazallied0.add(10);
        colsarbazallied0.add(8);
    }

    public ArrayList<Integer> getRowsarbazax() {
        return rowsarbazax0;
    }

    public void setRowsarbazax(ArrayList<Integer> rowsarbazax) {
        this.rowsarbazax0 = rowsarbazax;
    }

    public ArrayList<Integer> getColsarbazax() {
        return colsarbazax0;
    }

    public void setColsarbazax(ArrayList<Integer> colsarbazax) {
        this.colsarbazax0 = colsarbazax;
    }

    public ArrayList<Integer> getRowtankax() {
        return rowtankax0;
    }

    public void setRowtankax(ArrayList<Integer> rowtankax) {
        this.rowtankax0 = rowtankax;
    }

    public ArrayList<Integer> getColtankax() {
        return coltankax0;
    }

    public void setColtankax(ArrayList<Integer> coltankax) {
        this.coltankax0 = coltankax;
    }

    public ArrayList<Integer> getRowbomb() {

        return rowbomb0;
    }

    public void setRowbomb(ArrayList<Integer> rowbomb) {
        this.rowbomb0 = rowbomb;
    }

    public ArrayList<Integer> getColbomb() {
        return colbomb0;
    }

    public void setColbomb(ArrayList<Integer> colbomb) {
        this.colbomb0 = colbomb;
    }

    public ArrayList<Integer> getRowsarbazallied() {
        return rowsarbazallied0;
    }

    public void setRowsarbazallied(ArrayList<Integer> rowsarbazallied) {
        this.rowsarbazallied0 = rowsarbazallied;
    }

    public ArrayList<Integer> getColsarbazallied() {
        return colsarbazallied0;
    }

    public void setColsarbazallied(ArrayList<Integer> colsarbazallied) {
        this.colsarbazallied0 = colsarbazallied;
    }

    public ArrayList<Integer> getRowtankallied() {
        return rowtankallied0;
    }

    public void setRowtankallied(ArrayList<Integer> rowtankallied) {
        this.rowtankallied0 = rowtankallied;
    }

    public ArrayList<Integer> getColtankallied() {
        return coltankallied0;
    }

    public void setColtankallied(ArrayList<Integer> coltankallied) {
        this.coltankallied0 = coltankallied;
    }

}