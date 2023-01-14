package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
class A{
    public String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    public String meth(){
        System.out.println(super.meth());
        return "Invoking method from class B";
    }
}
public class TestCases {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj.meth());
    }
}
