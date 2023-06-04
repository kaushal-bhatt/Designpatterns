import GOF.Singleton;

public class Main{
    public static void main(String[] args) {
        System.out.println("***Singleton pattern Demo\n");
        System.out.println("Trying to make a singleton object");
        //lazy initialization
        Singleton singleton1= Singleton.getSingleton();
        //lazy initialization
        Singleton singleton2 = Singleton.getSingleton();
        if(singleton1== singleton2){
            System.out.println("singleton1 and 2 are same instances");
        }

    }

}