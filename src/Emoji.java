/**
 * this method provide all the emojies that used in the game .
 * unicode .
 *
 */
public class Emoji {

    public Emoji(){}

    public String   add(String inp) {
        String tape = "\uD83C\uDF04";
        String pol = "⛩";
        String water = "\uD83D\uDCA7";
        String jangal = "\uD83C\uDF43";
        String shahr = "\uD83C\uDFD5";
        String panahgah = "\uD83C\uDFE0";
        String bomb = "\uD83D\uDCA3";
        String tas = "\uD83C\uDFB2";
        String sarbaz = "\uD83D\uDC6E";
        String tank = "\uD83C\uDFD7";
        String medal = "\uD83C\uDF96";
        if(inp== "tape") { return tape;}
        if(inp== "pol"){ return pol;}
        if(inp== "water"){return water;}
        if(inp== "jangal"){return jangal;}
        if(inp== "shahr"){return shahr;}
        if(inp== "panahgah"){return panahgah;}
        if(inp== "bomb") { return bomb;}
        if(inp== "sarbaz") { return sarbaz;}
        if(inp== "tank") { return tank;}
        if(inp== "tas") { return tas;}
        if(inp== "medal") { return medal;}
        return  null;
    }
}