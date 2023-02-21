package exercise1;

public class Planet extends PlanetarySystem {

    public Planet(int id, String name, double diameter, double sunDistance){
        super(id, name, diameter, sunDistance);
    }

    public double calculateRadius() {
        double radius;
        radius = getDiameter()/2;
        return radius;
    }
    @Override
    public double gravitationalAttraction() {
        double atraction;
        atraction = this.GravitationalConstant * ((getMass() * this.SunMass)
                / Math.pow(getSunDistance(),2));
        return atraction;
    }

    public double calculateVolume() {
        double volume;
        volume = (4* Math.PI * Math.pow(calculateRadius(), 3)) / 3;
        return volume;
    }
    public void calculateDensity() {
        double density;
        density = getMass() / calculateVolume();
        setDensity(density);
    }

}
