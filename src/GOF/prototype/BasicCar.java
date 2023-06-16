package GOF.prototype;

import java.util.Random;

public abstract class BasicCar implements Cloneable {

    public String modelName;
    public int basePrice,onRoadPrice;

public static int setAdditionalPrice(){
    int price=0;
    Random r= new Random();
    int p= r.nextInt(10000);
    price=p;
    return  price;
}
    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        return (BasicCar)super.clone();
    }
}
