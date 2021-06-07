package ceid.project2021;
import java.util.ArrayList;

public class RequestDonationList {
    //Fields
    private ArrayList<RequestDonation> rdEntities;
    
    //Constructors
    public RequestDonationList() {
        rdEntities = new ArrayList<>();
    }
    
    //Getters Methods
    public ArrayList<RequestDonation> getRdEntities() {
        return rdEntities;
    }
    
    //Methods
    public RequestDonation get(int id){
        RequestDonation rd = rdEntities.stream().
                filter(s -> s.getEntity().getId() == id).
                findFirst().orElse(null);
        return rd;
    }
    
    public void add(RequestDonation rd, Organization org) throws EntityNotFoundException {
        int entityIndex = org.getEntityList().indexOf(rd);
        if ( entityIndex == -1) throw new EntityNotFoundException("Entity not available\n");
        int index = rdEntities.indexOf(rd);
        if (index == -1)
        {
            rdEntities.add(rd);
        }
        else
        {
            double q = rd.getQuantity();
            rdEntities.get(index).setQuantity(q + rdEntities.get(index).
                    getQuantity());
        }
    }
    
    public void remove(RequestDonation rd, Organization org) 
            throws EntityNotFoundException {
        int entityIndex = org.getEntityList().indexOf(rd);
        if ( entityIndex == -1) throw new EntityNotFoundException("Entity not available\n");
        int index = rdEntities.indexOf(rd);
        if (index == -1) 
            throw new EntityNotFoundException("Entity not in list.\n");
        rdEntities.remove(index);
    }
    
    public void modify(RequestDonation rd, Organization org) 
            throws EntityNotFoundException {
        int entityIndex = org.getEntityList().indexOf(rd);
        if ( entityIndex == -1) throw new EntityNotFoundException("Entity not available\n");
        int index = rdEntities.indexOf(rd);
        if (index == -1) throw new EntityNotFoundException("Entity not in list.\n");
        rdEntities.get(index).setQuantity(rd.getQuantity());
    }
    
    public void monitor() {
        rdEntities.forEach(r -> r.printDetails());
    }
    
    public void reset() {
        rdEntities.clear();
    }
}
