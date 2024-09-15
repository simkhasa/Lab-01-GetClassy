public class Product {
    private String id;
    private String name;
    private String description;
    private double cost;

    /**
     * @param id product's id
     * @param name product's name
     * @param description product's description
     * @param cost product's cost
     */
    public Product(String id, String name, String description, double cost) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    /**
     * @return return product's id
     */
    public String getID() {
        return id;
    }

    /**
     * @param id the product's id to be set
     */
    public void setID(String id) {
        this.id = id;
    }

    /**
     * @return return product's name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the product's name to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return return product's description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the product's description to be set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return return product's price
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the product's price to be set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return return product's name, description, and price
     */
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + cost +
                '}';
    }

    /**
     * @return return product's id, name, description, and price in CSV format
     */
    public String toCSV() {
        return id + "," + name + "," + description + "," + cost;
    }

    /**
     * @return return product's name, description, and price in JSON format
     */
    public String toJSON() {
        return "{" +
                "\"id\":\"" + id + '\"' +
                ", \"name\":\"" + name + '\"' +
                ", \"description\":\"" + description + '\"' +
                ", \"price\":" + cost +
                '}';
    }

    /**
     * @return return product's name, description, and price in XML format
     */
    public String toXML() {
        return "<Product>" +
                "<id>" + id + "</id>" +
                "<name>" + name + "</name>" +
                "<description>" + description + "</description>" +
                "<price>" + cost + "</price>" +
                "</Product>";
    }


}