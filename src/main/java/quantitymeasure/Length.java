package quantitymeasure;

public class Length {
    private final double value;
    public Conversion.ConversionOfUnit unit;


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Length length = (Length) obj;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

    public Length(Conversion.ConversionOfUnit unit, double value){
        this.value = value;
        this.unit = unit;
    }
    public boolean compareCheck(Length that){
        Double firstValue = this.unit.convertToInches(this.value);
        Double secondValue = that.unit.convertToInches(that.value);
        return firstValue.equals(secondValue);
    }

}
