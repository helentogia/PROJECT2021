package ceid.project2021;

public class DonatorExistsException extends Exception {
    //Constructors
    public DonatorExistsException(){
        super();
    }
    
    public DonatorExistsException(String message) {
        super(message);
    }
}
