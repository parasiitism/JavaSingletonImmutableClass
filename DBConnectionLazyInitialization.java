package javaSingletonImmutableClass;


//     ************* Lazy Initialization (Something in advance) *************/

public class DBConnectionLazyInitialization {
    private static DBConnectionLazyInitialization conObject;
    private DBConnectionLazyInitialization(){}
    public static DBConnectionLazyInitialization getInstance(){
        if(conObject==null){
            conObject=new DBConnectionLazyInitialization();
        }
        return conObject;
    }

}
