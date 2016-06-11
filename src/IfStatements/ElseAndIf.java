package IfStatements;

/**
 * @author Hermawanska
 */
public class ElseAndIf {

    public static void main(String[] args) {
        int people = 30;
        int cars = 40;
        int buses = 15;
      /*
        if : Percabangan if ini digunakan jika kita hanya memiliki satu pernyaatan 
             yang akan dijalankan dengan syarat tertentu
        
        if else : Percabangan if else digunakan saat kita memiliki dua pernyataan dengan syarat tertentu.
                
                Jika hasil dari if benar, maka pernyataan1 yang dijalankan,
                sedangkan jika salah, pernyataan dua yang akan dijalankan.
      */

        if (cars > people) {
            System.out.println("We should take the cars.");
        } else if (cars < people) {
            System.out.println("We should not take the cars.");
        } else {
            System.out.println("We can't decide.");
        }


        if (buses > cars) {
            System.out.println("That's too many buses.");
        } else if (buses < cars) {
            System.out.println("Maybe we could take the buses.");
        } else {
            System.out.println("We still can't decide.");
        }


        if (people > buses) {
            System.out.println("All right, let's just take the buses.");
        } else {
            System.out.println("Fine, let's stay home then.");
        }

    }
}

