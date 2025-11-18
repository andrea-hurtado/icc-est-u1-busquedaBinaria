package controllers;

import models.Person;

public class PersonController {
    public Person findByName(Person[] people, String targetName) {
        int izquierda = 0;
        int derecha = people.length - 1;

        while (izquierda <= derecha) {
            int medio = (derecha + izquierda) / 2;

            int comparacion = people[medio].getName().compareTo(targetName);
            if (comparacion == 0) {
                return people[medio];
            }

            if (comparacion < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return null;
    }

    public void sortBurbuja(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            boolean swapped = false;


            for (int j = 0; j < people.length - 1 - i; j++) {

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
    }

}
