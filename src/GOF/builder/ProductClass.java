package GOF.builder;

public final class ProductClass {


    public ProductClass(String color, String model, int price) {
        this.color = color;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductClass{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    private String color;
    private String model;
    private int price;

}
