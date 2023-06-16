package GOF.builder;

public interface CarBuilder {
   CarBuilder  color(String color);
   CarBuilder  model(String model);
   CarBuilder price(int price);
    ProductClass products();

    ProductClass getProduct();
}
