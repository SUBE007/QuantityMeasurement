package quantitymeasure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0Feetand0Feet_ShouldReturnEqual(){
        Length feet1 = new Length(Conversion.ConversionOfUnit.FEET,0.0);
        Length feet2 = new Length(Conversion.ConversionOfUnit.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual(){
        Length feet1 = new Length(Conversion.ConversionOfUnit.FEET,0.0);
        Length feet2 = new Length(Conversion.ConversionOfUnit.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);
    }
    @Test
    public void given1Feetand1Feet_ShouldReturnEqual(){
        Length feet1 = new Length(Conversion.ConversionOfUnit.FEET,1.0);
        Length feet2 = new Length(Conversion.ConversionOfUnit.FEET,1.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual(){
        Length inch1 = new Length(Conversion.ConversionOfUnit.INCH,0.0);
        Length inch2 = new Length(Conversion.ConversionOfUnit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }
    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual(){
        Length inch1 = new Length(Conversion.ConversionOfUnit.INCH,0.0);
        Length inch2 = new Length(Conversion.ConversionOfUnit.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }
    @Test
    public void given1Inchand1Inch_ShouldReturnEqual(){
        Length inch1 = new Length(Conversion.ConversionOfUnit.INCH,1.0);
        Length inch2 = new Length(Conversion.ConversionOfUnit.INCH,1.0);
        Assert.assertEquals(inch1, inch2);
    }
    @Test
    public  void given1Feetand1Inch_ShouldReturnNotEqual(){
        Length feet1 = new Length(Conversion.ConversionOfUnit.FEET,1.0);
        Length inch1 = new Length(Conversion.ConversionOfUnit.INCH,1.0);
        Assert.assertNotEquals(feet1, inch1);
    }
    @Test
    public void givenOnNullValue_ShouldReturnFalse(){
        Length feet1 = new Length(Conversion.ConversionOfUnit.FEET, 3.0);
        Length feet2 = null;
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenType_WhenEqual_ShouldReturnTrue() {
        Length feet1 = new Length(Conversion.ConversionOfUnit.FEET,0.0);
        boolean typeCheck= feet1.equals(feet1);
        Assert.assertEquals(true,typeCheck);
    }
    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqualLength(){
        Length feet1 = new Length(Conversion.ConversionOfUnit.FEET,1.0);
        Length inch1 = new Length(Conversion.ConversionOfUnit.INCH,1.0);
        boolean compareCheck = feet1.compareCheck(inch1);
        Assert.assertFalse(compareCheck);
    }


    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqualLength(){
        Length feet1 = new Length(Conversion.ConversionOfUnit.FEET,1.0);
        Length inch1 = new Length(Conversion.ConversionOfUnit.INCH,1.0);
        boolean compareCheck = inch1.compareCheck(feet1);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1Feetand12Inch_ShouldReturnTrue(){
        Length feet1 = new Length(Conversion.ConversionOfUnit.FEET,1.0);
        Length inch1 = new Length(Conversion.ConversionOfUnit.INCH,12.0);
        boolean compareCheck = feet1.compareCheck(inch1);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given12Inchand1Feet_ShouldReturnTrue(){
        Length inch1 = new Length(Conversion.ConversionOfUnit.FEET,1.0);
        Length feet1 = new Length(Conversion.ConversionOfUnit.INCH,12.0);
        boolean compareCheck = inch1.compareCheck(feet1);
        Assert.assertTrue(compareCheck);
    }

}
