package javaSingletonImmutableClass;

// this class objective is to create only 1 and only 1 object
// Different ways of creating Singleton Class.

// Eager Initialization
// Lazy Initialization
// Synchronization Block
// Double Check Lock
// Bill Pugh Solution
// Enum Singleton


//     ************* Eager Initialization (Something in advance) *************//
public class DBConnection {
    private static DBConnection conObject=new DBConnection();
    // No body can access it and no one outside from the class can access it.
    // Belong to class
    private DBConnection(){ // private constructor so no one create Object

    }
    public static DBConnection getInstance(){// other can call it to get access of private object
        return conObject;
    }
}
