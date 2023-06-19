
import GOF.Factory.Car;
import GOF.Factory.FactoryClass;
import GOF.singleton.Singleton;
import GOF.builder.ModifiedBuilderClass;
import GOF.builder.ProductClass;
import GOF.prototype.BasicCar;
import GOF.prototype.Ford;
import GOF.prototype.Nano;

public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        //Singleton call
        System.out.println("***Singleton pattern Demo\n");
        System.out.println("Trying to make a singleton object");
        //lazy initialization
        Singleton singleton1= Singleton.getSingleton();
        //lazy initialization
        Singleton singleton2 = Singleton.getSingleton();
        if(singleton1== singleton2){
            System.out.println("singleton1 and 2 are same instances");
        }

        //Prototype call
        System.out.println("*** Prototype pattern Demo\n");
        BasicCar nano= new Nano("nano");
        nano.basePrice=10000;
        BasicCar ford = new Ford("ford");
        ford.basePrice=20000;
        BasicCar bc1;

        bc1= nano.clone();
        bc1.onRoadPrice= nano.basePrice+BasicCar.setAdditionalPrice();
        System.out.println("Car is : "+ bc1.modelName + " price is :" +bc1.onRoadPrice);
        bc1= ford.clone();
        bc1.onRoadPrice= ford.basePrice+ BasicCar.setAdditionalPrice();
        System.out.println("Car is : "+ bc1.modelName + " price is :" +bc1.onRoadPrice);
        //prototype end


        //builder pattern
        System.out.println("*** Builder pattern Demo\n");
       final  ProductClass productClass= new ModifiedBuilderClass().color("red").model("2023").price(10000).products();
        System.out.println(productClass);
        final  ProductClass productClass2= new ModifiedBuilderClass().color("blue").model("2023").products();
        System.out.println(productClass2);

        //Factory pattern
        System.out.println("*** Factory pattern Demo\n");
        FactoryClass factoryClass= new FactoryClass();
        Car suv= factoryClass.getCars("SUV");
        System.out.println("car is "+suv.getCar()+" model is "+suv.model());
        Car sedan= factoryClass.getCars("Sedan");
        System.out.println("car is "+sedan.getCar()+" model is "+sedan.model());

    }

}