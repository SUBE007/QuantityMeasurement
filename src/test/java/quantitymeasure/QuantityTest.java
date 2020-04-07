package quantitymeasure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityTest {
     Tempreture tempreture;
    //double inch,inch1,inch2,feet1,feet2,feet,yard,cm1,cm2;
    //double volume1,volume2,gallon,litre,millilitre;
    //double weight2,kilograms,grams,tonne,weight1;
    double temprature1,temprature2,fahrenheit,celsius;
    @Before
    public void setUp() throws Exception {
        tempreture = new Tempreture();
    }

    @Test
    public void given0FahrenheitAnd0Fahrenheit_ShouldReturnEqual() {
        temprature1 = tempreture.unitConvertor(Tempreture.UnitConversionType.FAHRENHEIT, 0);
        temprature2 = tempreture.unitConvertor(Tempreture.UnitConversionType.FAHRENHEIT, 0);
        Assert.assertEquals(temprature1,temprature2,0.0);
    }

    @Test
    public void given0FahrenheitAnd1Fahrenheit_ShouldReturnNotEqual() {
        temprature1 = tempreture.unitConvertor(Tempreture.UnitConversionType.FAHRENHEIT, 0);
        temprature2 = tempreture.unitConvertor(Tempreture.UnitConversionType.FAHRENHEIT, 1);
        Assert.assertNotEquals(temprature1,temprature2,0.0);
    }

    @Test
    public void givenFahrenheitNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = tempreture.equals(null);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void given0CelsiusAnd0Celsius_ShouldReturnEqual() {
        temprature1 = tempreture.unitConvertor(Tempreture.UnitConversionType.CELSIUS, 0);
        temprature2 = tempreture.unitConvertor(Tempreture.UnitConversionType.CELSIUS, 0);
        Assert.assertEquals(temprature1,temprature2,0.0);
    }

    @Test
    public void given0CelsiusAnd1Celsius_ShouldReturnEqual() {
        temprature1 = tempreture.unitConvertor(Tempreture.UnitConversionType.CELSIUS, 0);
        temprature2 = tempreture.unitConvertor(Tempreture.UnitConversionType.CELSIUS, 1);
        Assert.assertNotEquals(temprature1,temprature2,0.0);
    }

    @Test
    public void givenCelsiusNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = tempreture.equals(null);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void givenTemperatureInFahrenheit_ShouldReturnTemperatureInCelsius() {
        fahrenheit = tempreture.unitConvertor(Tempreture.UnitConversionType.FAHRENHEIT, 212);
        celsius = tempreture.unitConvertor(Tempreture.UnitConversionType.CELSIUS,100);
        Assert.assertEquals(celsius,fahrenheit,0.0);
    }

}
