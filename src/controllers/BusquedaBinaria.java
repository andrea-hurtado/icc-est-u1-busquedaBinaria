package controllers;

public class BusquedaBinaria {

    public Integer busquedaBinaria(models.Person[] people, String valor){

        int izquierda = 0;
        int derecha = people.length - 1;

        while (izquierda <= derecha ) {
            int medio = izquierda + (derecha - izquierda) / 2;
            int comparacion = people[medio].getName().compareTo(valor);

            //primero validamos el medio
            if (comparacion == 0) {
                return medio;
                
            } else if (comparacion < 0) {
                izquierda = medio + 1;
                
            } else{
                derecha  = medio - 1;
            }
            
        }

        return null;
    }

}
