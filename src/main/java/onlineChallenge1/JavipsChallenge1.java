/*
package onlineChallenge1;

import java.util.List;

public class JavipsChallenge1 {

    public static void main(String[] args) {
        // https://docs.oracle.com/javase/10/docs/api/java/util/List.html#unmodifiable
        var raz = List.of("checking!"); // Returns an unmodifiable list containing one element.
        var dwa = List.copyOf(raz); // If a parameter is unmodifiable list, copyOf will generally not create a copy.
        if (raz == dwa) { // Both these references point to the same object in memory.
            System.out.println("ene");
        } else if (raz.equals(dwa)) {
            System.out.println("due");
        } else {
            System.out.println("like");
        }
        System.out.println(raz.getClass().getCanonicalName());
    }
}
//    https://javips.pl/quiz/i-pytanie/
//    1. Jaka jest minimalna wersja Javy wymagana do uruchomienia tego kodu? - Java 10
//    2. Jaka będzie pierwsza wypisana linia przez ten kod? ene, due czy może like? - "ene"
//    3. Jaka jest klasa obiektu raz? -java.util.ImmutableCollection.List1 (Java 10)




*/
