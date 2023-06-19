package GOF.singleton;
//double-checked locking
public final class Singleton {
    static int numberOfInstances=0;
    private static Singleton singleton ;
    private Singleton(){
        numberOfInstances++;
        System.out.println("Number of instances at this moment = "+numberOfInstances);
    }
    public static  Singleton getSingleton(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton= new Singleton();
                    System.out.println("New captain selected for team!!");
                }else{
                    System.out.println("Singleton class already have one instance use that!!");
                }
            }
        }
        return singleton;
    }
       }


