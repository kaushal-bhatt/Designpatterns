package GOF.prototype;

public class Nano extends BasicCar{
    public Nano(String naam){
        modelName=naam;
    }
    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
