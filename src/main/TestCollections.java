package main;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestCollections {

    public static void main(String[] args) {

        Queue<String> qu = new PriorityQueue<>();
        qu.offer("első");
        System.out.println(qu);

        qu.offer("második");
        System.out.println(qu);

        qu.offer("harmadik");
        System.out.println(qu);

        System.out.println("A PRIORITY QUEUE legkiemlekedőbb alakja/prioritást élvező alakja = "
                + qu.peek());

        System.out.println("Kiszedjük a prioritás elemet!");
        qu.poll();

        System.out.println("__________________________");
        System.out.println("ekkor a második elem lesz a prioritás elem : ");
        System.out.println(qu);
       // System.out.println("A prioritás elem  = " + qu.poll());

        System.out.println("_______________________");
        System.out.println("Látható, hogy nem a második elem lett a prioritás elem, \nez azért van, mivel" +
                " a gép dönti el ki lesz a következő.");

        System.out.println("__________________");

        System.out.println("Kiszedtünk, újra a prioritit, és egyetlen elemönk maradt, így ő lesz az új prioriti");
        qu.poll();
        System.out.println(qu);

        Queue<String> qu2 = new PriorityQueue<>(
                (a, b) -> a.length() - b.length()
        );

        qu2.offer("alma");
        qu2.offer("barack");
        qu2.offer("szilvaaa");
        qu2.offer("cé");
        qu2.poll();
        System.out.println(qu2);
        qu2.offer("körte");
        qu2.offer("narancs");
        qu2.offer("lime");

        System.out.println(qu2);
        qu2.poll();
        System.out.println(qu2);
        /*
        * Előre meghatároztuk, hogy a prioritási sorrend hossz szerint álljon fenn.
        * Abban az esetben, ha kivesszük a prioritás elemeket, akkor arra esik a prioritás, amelyik
        * hossz szerint a következő. DE, ha több azonos hosszal rendelkező elem van, akkor már, megint nem mi
        * döntünk a prioritásos elem sorsáról.
        * De ezt a rendezés megváltoztatásával módosíthatjuk.
        * 
        * */

    }

}
