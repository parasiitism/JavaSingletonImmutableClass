package javaSingletonImmutableClass;

public class DBConnectionSynchronizedDoubleLockingSystem {
    private static volatile DBConnectionSynchronizedDoubleLockingSystem conObject;
    private DBConnectionSynchronizedDoubleLockingSystem(){

    }
    public static DBConnectionSynchronizedDoubleLockingSystem getInstance(){
        if(conObject==null){ // check_1
            synchronized (DBConnectionSynchronizedDoubleLockingSystem.class){
                if(conObject==null){ // check_2
                    conObject=new DBConnectionSynchronizedDoubleLockingSystem();
                }
            }
        }
        return conObject;
    }
}
