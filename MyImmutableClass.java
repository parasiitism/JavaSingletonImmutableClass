package javaSingletonImmutableClass;

import java.util.ArrayList;
import java.util.List;
// we can not change the value of an object once it is created
// Declare class as 'final' so that it can not be extended.
// All class members should be private . so that direct access can be avoided
// And class members are initialized only once using constructor
// There should not be any setter methods, which is generally use to change the value
// Just getter methods. And returns copy of the member variable.
//Example: String, Wrapper classes
final class MyImmutableClass {
    private final String name;
    private final List<Object> petNameList;

    MyImmutableClass(String name,List<Object>petNameList){
        this.name=name;
        this.petNameList=petNameList;
    }
    public String getName(){
        return name;
    }
    public List<Object>getPetNameList(){
        return new ArrayList<>(petNameList);
    }
}
