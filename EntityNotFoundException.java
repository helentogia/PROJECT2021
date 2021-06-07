package ceid.project2021;

public class EntityNotFoundException extends Exception {
    
    //Constructors
    public EntityNotFoundException(){
        super();
    }
    
    public EntityNotFoundException(String message) {
        super(message);
    }
}
