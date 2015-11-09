package foodpkgtest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import foodpkg.BinarySearchTree;
import foodpkg.Food;
import foodpkg.FoodComparator;
import java.util.Comparator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pradip
 */
public class BinarySearchTreeUnitTesting {

    Comparator<foodpkg.Food> comparator;
    BinarySearchTree tree;

    public BinarySearchTreeUnitTesting() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tree = new BinarySearchTree(new FoodComparator());
    }

    @After
    public void tearDown() {
    }

    @Test
    public void constructorTesting() {
        comparator= new FoodComparator();
        assertNotNull(comparator);
    }

    @Test
    public void findTesting() {
        tree.insert(new Food("rice"));
        assertTrue(tree.find(new Food("rice")));
        assertFalse(tree.find(new Food("momo")));
    }
}
