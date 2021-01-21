package ThreeAbstract;

public class Inventory {
    private int coffee;
    private int milk;
    private int coco;
    private int sugar;

    public Inventory(){

    }
    public Inventory(int coffee,int milk,int coco,int sugar){
        this.coffee = coffee;
        this.milk = milk;
        this.coco = coco;
        this.sugar = sugar;
    }
    public int getCoffee(){
        return coffee;
    }
    public void setCoffee(int coffee){
        this.coffee = coffee;
    }
    public int getMilk(){
        return milk;
    }
    public void setMilk(int milk){
        this.milk = milk;
    }
    public int getCoco(){
        return coco;
    }
    public void setCoco(int coco){
        this.coco = coco;
    }
    public int getSugar(){
        return sugar;
    }
    public void setSugar(int sugar){
        this.sugar = sugar;
    }
}