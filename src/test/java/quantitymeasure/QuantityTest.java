package quantitymeasure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityTest {
    Length value;
    double inch,inch1,inch2,feet1,feet2,cm1,cm2, length1, length2,feet,yard;

    @Before
    public void setUp() throws Exception {
        value = new Length();
    }

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual(){
        feet1 = value.unitConvertor(Length.ConversionOfUnitType.FEET, 0.0);
        feet2 = value.unitConvertor(Length.ConversionOfUnitType.FEET, 0.0);
        Assert.assertEquals(feet1, feet2, 0.0);
    }
    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual(){
        feet1 = value.unitConvertor(Length.ConversionOfUnitType.FEET, 0.0);
        feet2 = value.unitConvertor(Length.ConversionOfUnitType.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2, 0.0);
    }
    @Test
    public void givenFeetIsNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = value.equals(null);
        Assert.assertEquals(true, nullCheck);
    }

    @Test
    public void givenValueInFeet_WhenEqual_ReturnTrue() {
        Length length1 = new Length();
        Assert.assertEquals(value, length1);
    }

    @Test
    public void givenTypeCheck_WhenEqual_ShouldReturnTrue() {
        boolean typeCheck = value.equals(value);
        Assert.assertEquals(true, typeCheck);
    }

    @Test
    public void given2Feetand2Feet_ShouldReturnEqual(){
        feet1 = value.unitConvertor(Length.ConversionOfUnitType.FEET, 2.2);
        feet2 = value.unitConvertor(Length.ConversionOfUnitType.FEET, 2.2);
        Assert.assertEquals(feet1, feet2, 0.0);
    }

    @Test
    public void given0InchAnd0Inch_WhenEqual_ShouldReturnTrue() {
        inch1 = value.unitConvertor(Length.ConversionOfUnitType.INCH, 0);
        inch2 = value.unitConvertor(Length.ConversionOfUnitType.INCH, 0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual(){
        inch1 = value.unitConvertor(Length.ConversionOfUnitType.INCH, 0);
        inch2 = value.unitConvertor(Length.ConversionOfUnitType.INCH, 1);
        Assert.assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void givenInchIsNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = value.equals(null);
        Assert.assertEquals(true, nullCheck);
    }

    @Test
    public void givenInchClass_WhenEqual_ShouldReturnTrue() {
        boolean typeCheck = value.equals(value);
        Assert.assertEquals(true, typeCheck);
    }

    @Test
    public void given1Inchand1Inch_ShouldReturnEqual(){
        inch1 = value.unitConvertor(Length.ConversionOfUnitType.INCH, 1.1);
        inch2 = value.unitConvertor(Length.ConversionOfUnitType.INCH, 1.1);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0Feetand0Inch_ShouldReturnEqual(){
        inch = value.unitConvertor(Length.ConversionOfUnitType.FEET, 0.0);
        feet = value.unitConvertor(Length.ConversionOfUnitType.INCH, 0.0);
        Assert.assertEquals(feet, inch, 0.0);
    }

    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqual() {
        inch = value.unitConvertor(Length.ConversionOfUnitType.FEET, 1);
        Assert.assertNotEquals(1, inch, 0.0);
    }

    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqual() {
        inch = value.unitConvertor(Length.ConversionOfUnitType.INCH, 1);
        feet = value.unitConvertor(Length.ConversionOfUnitType.FEET, 1);
        Assert.assertNotEquals(feet, inch, 0.0);
    }

    @Test
    public void given1Feetand12Inch_ShouldReturnEqual() {
        inch = value.unitConvertor(Length.ConversionOfUnitType.FEET, 1);
        Assert.assertEquals(12, inch, 0.0);
    }

    @Test
    public void given12Inchand1Feet_ShouldReturnEqual() {
        inch = value.unitConvertor(Length.ConversionOfUnitType.INCH, 12);
        feet = value.unitConvertor(Length.ConversionOfUnitType.FEET, 1);
        Assert.assertEquals(inch, feet, 0.0);
    }
    // Yard
    @Test
    public void given1Yardand3Feet_ShouldReturnEqual() {
        feet = value.unitConvertor(Length.ConversionOfUnitType.FEET, 3);
        yard = value.unitConvertor(Length.ConversionOfUnitType.YARD, 1);
        Assert.assertEquals(feet, yard, 0.0);
    }

    @Test
    public void given3Feetand1Yard_ShouldReturnEqual() {
        feet = value.unitConvertor(Length.ConversionOfUnitType.FEET, 3);
        yard = value.unitConvertor(Length.ConversionOfUnitType.YARD, 1);
        Assert.assertEquals(yard, feet, 0.0);
    }

    @Test
    public void given1Yardand36Inch_ShouldReturnEqual() {
        yard = value.unitConvertor(Length.ConversionOfUnitType.YARD, 1);
        inch = value.unitConvertor(Length.ConversionOfUnitType.INCH, 36);
        Assert.assertEquals(inch, yard, 0.0);
    }

    @Test
    public void given1Feetand1Yard_ShouldReturnNotEqual() {
        feet = value.unitConvertor(Length.ConversionOfUnitType.FEET, 1);
        yard = value.unitConvertor(Length.ConversionOfUnitType.YARD, 1);
        Assert.assertNotEquals(yard, feet, 0.0);
    }

    @Test
    public void given1Inchand1Yard_ShouldReturnNotEqual() {
        inch = value.unitConvertor(Length.ConversionOfUnitType.INCH, 1);
        yard = value.unitConvertor(Length.ConversionOfUnitType.YARD, 1);
        Assert.assertNotEquals(inch, yard, 0.0);
    }

     @Test
    public void given36Inchand1Yard_ShouldReturnEqual() {
        yard = value.unitConvertor(Length.ConversionOfUnitType.YARD, 1);
        inch = value.unitConvertor(Length.ConversionOfUnitType.INCH, 36);
         Assert.assertEquals(inch, yard, 0.0);
    }

}
