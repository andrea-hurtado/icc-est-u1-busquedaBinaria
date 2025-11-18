import controllers.BusquedaBinaria;
import controllers.PersonController;
import models.Person;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {

        ShowConsole sC = new ShowConsole();
        BusquedaBinaria bB = new BusquedaBinaria();
        int[] arr = new int[] { 10, 2, 4, 6, 7, 8, 13, 20 };
        Integer result = bB.sortBurbuja(arr);
        result = bB.busquedaBinaria(arr, 10);

        sC.showArray(arr);
        sC.showResult(result);

        // Instanciamos PersonaController
        // creamos el arreglo
        Person[] people = new Person[] {
                new Person("Juan", 25),
                new Person("Ana", 30),
                new Person("Pedro", 20),
                new Person("Maria", 28),
                new Person("Luis", 22),
                new Person("Carmen", 27),
                new Person("Sofia", 24),
        };
        // ordenamos el arreglo por nombre
        PersonController personaController = new PersonController();
        personaController.sortBurbuja(people);
        sC.showArray(people);

        // mandamos a buscar a Pedro
        Person encontrada = personaController.findByName(people, "Pedro");

        // mostramos el resultado
        sC.showPersonResult(encontrada, "Pedro");
    }
}
