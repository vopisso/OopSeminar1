public class HotDrink extends Drink{

    private final Integer temp;

    public HotDrink(String name, Double cost, Double volume, Integer temp) {
        super(name, cost, volume);
        this.temp = temp;
    }

    public Integer getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return String.format("Product -> name: %s; cost: %.2f; type: drink; volume: %.2f liters; temperature:" +
                        " %d'C", super.getName(), super.getCost(),
                super.getVolume(), this.temp);
//        return  super.toString() + String.format("; temperature: %d'C", this.temp);
    }
}
