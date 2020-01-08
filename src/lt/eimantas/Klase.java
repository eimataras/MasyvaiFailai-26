package lt.eimantas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Klase {

    private String _failoVardas;
    private ArrayList<Integer> _arr;

    public Klase(String failoVardas) {
        this._failoVardas = failoVardas;
        this._arr = new ArrayList<>();
    }


    public void nuskaitymasISarasa() {
        try {
            FileReader _in = new FileReader(_failoVardas);
            BufferedReader _bufferis = new BufferedReader(_in);
            String eilute = _bufferis.readLine();
            while (eilute != null) {
                // System.out.println(eilute);
                Integer number = Integer.parseInt(eilute);
                this._arr.add(number);
                eilute = _bufferis.readLine();
            }
            _bufferis.close();
            _in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void atvaizdavimasIsSaraso() {
        for (Integer part : this._arr) {
            System.out.println(part);
        }
    }


    public Integer suma() {
        Integer sum = 0;
        for (Integer part : _arr) {
            sum = sum + part;
        }
        System.out.println("Faile esanciu skaiciu suma: " + sum);
        return sum;
    }


    public void irasymasIFaila() {
        System.out.println("Iveskite teksta ka rasysite i faila");
        System.out.println("parasius pabaiga irasymas bus nutrauktas");
        Scanner _sc = new Scanner(System.in);
        String tekstas = _sc.nextLine();
        try {
            FileWriter _out = new FileWriter(_failoVardas);
            while (!tekstas.equals("pabaiga")) {
                _out.write(tekstas);
                _out.write('\n');
                tekstas = _sc.nextLine();
            }
            _out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
