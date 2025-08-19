package br.univille.observer;

import java.util.ArrayList;
import java.util.List;

public class Loja implements Publisher {

    public String nome;
    private ArrayList<Subscriber> subscriber;
    private Object mainState;

    public Loja(String nome){
        this.nome = nome;
    }

    public void addSubscriber(Subscriber cliente) {
        this.subscriber.add(cliente);
    }


    public void notifySubscriber() {
        subscriber.forEach( (n) -> { n.update(nome); } );
    };


    public void removeSubscriber(Subscriber cliente) {
        subscriber.remove(cliente);
    }

    

}
