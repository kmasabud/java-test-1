package ThreeAbstract;

public class MainAbstract{
    public static void main(String... args){
        Inventory inventory = new Inventory(0,40,30,20);
        CoffeeShopAbstact latte = new itemLatte();
        CoffeeShopAbstact mocha = new itemMocha();
        CoffeeShopAbstact americano = new itemAmericano();
        //boolean isAllowLatte = latte.isAllowToBuy(inventory);
        boolean isAllowMocha = mocha.isAllowToBuy(inventory);
        boolean isAllowAmericano = americano.isAllowToBuy(inventory);
    }
}