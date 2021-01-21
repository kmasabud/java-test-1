package ThreeAbstract;

public class itemMocha extends CoffeeShopAbstact{
    @Override
    public boolean isAllowToBuy(Inventory inventory){
        //coffee > 30
        //coco > 10
        //sugar > 10
        if(inventory.getCoffee()<30){
            System.out.println("Not allow to buy Mocha because coffee not enough");
            return false;
        }
        if(inventory.getCoco()<10){
            System.out.println("Not allow to buy Mocha because coco not enough");
            return false;
        }
        if(inventory.getSugar()<10){
            System.out.println("Not allow to buy Mocha because sugar not enough");
            return false;
        }
        System.out.println("Buy Mocha success");
        return true;
    }
}