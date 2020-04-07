package quantitymeasure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityTest {
    Length length1;
    double inch,inch1,inch2,feet1,feet2,feet,yard,cm1,cm2;

    @Before
    public void setUp() throws Exception {
        length1 = new Length();
    }

    @Test
    public void given0Feetand0Feet_ShouldReturnEqual(){
        feet1 = length1.unitConvertor(Length.UnitConversionType.FEET, 0.0);
        feet2 = length1.unitConvertor(Length.UnitConversionType.FEET, 0.0);
        Assert.assertEquals(feet1, feet2, 0.0);
    }
    @Test
    public void given0Feetand1Feet_ShouldReturnNotEqual(){
        feet1 = length1.unitConvertor(Length.UnitConversionType.FEET, 0.0);
        feet2 = length1.unitConvertor(Length.UnitConversionType.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2, 0.0);
    }
    @Test
    public void givenFeetIsNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = length1.equals(null);
        Assert.assertEquals(true, nullCheck);
    }

    @Test
    public void givenValueInFeet_WhenEqual_ReturnTrue() {
        Length length1 = new Length();
        Assert.assertEquals(length1, length1);
    }

    @Test
    public void givenTypeCheck_WhenEqual_ShouldReturnTrue() {
        boolean typeCheck = length1.equals(length1);
        Assert.assertEquals(true, typeCheck);
    }

    @Test
    public void given2Feetand2Feet_ShouldReturnEqual(){
        feet1 = length1.unitConvertor(Length.UnitConversionType.FEET, 2.2);
        feet2 = length1.unitConvertor(Length.UnitConversionType.FEET, 2.2);
        Assert.assertEquals(feet1, feet2, 0.0);
    }

    @Test
    public void given0InchAnd0Inch_WhenEqual_ShouldReturnTrue() {
        inch1 = length1.unitConvertor(Length.UnitConversionType.INCH, 0);
        inch2 = length1.unitConvertor(Length.UnitConversionType.INCH, 0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual(){
        inch1 = length1.unitConvertor(Length.UnitConversionType.INCH, 0);
        inch2 = length1.unitConvertor(Length.UnitConversionType.INCH, 1);
        Assert.assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void givenInchIsNull_WhenEqual_ShouldReturnTrue() {
        boolean nullCheck = length1.equals(null);
        Assert.assertEquals(true, nullCheck);
    }

    @Test
    public void givenInchClass_WhenEqual_ShouldReturnTrue() {
        boolean typeCheck = length1.equals(length1);
        Assert.assertEquals(true, typeCheck);
    }

    @Test
    public void given1Inchand1Inch_ShouldReturnEqual(){
        inch1 = length1.unitConvertor(Length.UnitConversionType.INCH, 1.1);
        inch2 = length1.unitConvertor(Length.UnitConversionType.INCH, 1.1);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0Feetand0Inch_ShouldReturnEqual(){
        inch = length1.unitConvertor(Length.UnitConversionType.FEET, 0.0);
        feet = length1.unitConvertor(Length.UnitConversionType.INCH, 0.0);
        Assert.assertEquals(feet, inch, 0.0);
    }

    @Test
    public void given1Feetand1Inch_ShouldReturnNotEqual() {
        inch = length1.unitConvertor(Length.UnitConversionType.FEET, 1);
        Assert.assertNotEquals(1, inch, 0.0);
    }

   //addition
   @Test
   public void given2InchAnd2Inch_ShouldReturnEqualFourInches() {
        double inch1 = length1.unitConvertor(Length.UnitConversionType.INCH, 2);
        double inch2 = length1.unitConvertor(Length.UnitConversionType.INCH, 2);
        double inch = inch1+inch2;
       Assert.assertEquals(4,inch,0.0);
   }

    @Test
    public void given1FeetAnd2Inch_ShouldReturnEqualFourteenInches() {
        double feet1 = length1.unitConvertor(Length.UnitConversionType.FEET, 1);
        double inch1 = length1.unitConvertor(Length.UnitConversionType.INCH, 2);
        double inch = feet1+inch1;
        Assert.assertEquals(14,inch,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturnEqualTwentyFourInches() {
        double feet1 = length1.unitConvertor(Length.UnitConversionType.FEET,1);
        double feet2 = length1.unitConvertor(Length.UnitConversionType.FEET, 1);
        double inch = feet1+feet2;
        Assert.assertEquals(24,inch,0.0);
    }

    @Test
    public void given2InchAnd2andHalfCentimeter_ShouldReturnEqualThreeInches() {
        double inch = length1.unitConvertor(Length.UnitConversionType.INCH, 2);
        double cm = length1.unitConvertor(Length.UnitConversionType.CENTIMETER, 2.5);
        inch = inch+cm;
        Assert.assertEquals(3,inch,0.0);
    }






}
