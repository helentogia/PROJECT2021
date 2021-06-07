package ceid.project2021;

public class BeneficiaryExistsException extends Exception {
    //Constructors
    public BeneficiaryExistsException(){
        super();
    }
    
    public BeneficiaryExistsException(String message) {
        super(message);
    }
}
