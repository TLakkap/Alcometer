import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlcometerTest {

    Alcometer alcometer;

    @BeforeEach
    public void init(){
        alcometer = new Alcometer();
    }

    @Test
    @DisplayName("Count litres test")
    public void countLitresTest(){
        double litres = alcometer.countLitres(3);
        assertEquals(0.99, litres);
    }

    @Test
    @DisplayName("Count grams test")
    public void countGramsTest(){
        double grams = alcometer.countGrams(0.99);
        assertEquals(35.64, grams);
    }

    @Test
    @DisplayName("Count burning test")
    public void countBurningTest(){
        double burning = alcometer.countBurning(84);
        assertEquals(8.4, burning);
    }

    @Test
    @DisplayName("Count grams left test")
    public void countGramsLeftTest(){
        double gramsLeft = alcometer.countGramsLeft(35.64, 8.4, 2);
        assertEquals(18.84, gramsLeft);
    }

    @Test
    @DisplayName("Count result for male test")
    public void countResultForMaleTest(){
        double result = alcometer.countResult(35.64, 84, 'm');
        assertEquals(0.6, result);
    }

    @Test
    @DisplayName("Count result for female test")
    public void countResultForFemaleTest(){
        double result = alcometer.countResult(35.64, 84, 'f');
        assertEquals(0.7, result);
    }
}