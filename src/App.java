import models.Person;
import views.ShowConsole;

import java.util.Arrays;

import controllers.*;

public class App {
    public static void main(String[] args) throws Exception {

        ShowConsole sC = new ShowConsole();
        BusquedaBinaria bB = new BusquedaBinaria();
        //int[] arr = new int[] {10, 2, 4, 6, 7, 8, 13, 20};
        //Integer result = bB.busquedaBinaria(people, 10);
        //SsC.showResult(result);
        Person[] people = new Person[]{
            new Person("Juan", 25),
            new Person("Ana", 30),
            new Person("Pedro", 20),
            new Person("Maria", 28),
            new Person("Luis", 22),
            new Person("Carmen", 27),
            new Person("Sofia", 24),
        };
        // ordenamos el arreglo por nombre
        PersonController personController = new PersonController();
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        // mandamos a buscar pedro
        
        Person resultado = personController.findByName(people, "Pedro");

        //mostramos resultado
        
        if (resultado != null) {
            sC.showPersonResult(resultado, "Pedro");
            
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        
    }
}
