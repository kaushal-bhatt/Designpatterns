package GOF.Factory;

public class Sedan extends Car{
    public String car="Civic";

    @Override
    public String toString() {
        return "Sedan{" +
                "car='" + car + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String model="2022";
    @Override
    public String getCar() {
        return car;
    }

    @Override
    public String model() {
        return model;
    }
}
