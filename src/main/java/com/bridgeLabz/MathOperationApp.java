package com.bridgeLabz;
//UC1.2
//Ability to show the results of Math Operation of Addition,Subtraction and Division
// - Pass Lambda Function to show result
public class MathOperationApp {
    public static void main(String[] args)
    {
        //this method implements MathFunction interface
        IMathFunction add =Integer::sum;
        //this expression implements MathFunction
        IMathFunction multiply=(x,y)->x*y;
        IMathFunction subtract=(x,y)->x*y;
        IMathFunction divide=(x,y)->x/y;
        //add & multiply two numbers using lambda expression
        System.out.println("Addition is : "+add.calculate(5,3));
        System.out.println("Multiplication is :"+multiply.calculate(5,3));
        System.out.println("Subtraction is :"+subtract.calculate(5,3));
        System.out.println("division is :"+divide.calculate(5,3));
        //passing LambdaExpression as function parameter to print result using static function
        IMathFunction.printResult(5,3,"Addition",add);
        IMathFunction.printResult(5,3,"Subtraction",subtract);
        IMathFunction.printResult(5,3,"Division",divide);

    }
}
