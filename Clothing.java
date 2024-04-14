public class Clothing {
    // Private attributes of the Clothing class
    private String brand;
    private double cost;
    private String type;    // Examples: "Outwear", "Pants", "Shirt", etc.
    private String fabric;  // Examples: "Cotton", "Alpaca", "Wool", etc.

    // Creating the Clothing object
    public Clothing(String brand, double cost, String type, String fabric) {
        this.brand = brand;
        this.cost = cost;
        this.type = type;
        this.fabric = fabric;
    }

    // Getter methods (gathering information)
    public String getBrand() {
        return brand;
    }

    public double getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    public String getFabric() {
        return fabric;
    }

    // Setter methods (inserting information)
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

}
