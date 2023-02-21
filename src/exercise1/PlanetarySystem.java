package exercise1;

/**
 * Clase abstracta que representa un sistema planetario.
 * @ author Oscar David Martinez Benavides
 */
public abstract class PlanetarySystem {
    /**
     * Declaración de variables
     * mass : Masa del cuerpo celeste en kilogramos
     * density: Densidad
     * diameter: diametro
     * sunDistance: Distancia al sol
     * id: identificación del cuerpo celeste
     * name: Nombre del cuerpo celeste
     * GravitationalConstant: contante gravitacional en m^3/kg
     * SunMass: Masa del sol en kg
     */
    private double mass;
    private double density;
    private double diameter;
    private double sunDistance;
    private int id;
    private String name;
    protected final double GravitationalConstant = 6.67428 * (Math.pow(10, -11));
    protected final double SunMass = 1.989 * (Math.pow(10, 30));

    public PlanetarySystem(){}

    public PlanetarySystem(int id, String name, double diameter, double sunDistance) {
        this.id = id;
        this.name = name;
        this.diameter = diameter;
        this.sunDistance = sunDistance;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getSunDistance() {
        return sunDistance;
    }

    public void setSunDistance(double sunDistance) {
        this.sunDistance = sunDistance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double gravitationalAttraction();

    @Override
    public String toString() {
        return "PlanetarySystem{" +
                "mass=" + mass +
                ", density=" + density +
                ", diameter=" + diameter +
                ", sunDistance=" + sunDistance +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
