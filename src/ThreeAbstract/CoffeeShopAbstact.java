package ThreeAbstract;

public abstract class CoffeeShopAbstact{
    abstract boolean isAllowToBuy(Inventory inventory);
    //abstract int remainingInventory(Inventory inventory);

    protected int discount(int price){
        return price - 10;
    }
}