package ceid.project2021;

public class Material extends Entity{
    private final double level1;
    private final double level2;
    private final double level3;
    
    //Constuctors
    public Material(String name, String description, int id,
            double l1, double l2, double l3) {
        super(name,description);
        level1 = l1;
        level2 = l2;
        level3 = l3;
    }
    
    //Methods
    //Getters
    public double getLevel1() {
        return level1;
    }
    
    public double getLevel2() {
        return level2;
    }
    
    public double getLevel3() {
        return level3;
    }
    
    @Override
    public String getDetails() {
        return "Material";
    }  
}
