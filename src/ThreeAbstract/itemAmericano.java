package ThreeAbstract;

public class itemAmericano extends CoffeeShopAbstact{
    @Override
    public boolean isAllowToBuy(Inventory inventory){
        //coffee > 50
        if(inventory.getCoffee()<50){
            System.out.println("Not allow to buy Americano because coffee not enough");
            return false;
        }
        System.out.println("Buy Americano success");
        return true;
    }
}