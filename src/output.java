public class output {

    public static final String ANSI_GREEN = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public String A = "A";
    public String D = "D";
    public void Start(){
        System.out.println(ANSI_GREEN + "Zdravím vás v objektově orientovaném tenise!" + ANSI_RESET);
        System.out.println("Pro hráče 1. zadej písmeno: A");
        System.out.println("Pro hráče 2. zadej písmeno: D");
        System.out.println("");
        System.out.println("Zvol jaký hráč začne! (A/D)");
    }
    public void Turn(){
        System.out.println("Vyber hráče 1. nebo 2. (A/D)");
    }
    public void Err(){
        System.out.println(ANSI_RED + "Neplatný krok" + ANSI_RESET);
    }
    public void P1(){
        System.out.println(ANSI_GREEN + "Hrál hráč 1." + ANSI_RESET);
    }
    public void P2(){
        System.out.println(ANSI_GREEN + "Hrál hráč 2." + ANSI_RESET);
    }
    public void Status(logic logicos){
        System.out.println("Status hry je:");
        System.out.println("Hráč " + ANSI_CYAN +  "1. " + ANSI_RESET + "má: " + ANSI_GREEN + logicos.body1 + ANSI_RESET + " | " + "Výhoda: " + ANSI_GREEN + logicos.vyhoda1 + ANSI_RESET + " | " + "Gemy: " + ANSI_GREEN + logicos.gemy1 + ANSI_RESET + " | " + "Sety: " + ANSI_GREEN + logicos.sety1 + ANSI_RESET);
        System.out.println("Hráč " + ANSI_CYAN +  "2. " + ANSI_RESET + "má: " + ANSI_GREEN + logicos.body2 + ANSI_RESET + " | " + "Výhoda: " + ANSI_GREEN + logicos.vyhoda2 + ANSI_RESET + " | " + "Gemy: " + ANSI_GREEN + logicos.gemy2 + ANSI_RESET + " | " + "Sety: " + ANSI_GREEN + logicos.sety2 + ANSI_RESET);
    }

    public void Win1(){
        System.out.println("Vyhrál hráč číslo 1. !!!");
    }

    public void Win2(){
        System.out.println("Vyhrál hráč číslo 2. !!!");
    }
}
