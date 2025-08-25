package br.univille.observer;

import java.util.ArrayList;

import br.univille.observer.services.OfertaObserver;

public class Oferta implements Publisher{
    private String nome;
    private int[] itens;
    private String descricao;
    private double desconto;
    private ArrayList<OfertaObserver> observers;

    public Oferta(String nome, int[] itens, String descricao, double desconto) {
        this.nome = nome;
        this.itens = itens;
        this.descricao = descricao;
        this.desconto = desconto;
        notifySubscriber();
    }

    public void addSubscriber(OfertaObserver observer) {
        observers.add(observer);
    }

    public void notifySubscriber() {
        observers.forEach( (n) -> { n.update(this); } );
    }

    public void removeSubscriber(OfertaObserver observer) {
        observers.remove(observer);
    }

}
