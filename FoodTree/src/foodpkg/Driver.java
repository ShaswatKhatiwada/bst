/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodpkg;

/**
 * Driver class. Contains main entry point
 *
 * @author Pradip
 */
public class Driver {

    public static final int NO_OF_FOODS = 7;

    public static void main(String... args) {
        Food[] foods = new Food[NO_OF_FOODS];
        foods[0] = new Food("Fry Rice");
        foods[1] = new Food("Noodles");
        foods[2] = new Food("Burrito");
        foods[3] = new Food("Burger");
        foods[4] = new Food("Sandwich");
        foods[5] = new Food("Icecream");
        foods[6] = new Food("Rice");

        FoodComparator comparator = new FoodComparator();
        BinarySearchTree<Food> foodTree = new BinarySearchTree<Food>(comparator);

        for (Food f : foods) {
            foodTree.insert(f);
        }
        Food f = new Food("xyz");
        foodTree.insert(f);

        //Testing search
        Food searchItem = new Food("Burrito"); // foods[0]
        if (foodTree.find(searchItem)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        // Removing item. Currently only root level works.
        foodTree.remove(foods[0]);

        foodTree.print();

    }
}
