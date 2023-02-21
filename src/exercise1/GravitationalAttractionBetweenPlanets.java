package exercise1;

public class GravitationalAttractionBetweenPlanets extends PlanetarySystem{

    Planet planet1;
    Planet planet2;
    public GravitationalAttractionBetweenPlanets(Planet planet1, Planet planet2){
        this.planet1 = planet1;
        this.planet2 = planet2;
    }
    public double distance(){
        double distance;
        distance = Math.abs(this.planet1.getSunDistance() - this.planet2.getSunDistance());
        return distance;
    }

    @Override
    public double gravitationalAttraction() {
        double attraction;
        attraction = this.GravitationalConstant * (this.planet1.getMass() * this.planet2.getMass())
                / Math.pow(distance(),2);
        return attraction;
    }

    @Override
    public String toString() {
        return "GravitationalAttractionBetweenPlanets{" +
                "planet1=" + planet1 +
                ", planet2=" + planet2 +
                '}';
    }
}
