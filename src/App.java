/*
* File: App.java
* Author: Szőllősi-Maruzs Eszter
* Copyright: 2023, Szőllősi-Maruzs Eszter
* Group: Szoft II-1-E
* Date: 2023-11-23
* Github: https://github.com/maruzseszter/
* Licenc: GNU GPL
*/
 
public class App {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        controller.start();
        controller.stop();
        controller.restart();
    }
}
