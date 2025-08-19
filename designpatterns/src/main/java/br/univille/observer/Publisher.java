package br.univille.observer;

public interface Publisher {
    public void addSubscriber(Subscriber idCliente);
    public void notifySubscriber();
    public void removeSubscriber(Subscriber idCliente);
}
