package ceid.project2021;

public class Offers extends RequestDonationList {
    //Constructor
    public Offers() {
        super();
    }
    
    //Methods
    public void commit(Organization org) throws EntityNotFoundException {
        for (int i=0;i<this.getRdEntities().size();i++)
        {
            RequestDonation rd = this.getRdEntities().get(i);
            int entityIndex = org.getEntityList().indexOf(rd);
            if (entityIndex == -1) throw new EntityNotFoundException("Entity not available\n");
            org.getCurrentDonations().add(rd, org);
        }
        this.getRdEntities().clear();
    }
}
