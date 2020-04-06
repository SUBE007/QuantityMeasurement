package quantitymeasure;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual(){
        FEET feet1 = new FEET(0.0);
        FEET feet2 = new FEET(0.0);
        Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual(){
        FEET feet1 = new FEET(0.0);
        FEET feet2 = new FEET(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }
    @Test
    public void given1Feetand1Feet_ShouldReturnEqual(){
        FEET feet1 = new FEET(1.0);
        FEET feet2 = new FEET(1.0);
        Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqual(){
        FEET feet1 = new FEET(1.0);
        INCH inch1 = new INCH(1.0);
        Assert.assertNotEquals(feet1, inch1);
    }
    @Test
    public void given1Feetand0Inch_ShouldReturnNotEqual(){
        FEET feet1 = new FEET(1.0);
        INCH inch1 = new INCH(0.0);
        Assert.assertNotEquals(feet1, inch1);
    }
    @Test
    public void given0Inchand0Inch_ShouldReturnEqual(){
        INCH inch1 = new INCH(0.0);
        INCH inch2 = new INCH(0.0);
        Assert.assertEquals(inch1, inch2);
    }
    @Test
    public void given0Inchand0Inch_ShouldReturnNotEqual(){
        INCH inch1 = new INCH(0.0);
        INCH inch2 = new INCH(1.0);
        Assert.assertNotEquals(inch1, inch2);
    }
    @Test
    public void given1Inchand1Inch_ShouldReturnEqual(){
        INCH inch1 = new INCH(1.0);
        INCH inch2 = new INCH(1.0);
        Assert.assertEquals(inch1, inch2);
    }
    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqual(){
        INCH inch1 = new INCH(1.0);
        FEET feet1 = new FEET(1.0);
        Assert.assertNotEquals(feet1, inch1);
    }
    @Test
    public void given1Inchand0Feet_ShouldReturnNotEqual(){
        FEET feet1 = new FEET(0.0);
        INCH inch1 = new INCH(1.0);
        Assert.assertNotEquals(inch1, feet1);
    }
    @Test
    public void givenOnNullValue_ShouldReturnFalse(){
        FEET feet1 = new FEET(3.0);
        FEET feet2 = null;
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }
    @Test
    public void givenFeetObject_WhenEqual_ShouldReturnTrue() {
        FEET feet1 = new FEET(0.0);
        FEET feet2 = new FEET(0.0);
        Assert.assertEquals(feet1,feet2);
    }
    @Test
    public void givenType_WhenEqual_ShouldReturnTrue() {
        FEET feet1 = new FEET(0.0);
        boolean typeCheck= feet1.equals(feet1);
        Assert.assertEquals(true,typeCheck);
    }
}
