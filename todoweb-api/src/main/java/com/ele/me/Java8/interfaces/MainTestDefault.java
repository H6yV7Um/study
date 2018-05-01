package com.ele.me.Java8.interfaces;

public class MainTestDefault {

    public static void main(String args[]){

        Defaulable defaulable =  DefaulableFactory.create(DefaultableImpl::new);
        System.out.println(defaulable.notRequired());


        Defaulable overridable =  DefaulableFactory.create(OverridableImpl::new);
        System.out.println(overridable.notRequired());
    }
}
