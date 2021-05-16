package model;

import java.io.Serializable;
/**
 *
 * @author ormus
 */
public class City implements Serializable {
    private String name;
    
    public City() {}
    
    public City(
            String name
            ) 
    {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
