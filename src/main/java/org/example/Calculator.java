package org.example;

public class Calculator {
    int firstValue, secondValue;
    public Calculator(int firstValue, int secondValue) {
        this.firstValue=firstValue;
        this.secondValue=secondValue;
    }

    public Calculator() {
    }
    public int addition (int firstValue,int secondValue){
        return firstValue+secondValue;
    }
    public int substraction (int firstValue, int secondValue){
        return firstValue-secondValue;
    }
}
