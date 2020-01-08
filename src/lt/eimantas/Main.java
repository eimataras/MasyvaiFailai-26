package lt.eimantas;

public class Main {

    public static final String FILE_NAME = "skaiciai.txt";

    public Main() {
        Klase obj = new Klase(Main.FILE_NAME);
        //obj.irasymasIFaila();
        obj.nuskaitymasISarasa();
        obj.atvaizdavimasIsSaraso();
        obj.suma();
    }

    public static void main(String[] args) {
        // write your code here
        Main object = new Main();
    }


}
