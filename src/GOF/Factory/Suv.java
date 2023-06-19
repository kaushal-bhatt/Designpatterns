package GOF.Factory;

public class Suv extends Car{
    @Override
    public String toString() {
        return "Suv{" +
                "car='" + car + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String car="Nex-on";
    public String model="2023";
    @Override
    public String getCar() {
        return car;
    }

    @Override
    public String model() {
        return model;
    }
}
