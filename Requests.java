package ceid.project2021;

public class Requests extends RequestDonationList {
    //Constructors
    public Requests() {
        super();
    }
    
    //Methods
    public void add(RequestDonation rd, Organization org, Beneficiary bf) 
            throws EntityNotFoundException {
        int index = org.getCurrentDonations().getRdEntities().indexOf(rd);
        if (index == -1) throw new EntityNotFoundException("Entity "
                + "not available "
                + "at the moment"
                + "\n");
        double q = rd.getQuantity();
        if (!validRequestDonation(rd, bf))
        {
            System.out.println("Invalid request\n");
        }
        else if (q > org.getCurrentDonations().getRdEntities().get(index).getQuantity())
        {
            System.out.println("Quantity not available\n");
        }
        else
        {
            super.add(rd, org);
        }
    }
    
    public void modify(RequestDonation rd, Organization org, Beneficiary bf) 
            throws EntityNotFoundException {
        int index = org.getCurrentDonations().getRdEntities().indexOf(rd);
        if (index == -1) throw new EntityNotFoundException("Entity not available\n");
        double q = rd.getQuantity();
        if (!validRequestDonation(rd, bf))
        {
            System.out.println("Invalid request\n");
        }
        else if (q > org.getCurrentDonations().getRdEntities().get(index).getQuantity())
        {
            System.out.println("Quantity not available\n");
        }
        else
        {
            super.modify(rd, org);
        }
    }
    
    public void commit(RequestDonation rd,Organization org, Beneficiary bf) 
            throws EntityNotFoundException {
        int index = org.getCurrentDonations().getRdEntities().indexOf(rd);
        if (index == -1) throw new EntityNotFoundException("Entity not available\n");
        double q = rd.getQuantity();
        if (!validRequestDonation(rd, bf))
        {
            System.out.println("Invalid request");
        }
        else if (q > org.getCurrentDonations().getRdEntities().get(index).getQuantity())
        {
            System.out.println("Quantity not available");
        }
        else
        {
            bf.addReceivedRequest(rd,org);
            rd.setQuantity(-rd.getQuantity());
            org.getCurrentDonations().add(rd, org);
            this.remove(rd, org);
        }
    }
    
    public boolean validRequestDonation(RequestDonation rd, Beneficiary bf) {
        double q;
        if (rd.getEntity().getDetails().equals("Material")) 
        {
            Material m = (Material) rd.getEntity();
            if (bf.getNoPersons()==1)
            {
                q = m.getLevel1();
            }
            else if (bf.getNoPersons() <= 4)
            {
                q = m.getLevel2();
            }
            else
            {
                q = m.getLevel3();
            }
            int index = bf.getReceivedList().getRdEntities().indexOf(m);
            if (index != -1)
            {
                double rq = bf.getReceivedList().getRdEntities().get(index).
                    getQuantity(); //Already received quantity
                if (rd.getQuantity()+rq > q)
                {
                    return false;
                }
            }      
        }
        return true;
    }
}
