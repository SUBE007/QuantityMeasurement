package quantitymeasure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityTest {
    Weight weight;
    //double inch,inch1,inch2,feet1,feet2,feet,yard,cm1,cm2;
    //double volume1,volume2,gallon,litre,millilitre;
    double weight2,kilograms,grams,tonne,weight1;
    @Before
    public void setUp() throws Exception {
        weight = new Weight();
    }

//Weight compare
@Test
public void given0KilogramAnd0Kilograms_ShouldReturnEqual() {
    weight1 = weight.unitConvertor(Weight.UnitConversionType.KILOGRAMS, 0);
    weight2 = weight.unitConvertor(Weight.UnitConversionType.KILOGRAMS, 0);
    Assert.assertEquals(weight1,weight2,0.0);
}

    @Test
    public void given0KilogramAnd1Kilograms_ShouldReturnNotEqual() {
        weight1 = weight.unitConvertor(Weight.UnitConversionType.KILOGRAMS, 0);
        weight2 = weight.unitConvertor(Weight.UnitConversionType.KILOGRAMS, 1);
        Assert.assertNotEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenKilogramNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = weight.equals(null);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void given0GramAnd0Grams_ShouldReturnEqual() {
        weight1 = weight.unitConvertor(Weight.UnitConversionType.GRAMS, 0);
        weight2 = weight.unitConvertor(Weight.UnitConversionType.GRAMS, 0);
        Assert.assertEquals(weight1,weight2,0.0);
    }

    @Test
    public void given0GramAnd1Grams_ShouldReturnEqual() {
        weight1 = weight.unitConvertor(Weight.UnitConversionType.GRAMS, 0);
        weight2 = weight.unitConvertor(Weight.UnitConversionType.GRAMS, 1);
        Assert.assertNotEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenGramNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = weight.equals(null);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void given0TonneAnd0Tonne_ShouldReturnEqual() {
        weight1 = weight.unitConvertor(Weight.UnitConversionType.TONNE, 0);
        weight2 = weight.unitConvertor(Weight.UnitConversionType.TONNE, 0);
        Assert.assertEquals(weight1,weight2,0.0);
    }

    @Test
    public void given0TonneAnd1Tonne_ShouldReturnNotEqual() {
        weight1 = weight.unitConvertor(Weight.UnitConversionType.TONNE, 0);
        weight2 = weight.unitConvertor(Weight.UnitConversionType.TONNE, 1);
        Assert.assertNotEquals(weight1,weight2,0.0);
    }

    @Test
    public void givenTonneNull_WhenNull_ShouldReturnTrue() {
        boolean nullCheck = weight.equals(null);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void given1KilogramAnd1000Grams_ShouldReturnEqual() {
        kilograms = weight.unitConvertor(Weight.UnitConversionType.KILOGRAMS, 1);
        grams = weight.unitConvertor(Weight.UnitConversionType.GRAMS, 1000);
        Assert.assertEquals(grams,kilograms,0.0);
    }

    @Test
    public void given1TonneAnd1000Kilograms_ShouldReturnEqual() {
        tonne = weight.unitConvertor(Weight.UnitConversionType.TONNE, 1);
        kilograms = weight.unitConvertor(Weight.UnitConversionType.KILOGRAMS, 1000.0);
        Assert.assertEquals(tonne,kilograms,0.0);
    }
//Addition
    @Test
    public void given1TonneAnd1000Grams_ShouldReturnEqualToThousandAndOneKilograms() {
        tonne = weight.unitConvertor(Weight.UnitConversionType.TONNE, 1);
        grams = weight.unitConvertor(Weight.UnitConversionType.GRAMS, 1000.0);
        double kilograms = tonne + grams;
        Assert.assertEquals(1001, kilograms, 0.0);
    }

}
