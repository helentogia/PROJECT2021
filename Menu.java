package ceid.project2021;

public class Menu {
    //Fields
    private int choice;
    
    //Constructors
    public Menu() {
        choice = 0;
    }
    
    public void showAdminMainOptions() {
        System.out.println("1. View");
        System.out.println("2. Monitor Organization");
        System.out.println("3. Back");
        System.out.println("4. Logout");
        System.out.println("5. Exit");
    }
    
    public void showDonatorMainOtions () {
        System.out.println("1. Add Offer");
        System.out.println("2. Show Offers");
        System.out.println("3. Commit");
        System.out.println("4. Back");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }
    
    public void showBeneficiaryMainOtions() {
        System.out.println("1. Add Request");
        System.out.println("2. Show Request");
        System.out.println("3. Commit");
        System.out.println("4. Back");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }
    
    public void showAdminLvl1Options() {
        System.out.println("1. List Beneficiaries");
        System.out.println("2. List Donators");
        System.out.println("3. Reset Beneficiaries Lists");
    }
    
    public void showDonatorLvl1Options() {
        System.out.println("1. Delete/Modify donation");
        System.out.println("2. Clear All Donations");
        System.out.println("3. Commit");
    }
}
