package com.gdstruc.otie2.module5;

public class Main {
    public static void main(String[] args) {
        Player Denji = new Player(25, "Denji", 1);
        Player Power = new Player(251, "Power", 2);
        Player Aki = new Player(107, "Aki", 3);
        Player Angel = new Player(56, "Angel", 4);
        Player Makima = new Player(175, "Makima", 4);

        SimpleHashtable hashtable = new SimpleHashtable();

        hashtable.put(Denji.getUserName(), Denji);
        hashtable.put(Power.getUserName(), Power);
        hashtable.put(Aki.getUserName(), Aki);
        hashtable.put(Angel.getUserName(), Angel);
        hashtable.put(Makima.getUserName(), Makima);

        hashtable.remove("Makima");
        hashtable.printHashtable();
    }
}