package com.bridgeLabz;
//Develop Math Operation App to perform Math Functions
//– Addition,Subtraction and Division - Use Lambda Expression to perform Math Operation
public class MathOperationApp {
    public static void main(String[] args)
    {
        //this method implements MathFunction interface
        IMathFunction add =Integer::sum;
        //this expression implements MathFunction
        IMathFunction multiply=(x,y)->x*y;
        IMathFunction divide=(x,y)->x/y;
        //add & multiply two numbers using lambda expression
        System.out.println("Addition is : "+add.calculate(5,3));
        System.out.println("Multiplication is :"+multiply.calculate(5,3));
        System.out.println("division is :"+divide.calculate(5,3));

    }
}
