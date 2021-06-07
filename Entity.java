package ceid.project2021;

public  abstract class Entity {
    //Fields
    private String name;
    private String description;
    private int id = 0;
    
    //Constructors
    public Entity() {
        name = "";
        description = "";
        id ++;
    }
    
    public Entity(String name, String description) {
        this.name = name;
        this.description = description;
        id++;
    }
    
    //Getters methods
    public String getEntityInfo() {
        String s = name + "\n" + description + "\n";
        s+=String.valueOf(id);
        return s;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    //Methods
    public abstract String getDetails(); 
    
    @Override
    public String toString() {
        String s = getEntityInfo();
        s += "\n"  + getDetails();
        return s;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Entity)) return false;
        Entity other = (Entity) o;
        boolean sameEntity = (this.id == other.id);
        return sameEntity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.id;
        return hash;
    }
}
