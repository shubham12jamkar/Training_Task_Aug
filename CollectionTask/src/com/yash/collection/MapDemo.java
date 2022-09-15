package com.yash.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	        Map<Integer,String> map=new HashMap<Integer,String>();
	        map.put(10, "Yash");
	        map.put(11,"Technologies");
	        map.put(20,"jaynam");            //keySet() containing all the keys()
	        
	       
	        for(Map.Entry m:map.entrySet())//it returns the set  containing all keys and values
	            System.out.println("Key:"+m.getKey()+" Value:"+m.getValue());
	        /*Map map=new HashMap();
	        map.put(10, "yash");
	        map.put(11,"Technologies");
	        map.put(20,"jaynam");
	        Set s=map.entrySet();//convert to set to traverse
	        Iterator i=s.iterator();
	        while(i.hasNext())
	        {
	            Map.Entry entry=(Map.Entry)i.next();//value separartion
	            System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
	        }
	        
	//Map.Entry(SubInterface) Interface we will get key and value separately*/
	    }

}
