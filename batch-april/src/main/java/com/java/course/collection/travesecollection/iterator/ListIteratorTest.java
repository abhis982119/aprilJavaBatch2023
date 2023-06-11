package com.java.course.collection.travesecollection.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        // <- 0 < 4
        arr.add(10); //  1 <= 4
        arr.add(20); // 2 <= 4
        arr.add(30); // 3 <= 4
        arr.add(40); // 4 <= 4
        arr.add(50);
        arr.add(60);
        arr.add(70);

      ListIterator<Integer> iterator =   arr.listIterator();

      while(iterator.hasNext()){

          int value = iterator.next();
          System.out.println(value);
          if(value == 20 ) {
              iterator.add(50);
              iterator.add(60);
              iterator.add(70);



          }
          if(value == 30 ){
              iterator.remove();
          }
      }

        System.out.println("arrayList after modification : " + arr);
    }
}
