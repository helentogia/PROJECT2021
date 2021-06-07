package ceid.project2021;

import java.util.Objects;

public class RequestDonation {
    //Fields
    private Entity entity;
    private double quantity;
    
    //Constructors
    public RequestDonation(Entity entity, double quantity) {
        this.entity = entity;
        this.quantity = quantity;
    }
    
    //Getters methods
    public Entity getEntity() {
        return entity;
    }
    
    public double getQuantity() {
        return quantity;
    }
    
    //Setters methods
    public void setEntity(Entity ent) {
        entity = ent;
    }
    
    public void setQuantity(double q) {
        quantity = q;
    }
    
    @Override
    public boolean equals(Object rd) {
        if (rd != null && rd instanceof RequestDonation)
        {
            RequestDonation r = (RequestDonation) rd;
            return (this.entity.equals(r.entity));
        } 
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.entity);
        return hash;
    }
    
    public void printDetails() {
        System.out.print("Name:" + entity.getName() + "Quantity: ");
        System.out.println(quantity);
    }
}
