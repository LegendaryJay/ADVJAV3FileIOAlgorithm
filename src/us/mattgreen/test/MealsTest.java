package us.mattgreen.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.mattgreen.MealType;
import us.mattgreen.Meals;

import static org.junit.Assert.*;

public class MealsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getMealType() {
    }

    @Test
    public void getItem() {
        Meals aMeal = new Meals(MealType.BREAKFAST, "Sushi", 220);

        assertEquals("Wrong Item", aMeal.getItem().equals("Sushi"));
    }

    @Test
    public void getCalories() {
        Meals aMeal = new Meals(MealType.BREAKFAST, "Sushi", 220);
        assertTrue("Wrong Calories", aMeal.getCalories() == 220);
    }

    @Test
    public void equals() {
    }
}