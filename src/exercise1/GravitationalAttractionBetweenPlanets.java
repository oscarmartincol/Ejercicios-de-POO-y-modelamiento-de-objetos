package exercise1;

public class GravitationalAttractionBetweenPlanets extends PlanetarySystem{
     /*
     planet1 --> planeta 1
     planet2 --> planeta 2
      */
    Planet planet1;
    Planet planet2;

    /**
     * Contructor que recibe dos planetas
     * @param planet1 planeta 1
     * @param planet2 planeta 2
     */
    public GravitationalAttractionBetweenPlanets(Planet planet1, Planet planet2){
        this.planet1 = planet1;
        this.planet2 = planet2;
    }

    /**
     * Método para calcular la distancia entre los dos planetas
     * @return distancia entre planetas
     */
    public double distance(){
        double distance;
        distance = Math.abs(this.planet1.getSunDistance() - this.planet2.getSunDistance());
        return distance;
    }

    /**
     * Método para calcular la atracción gravitacional entre los planetas
     * @return atracción gravitacional
     */
    @Override
    public double gravitationalAttraction() {
        double attraction;
        attraction = this.GravitationalConstant * (this.planet1.getMass() * this.planet2.getMass())
                / Math.pow(distance(),2);
        return attraction;
    }

    /**
     * Método para acceder a la información de los planetas y a la atracción gravitatoria.
     * @return Información de los planetas.
     */
    @Override
    public String toString() {
        return "GravitationalAttractionBetweenPlanets{" +
                "planet1=" + planet1 +
                ", planet2=" + planet2 +
                '}';
    }
}
