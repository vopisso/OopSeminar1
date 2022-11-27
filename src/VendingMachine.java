import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    public List<Product> list;

    public VendingMachine(List<Product> list){
        this.list = list;
    }

    public Product getProductByName(String name){
        for (Product item: this.list) {
            if(name.equals(item.getName())) {
                return item;
            }
        }
        throw new IllegalStateException(String.format("Product '%s' not found", name));
    }
}
