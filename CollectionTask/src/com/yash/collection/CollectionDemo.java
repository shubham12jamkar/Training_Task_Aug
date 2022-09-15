package com.yash.collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionDemo {
public static void main(String[] args) {
        
        Queue<Integer> pq=new PriorityQueue<Integer>();
        pq.add(200);//queue is full throws and exception
        pq.add(300);        //Comparator interface
        pq.add(400);        //offer() it not throws an exception
        System.out.println(pq.peek());//top element =200
        System.out.println(pq.poll());//200
        System.out.println(pq.peek());//300
        pq.remove();
        System.out.println(pq);
        Queue<Integer> li=new LinkedList<Integer>();
        li.add(1000);
        li.add(2000);
        li.add(3000);
        System.out.println(li.peek());
        System.out.println(li.poll()); 
        System.out.println(li.peek());
        //li.poll();
        //li.poll();
        //in remove it is empty it will throw exception but not in poll 
        //li.poll();
        
        
    }

}
