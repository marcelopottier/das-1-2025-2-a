package br.univille.observer;

import br.univille.observer.services.OfertaObserver;

public interface Publisher {
    public void addSubscriber(OfertaObserver observer);
    void notifySubscriber();
    public void removeSubscriber(OfertaObserver observer);
}
