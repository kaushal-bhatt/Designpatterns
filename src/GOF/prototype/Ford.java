package GOF.prototype;



public class Ford extends BasicCar{

    public Ford(String naam){
        modelName = naam;
    }
    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        return super.clone();
    }
}