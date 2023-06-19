package GOF.Factory;

public class FactoryClass {


    public Car getCars(String car){
        if(car.equalsIgnoreCase("Sedan")){
            return new Sedan();
        } else if (car.equalsIgnoreCase("SUV")) {
            return new Suv();

        }else{
            return null;
        }
    }
}
