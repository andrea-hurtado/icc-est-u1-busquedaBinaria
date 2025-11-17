package controllers;

import models.Person;

public class PersonController {

    public Person findByName(Person[] people, String name){
        for (int i = 0; i < people.length; i++) {
            boolean swapped = false;
            for (int j = i + 1; j < people.length - 1 - i; j++) {
                if (people[j].getName().compareTo(people[j + 1].getName()) > 0) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                    swapped = true;                  
                }
            }
            if (!swapped) {
                break;
                
            }
        }
        
        BusquedaBinaria bB = new BusquedaBinaria();
        Integer index = bB.busquedaBinaria(people, name);

        return null;
    
    }

}
