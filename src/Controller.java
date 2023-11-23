/*
* File: Controller.java
* Author: Szőllősi-Maruzs Eszter
* Copyright: 2023, Szőllősi-Maruzs Eszter
* Group: Szoft II-1-E
* Date: 2023-11-23
* Github: https://github.com/maruzseszter/
* Licenc: GNU GPL
*/

public class Controller implements Controllable {

    @Override
    public void start() {
        System.out.println("A start funkció elindult.");
    }

    @Override
    public void stop() {
        System.out.println("A stop funkció elindult.");
    }

    @Override
    public void restart() {
        System.out.println("A restart funkció elindult.");
    }
}