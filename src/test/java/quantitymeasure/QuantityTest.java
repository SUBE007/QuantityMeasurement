package quantitymeasure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityTest {
    Length length1;
    double inch,inch1,inch2,feet1,feet2,feet,yard,cm1,cm2,volume1,volume2,gallon,litre,millilitre;

    @Before
    public void setUp() throws Exception {
        length1 = new Length();
    }

//Volume compare
   @Test
   public void given0GallonAnd0Gallon_ShouldReturnEqual() {
       volume1 = length1.unitConvertor(Length.UnitConversionType.GALLON, 0);
       volume2 = length1.unitConvertor(Length.UnitConversionType.GALLON, 0);
       Assert.assertEquals(volume1,volume2,0.0);
   }

    @Test
    public void given0GallonAnd1Gallon_ShouldReturnNotEqual() {
        volume1 = length1.unitConvertor(Length.UnitConversionType.GALLON, 0);
        volume2 = length1.unitConvertor(Length.UnitConversionType.GALLON, 1);
        Assert.assertNotEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenGallonNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = length1.equals(null);
        Assert.assertEquals(true,nullCheck);
    }

    @Test
    public void given0LitreAnd0Litre_ShouldReturnEqual() {
        volume1 = length1.unitConvertor(Length.UnitConversionType.LITRE, 0);
        volume2 = length1.unitConvertor(Length.UnitConversionType.LITRE, 0);
        Assert.assertEquals(volume1,volume2,0.0);
    }

    @Test
    public void given0LitreAnd1Litre_ShouldReturnNotEqual() {
        volume1 = length1.unitConvertor(Length.UnitConversionType.LITRE, 0);
        volume2 = length1.unitConvertor(Length.UnitConversionType.LITRE, 1);
        Assert.assertNotEquals(volume1,volume2,0.0);
    }

    @Test
    public void given0MillilitreAnd0Millilitre_ShouldReturnEqual() {
        volume1 = length1.unitConvertor(Length.UnitConversionType.MILLILITRE, 0);
        volume2 = length1.unitConvertor(Length.UnitConversionType.MILLILITRE, 0);
        Assert.assertEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenLitreNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = length1.equals(null);
        Assert.assertEquals(true,nullCheck);
    }

    @Test
    public void given1LitreAnd1000Millilitre_ShouldReturnEqual() {
        litre = length1.unitConvertor(Length.UnitConversionType.LITRE, 1);
        millilitre = length1.unitConvertor(Length.UnitConversionType.MILLILITRE, 1000);
        Assert.assertEquals(millilitre,litre,0.0);

    }



    @Test
    public void given0MillilitreAnd1Millilitre_ShouldReturnNotEqual() {
        volume1 = length1.unitConvertor(Length.UnitConversionType.MILLILITRE, 0);
        volume2 = length1.unitConvertor(Length.UnitConversionType.MILLILITRE, 1);
        Assert.assertNotEquals(volume1,volume2,0.0);
    }

    @Test
    public void givenMillilitreNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = length1.equals(null);
        Assert.assertEquals(true,nullCheck);
    }
    @Test
    public void given1GallonAndThreePointSeventyEightLitres_ShouldReturnEqual() {
        gallon = length1.unitConvertor(Length.UnitConversionType.GALLON, 1);
        litre = length1.unitConvertor(Length.UnitConversionType.LITRE, 3.78);
        Assert.assertEquals(litre,gallon,0.0);
    }




}
