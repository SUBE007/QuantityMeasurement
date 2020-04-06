package quantitymeasure;

public class Length {
    public enum ConversionOfUnitType {
        FEET(1*12.0),
        INCH(1.0),
        YARD(1*36.0), CENTIMETER(1/2.5);


        public Double type;
        ConversionOfUnitType(Double type){
            this.type=type;
        }

        double getType(){
            return type;
        }
    }
    public double unitConvertor(ConversionOfUnitType unit, double value) {
        return value*unit.getType();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Length feet = (Length) obj;
         return false;
    }

}
