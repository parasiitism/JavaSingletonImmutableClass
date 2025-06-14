package javaSingletonImmutableClass;

// Thread safe
public class DBConnectionSynchronized {
    private static DBConnectionSynchronized conObject;
    private DBConnectionSynchronized(){

    }
    synchronized public static DBConnectionSynchronized getInstance(){
        if(conObject==null){
            conObject=new DBConnectionSynchronized();
        }
        return conObject;
    }
}
