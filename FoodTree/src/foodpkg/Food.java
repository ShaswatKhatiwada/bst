/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodpkg;

/**
 *
 * @author Pradip
 */
public class Food {

    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Food name: " + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equalsIgnoreCase(((Food)obj).name);
    }
    
    

}
