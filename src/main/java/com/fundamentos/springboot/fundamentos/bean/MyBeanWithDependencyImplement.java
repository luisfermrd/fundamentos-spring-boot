package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements  MyBeanWithDependency{

    private Myoperation myoperation;

    public MyBeanWithDependencyImplement(Myoperation myoperation) {
        this.myoperation = myoperation;
    }

    @Override
    public void printDependency() {
        System.out.println(myoperation.sum(10));
        System.out.println("Hola desde implementacion desde un bean con dependencia");
    }
}
