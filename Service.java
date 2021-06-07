package ceid.project2021;

public class Service extends Entity{
    
    //Constructors
    public Service(String name, String description, int id) {
        super(name, description);
    }
    
    @Override
    public String getDetails() {
        return "Service";
    }
}
