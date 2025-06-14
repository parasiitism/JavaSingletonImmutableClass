package javaSingletonImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class MyImmutableClassMain {
    public static void main(String args[]){
        List<Object> petNames=new ArrayList<>();
        petNames.add("dog");
        petNames.add("cat");

        MyImmutableClass obj=new MyImmutableClass("myName",petNames);
        obj.getPetNameList().add("hello");
        System.out.println(obj.getPetNameList());
    }
}
