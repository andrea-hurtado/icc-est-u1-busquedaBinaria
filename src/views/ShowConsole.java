package views;
import models.Person;
public class ShowConsole {

    public void showResult(Integer resultado){
        if (resultado != null) {
            System.out.println("Numero encontrada" + resultado); 
        } else{
            System.out.println("No se encontro ");
        }

    }

    public void showPersonResult(Person people, String nombreBuscado){
        if (people != null) {
            System.out.println("Persona encontrada " + people.getName());
            
        } else{
            System.out.println("Persona no encontrada");
        }

    }

}
