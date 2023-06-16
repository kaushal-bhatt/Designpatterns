package GOF.builder;

public class ModifiedBuilderClass implements CarBuilder{
    private String color="Red";
    private String model="2022";
    private int price=10000;
    ProductClass productClass;
    @Override
    public CarBuilder color(String color) {
        this.color=color;
        return this;
    }

    @Override
    public CarBuilder model(String model) {
        this.model=model;
        return this;
    }

    @Override
    public CarBuilder price(int price) {
        this.price=price;
        return this;
    }

    @Override
    public ProductClass products() {
        productClass= new ProductClass(this.color,this.model,this.price);
        return productClass;
    }

    @Override
    public ProductClass getProduct() {
        return productClass;
    }
}
