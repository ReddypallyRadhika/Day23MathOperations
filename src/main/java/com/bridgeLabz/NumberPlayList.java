package com.bridgeLabz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class NumberPlayList {
    public static  void main(String[]args)
    {
        //creating sample collection
    ArrayList<Integer> myNumberlist = new ArrayList<>();
    for(int i=0;i<5;i++) myNumberlist.add(i);
    //method 1:traversing using Iterator
        Iterator<Integer> it = myNumberlist.iterator();
        while (it.hasNext())
        {
            Integer i = it.next();
            System.out.println("Mth1 :Iterator value : :"+i);
        }
        //method 2: Traversing with explicit interface implementation
        class MyConsumer implements Consumer<Integer>
        {
            @Override
            public void accept(Integer t) {
                System.out.println("Mth2: consumer impl value ::"+t);
            }
        }
        MyConsumer action =new MyConsumer();
        myNumberlist.forEach(action);
        //method 3: Traversing with Anonymous consumer interface implementation
        myNumberlist.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("Mth3:forEach anonymous class value::" + t);
            }
            });
        //method 4:Explicit lambda function
        Consumer<Integer>myListAction=n->{
            System.out.println("Mth4:forEach lambda impl value::" + n);

        };
        myNumberlist.forEach(myListAction);
        //method5:Implicit lambda function
        myNumberlist.forEach(n->{
            System.out.println("Mth5:forEach Lambda impl value::" + n);
        });
    }


}
