package com.fundamentos.springboot.fundamentos.bean;

public class MyOperationImplement implements Myoperation{
    @Override
    public int sum(int number) {
        return number+1;
    }
}
