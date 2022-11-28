import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Logger log = Logger.getLogger(Main.class.getName());

        List<Product> list = new ArrayList<>(Arrays.asList(
                new Product("Mars", 2.75),
                new Product("Twix", 3.25),
                new Product("Snikers", 2.5)));

        VendingMachine machine = new VendingMachine(list);
        log.info(String.valueOf(machine.getProductByName("Twix")));

        List<Product> drinkList = new ArrayList<>(Arrays.asList(
                new Drink("Cola", 3.1, 0.5),
                new Drink("Sprite", 3.42, 1.0),
                new Drink("Fanta", 3.77, 2.0)
        ));

        DrinkVendingMachine drinkMachine = new DrinkVendingMachine(drinkList);
        log.info(String.valueOf(drinkMachine.getProductByName("Fanta")));

        List<Product> hotDrinkList = new ArrayList<>(Arrays.asList(
                new HotDrink("Coffee", 1.5, 0.15, 60),
                new HotDrink("Latte", 2.0, 0.25, 50),
                new HotDrink("Espresso", 1.0, 0.1, 70),
                new HotDrink("Tea", 0.85, 0.2, 90),
                new HotDrink("Latte", 2.5, 0.25, 50)
        ));

        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine(hotDrinkList);

//        log.info(hotDrinkVendingMachine.getProduct("latte", 0.25, 50).toString()
//                .replaceAll("[{\\[\\]}]", ""));

        hotDrinkVendingMachine.hotDrinkView(hotDrinkVendingMachine.getProduct("latte", 0.25, 50));
    }
}
