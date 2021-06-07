package ceid.project2021;

public class EntityExistsException extends Exception {
    //Constructors
    public EntityExistsException(){
        super();
    }
    
    public EntityExistsException(String message) {
        super(message);
    }
}
