package billing;

public enum products {
    MILK(20), 
    DATES(70),
    WATER(10),
    CHIPS(5),
    LOLLIPOP(1);

    private float price;
    private products(float price){
        this.price = price;
    }
    public float getPrice(){
        return price;
    }
}
