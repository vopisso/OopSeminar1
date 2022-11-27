import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine{

    public HotDrinkVendingMachine(List<Product> list) {
        super(list);
    }

    @Override
    public Product getProductByName(String name) {
        return super.getProductByName(name);
    }

    public List<Product> getProduct(String name, Double volume, Integer temp) {
        List<Product> result = new ArrayList<>();
        for (Product product: list) {
            if (product instanceof HotDrink) {
                if (product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getVolume().equals(volume)
                        && ((HotDrink) product).getTemp().equals(temp)) {
                    result.add((Product) product);
                }
            }

        }
        if (!result.isEmpty()) {
            return result;
        } else {
            throw new IllegalStateException("Product not found");
        }
    }
}
