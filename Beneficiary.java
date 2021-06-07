package ceid.project2021;

public class Beneficiary extends User  {
    //Fields
    private int noPersons;
    private RequestDonationList receivedList;
    private Requests requestList;
    
    //Constructors
    public Beneficiary(String name, String phone) {
        super(name, phone, false);//Set isAdmin false by default
        noPersons = 1;//Default number of persons
        receivedList = new RequestDonationList();
        requestList = new Requests();
    }
    
    public Beneficiary(String name, String phone, int noPersons) {
        super(name, phone, false);//Set isAdmin false by default
        this.noPersons = noPersons;
        receivedList = new RequestDonationList();
        requestList = new Requests();
    }
    
    //Getters methods
    public int getNoPersons() {
        return noPersons;
    }
    
    public RequestDonationList getReceivedList() {
        return receivedList;
    }
    
    public Requests getRequestList() {
        return requestList;
    }
    
    //Setters methods
    public void setNoPersons(int noPersons) {
        this.noPersons = noPersons;
    }
    
    public void addReceivedRequest(RequestDonation rd, Organization org) 
            throws EntityNotFoundException {
        receivedList.add(rd, org);
    }
    
    public void addRequest(RequestDonation rd, Organization org) 
            throws EntityNotFoundException {
        requestList.add(rd, org);
    }
    
    public void deleteRequest(RequestDonation rd, Organization org) 
            throws EntityNotFoundException {
        requestList.remove(rd, org);  
    }
    
    //Methods
    @Override
    public String toString() {
        String s = super.toString();
        s += "Privilege: Beneficiary\n";
        return s;
    }
}
