public class Employee {

    private String emName;
    private String emPPS;


    public Employee(String emName, String emPPS){
            setEmName(emName);
            setEmPPS(emPPS);
    }


    public String getEmName() {
        if(emName.length() < 5|| emName.length()  > 22) {
            return emName;
        }
        else {
            throw new IllegalArgumentException("This is not a valid name, must be more that 5 characters adn less that 25 characters");
        }
    }

    public void setEmName(String emName) {
        this.emName = emName;
    }

    public String getEmPPS() {
        if(emPPS.length() == 6) {
            return emPPS;
        }
        else {
            throw new IllegalArgumentException("This is not a valid PPS ID Number, must be 6 characters");
        }

    }

    public void setEmPPS(String emPPS) {
        this.emPPS = emPPS;
    }

}


