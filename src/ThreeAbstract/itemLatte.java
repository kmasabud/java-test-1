package ThreeAbstract;

public class itemLatte extends CoffeeShopAbstact{
    @Override
    public boolean isAllowToBuy(Inventory inventory){
        //coffee > 30
        //milk > 10
        //sugar > 10
        if(inventory.getCoffee()<30){
            System.out.println("Not allow to buy Latte because coffee not enough");
            return false;
        }
        if(inventory.getMilk()<10){
            System.out.println("Not allow to buy Latte because milk not enough");
            return false;
        }
        if(inventory.getSugar()<10){
            System.out.println("Not allow to buy Latte because sugar not enough");
            return false;
        }
        System.out.println("Buy Latte success");
        return true;
    }
}