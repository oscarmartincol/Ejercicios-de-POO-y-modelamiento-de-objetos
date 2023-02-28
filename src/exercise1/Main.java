package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase con el método main
 * @author Oscar David Martinez Benavides
 */
public class Main {
    public static void main(String[] args) {
        /*
          Lista donde se guardan planetas del sistema solar
         */
        List<PlanetarySystem> planets = createPlanets();
        Scanner input = new Scanner(System.in);
        int id1, id2;
        System.out.println("Calculadora de la atracción gravitatoria entre dos planetas");
        //imprimir lista de planetas con su id
        for(PlanetarySystem planet: planets){
            System.out.println("id= " + planet.getId() + " Planeta: " + planet.getName());
        }
        //seleccionar los planetas para calcular su atracción gravitatoria
        System.out.print("Ingrese el id del primer planeta: ");
        id1 = input.nextInt();
        System.out.print("Ingrese el id del segundo planeta: ");
        id2 = input.nextInt();

        // Calcular la atracción gravitatoria entre los planetas
        PlanetarySystem gravitationalAtraction = new GravitationalAttractionBetweenPlanets((Planet) planets.get(id1 - 1), (Planet) planets.get(id2 - 1));
        System.out.println("Datos de los planetas:");
        System.out.println(planets.get(id1 - 1));
        System.out.println("Atracción gravitatoria con el sol: "
                + planets.get(id1 - 1).gravitationalAttraction());
        System.out.println(planets.get(id2 - 1));
        System.out.println("Atracción gravitatoria con el sol: "
                + planets.get(id2 - 1).gravitationalAttraction());

        System.out.println("Atracción gravitatoria entre el planeta " + planets.get(id1 - 1).getName()
                + " y " + planets.get(id2 - 1).getName() +": " + gravitationalAtraction.gravitationalAttraction());
    }

    /**
     * Método para llenar la lista con planetas del sistema solar
     * @return Lista de planetas
     */
    public static List<PlanetarySystem> createPlanets(){
        List<PlanetarySystem> planets = new ArrayList<>();
        Planet planet1 = new Planet(1,"Mercurio",4879.4,46000000);
        planet1.setMass(3.285 * Math.pow(10,23));
        planet1.calculateDensity();
        planets.add(planet1);
        Planet planet2 = new Planet(2,"Venus",12103.6,107000000);
        planet2.setMass(4.867 * Math.pow(10,24));
        planet2.calculateDensity();
        planets.add(planet2);
        Planet planet3 = new Planet(3,"Tierra",12742,147000000);
        planet3.setMass(5.972 * Math.pow(10,24));
        planet3.calculateDensity();
        planets.add(planet3);
        Planet planet4 = new Planet(4,"Marte",6779,205000000);
        planet4.setMass(6.39 * Math.pow(10,23));
        planet4.calculateDensity();
        planets.add(planet4);
        Planet planet5 = new Planet(5,"Jupiter",139822,741000000);
        planet5.setMass(1.90 * Math.pow(10,27));
        planet5.calculateDensity();
        planets.add(planet5);
        Planet planet6 = new Planet(6,"Saturno",116464,1354000000);
        planet6.setMass(5.683 * Math.pow(10,26));
        planet6.calculateDensity();
        planets.add(planet6);
        Planet planet7 = new Planet(7,"Urano",50724, 2748000000.0);
        planet7.setMass(8.681 * Math.pow(10,25));
        planet7.calculateDensity();
        planets.add(planet7);
        Planet planet8 = new Planet(8,"Neptuno",49244,4453000000.0);
        planet8.setMass(1.024 * Math.pow(10,26));
        planet8.calculateDensity();
        planets.add(planet8);
        return planets;
    }
}
