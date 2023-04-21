import java.util.ArrayList;

public class Cart {
    ArrayList<Figure> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Figure figure) {
        items.add(figure);
    }

    public void removeItem(Figure figure) {
        items.remove(figure);
    }

    public ArrayList<Figure> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Figure item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
