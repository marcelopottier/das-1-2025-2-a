package br.univille.singleton;

public class Cliente {
    public static void main(String[] args) {
        var segredo = "bixa bilingue";
        var singleton = Singleton.getInstance();
        singleton.setSegredo(segredo);

        System.out.println(singleton.getSegredo());
    }
}
