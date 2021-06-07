package ceid.project2021;

public class Donator extends User {
    //Fields
    private Offers offersList;
    
    //Constructors
    public Donator(String name, String phone) {
        super(name, phone, false);//Set isAdmin false by default
    }
    
    //Getters methods
    public Offers getOffersList() {
        return offersList;
    }
    
    public void addOffer(RequestDonation rd, Organization org) 
            throws EntityNotFoundException {
        offersList.add(rd, org);
    }
    
    public void deleteOffer(RequestDonation rd, Organization org) 
            throws EntityNotFoundException {
       offersList.remove(rd, org);
    }
    
    public void modifyOffer(RequestDonation rd, Organization org) 
            throws EntityNotFoundException {
        offersList.modify(rd, org);
    }
    
    @Override
    public String toString() {
        String s = super.toString();
        s += "Privilege: Donator\n";
        return s;
    }
}
