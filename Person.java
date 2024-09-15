public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;
    /**
     * @param ID the id
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @param title the title of the person
     * @param YOB the date of birth of the person
     */
    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }
    /**
     * @return return person id
     */
    public String getID() {
        return ID;
    }
    /**
     * @param ID the person id to be set
     */
    public void setID(String ID) {
        this.ID = ID;
    }
    /**
     * @return return person first name
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * @param firstName the person first name set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return return person last name
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * @param lastName the person last name set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * @return return person title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title person title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return return person date of birth
     */
    public int getYOB() {
        return YOB;
    }
    /**
     * @param YOB person date of birth to set
     */
    public void setYOB(int YOB) {
        this.YOB = YOB;
    }
    /**
     * @return person's full name
     */
    public String fullName() {
        return firstName + " " + lastName;
    }
    /**
     * @return return the formal name
     */
    public String formalName() {
        return title + " " + fullName();
    }

    /**
     * @return return the age based on current year
     */
    public String getAge() {
        return Integer.toString(2024 - getYOB());
    }
    /**
     * @return return calculated age for any specified year
     */
    public String getAge(int year) {
        return Integer.toString(year - getYOB());
    }
    /**
     * @return return a string representation of the object Person
     */
    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }
    /**
     * @return return a csv formatted string of the object person
     */
    public String toCSV() {
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

    /**
     * @return return a json formatted string
     */
    public String toJSON() {
        return "{" +
                "\"ID\":\"" + ID + '\"' +
                ", \"firstName\":\"" + firstName + '\"' +
                ", \"lastName\":\"" + lastName + '\"' +
                ", \"title\":\"" + title + '\"' +
                ", \"YOB\":" + YOB +
                '}';
    }/**
     * @return return an xml formatted string
     */
    public String toMXL() {
        return "<Person>" +
                "<ID>" + ID + "</ID>" +
                "<firstName>" + firstName + "</firstName>" +
                "<lastName>" + lastName + "</lastName>" +
                "<title>" + title + "</title>" +
                "<YOB>" + YOB + "</YOB>" +
                "</Person>";
    }
}
