package exercise1;

/**
 * Clase que representa un planeta
 * @author Oscar David Martinez Benavides
 */
public class Planet extends PlanetarySystem {

    /**
     * Constructor que recibe los parametros para el planeta
     * @param id identificación del planeta
     * @param name nombre del planeta
     * @param diameter diametro del planeta
     * @param sunDistance distancia al sol
     */
    public Planet(int id, String name, double diameter, double sunDistance){
        super(id, name, diameter, sunDistance);
    }

    /**
     * Método para calcular el radio del planeta
     * @return radio
     */
    public double calculateRadius() {
        double radius;
        radius = getDiameter()/2;
        return radius;
    }

    /**
     * Método para calcular la atracción gravitatoria entre los planetas
     * @return atracción gravitatoria
     */
    @Override
    public double gravitationalAttraction() {
        double atraction;
        atraction = this.GravitationalConstant * ((getMass() * this.SunMass)
                / Math.pow(getSunDistance(),2));
        return atraction;
    }

    /**
     * Calcular el volumen del planeta
     * @return volumen
     */
    public double calculateVolume() {
        double volume;
        volume = (4* Math.PI * Math.pow(calculateRadius(), 3)) / 3;
        return volume;
    }

    /**
     * Método para calcular la densidad del planeta
     */
    public void calculateDensity() {
        double density;
        density = getMass() / calculateVolume();
        setDensity(density);
    }

}
