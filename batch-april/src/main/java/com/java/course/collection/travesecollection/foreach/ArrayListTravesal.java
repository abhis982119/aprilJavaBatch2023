package com.java.course.collection.travesecollection.foreach;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.function.Supplier;

public class ArrayListTravesal {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        List<Integer> list = Collections.synchronizedList(arr);

      //  {10,20,30,40}

   /*     Supplier<List> listTask = () -> {
             return list;
        };
        */
        CompletableFuture.supplyAsync(() -> {
            List list2 = new ArrayList();
            list2.add(10);
            list2.add(20);
            return list2;
            }).thenAccept(System.out::println);






  /*      synchronized (list) {
        for(Integer value : list){

            System.out.println(value + " with complete array : " + arr);
            wait(2);
        }

            }

*/


     //   System.out.println("final list : " + list);
        }


        @SneakyThrows
        public static void wait(int seconds){
          Thread.sleep(seconds*1000);
        }

}
