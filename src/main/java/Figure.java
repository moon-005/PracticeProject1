import java.util.ArrayList;

public class Figure {
    double price;
    int inStock;
    String name;
    String description;
    String image;
    ArrayList<Figure> collection;

    public Figure() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList<Figure> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Figure> collection) {
        this.collection = collection;
    }

    public void addFigure(Figure figure) {
        collection.add(figure);
    }

    public void removeFigure(Figure figure) {
        collection.remove(figure);
    }
}
