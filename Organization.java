package ceid.project2021;
import java.util.ArrayList;

public class Organization {
    //Fields
    private String name;
    private Admin admin;
    private ArrayList<Entity> entityList;
    private ArrayList<Donator> donatorList;
    private ArrayList<Beneficiary> beneficiaryList;
    private RequestDonationList currentDonations;
    
    //Constructors
    public Organization(String name, Admin admin) {
        this.name = name;
        this.admin = admin;
        entityList = new ArrayList<>();
        donatorList = new ArrayList<>();
        beneficiaryList = new ArrayList<>();
        currentDonations = new RequestDonationList();
    }
    
    //Getters Methods
    public Admin getAdmin() {
        return admin;
    }
    
    public ArrayList<Entity> getEntityList() {
        return entityList;
    }
    
    public ArrayList<Donator> getDonatorList() {
        return donatorList;
    }
    
    public ArrayList<Beneficiary> getBeneficiaryList() {
        return beneficiaryList;
    }
    
    public RequestDonationList getCurrentDonations() {
        return currentDonations;
    }
    
    //Setters Methods
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
    //Methods
    public void addEntity(Entity ent) throws EntityExistsException {  
        if (entityList.contains(ent)) 
            throw new EntityExistsException("Entity already exists.\n");
        entityList.add(ent);
    }
    
    public void removeEntity(Entity ent) {
        entityList.remove(ent);
    }
    
    public void insertDonator(Donator don) throws DonatorExistsException {
        if (donatorList.contains(don)) 
            throw new DonatorExistsException("Donator already exists.\n");
        donatorList.add(don);
    }
    
    public void removeDonator(Donator don) {
        donatorList.remove(don);
    }
    
    public void insertBeneficiary(Beneficiary bf) 
            throws BeneficiaryExistsException {
        if (beneficiaryList.contains(bf)) 
            throw new BeneficiaryExistsException("Beneficiary already exists.\n");
        beneficiaryList.add(bf);
    }
    
    public void removeBeneficiary(Beneficiary bf) {
        beneficiaryList.remove(bf);
    }
    
    public void listEntities() {
        entityList.forEach(en -> System.out.println(en.getDetails()));
    }
    
    public void listBeneficiaries() {
        beneficiaryList.forEach(bf -> System.out.println(bf.toString()));
    }
    
    public void listDonators() {
        donatorList.forEach(dn -> System.out.println(dn.toString()));
    }
}
