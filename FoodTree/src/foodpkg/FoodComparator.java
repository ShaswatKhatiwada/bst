/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodpkg;

import java.util.Comparator;

/**
 *
 * @author Pradip
 */
public class FoodComparator implements Comparator<Food> {

    @Override
    public int compare(Food o1, Food o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
