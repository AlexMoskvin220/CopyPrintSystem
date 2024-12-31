package org.example;

public class UserTerminal {



    public static void main(String[] args) {

        UserGUI gui = new UserGUI();

        Xerox xerox = new Xerox(1);

        gui.printTask(new UserGUI.Document());
        System.out.println(gui.scanTask().toString());
        xerox.copy(new UserGUI.Document(),5);


    }
}
