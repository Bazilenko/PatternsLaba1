package Singleton;

public class Customer {
    static int generalId = 1;

    private String order;
    private Singleton barista;
    private int id;

    public Customer(){
        this.setId(generalId);
        generalId++;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setOrder(String order){
        this.order = order;
    }

    public void setBarista(Singleton barista){
        this.barista = barista;
    }

    public String getOrder(){
        return this.order;
    }

    public Singleton getBarista(){
        return this.barista;
    }

    public int getId() {
        return id;
    }

    public void makeOrder(String order, Singleton barista){
        this.setOrder(order);
        this.setBarista(barista);
    }

    @Override
    public String toString(){
        return this.getBarista().getName() +
                " prepare " +
                this.getOrder() +
                " for #" +
                this.getId();
    }
}
