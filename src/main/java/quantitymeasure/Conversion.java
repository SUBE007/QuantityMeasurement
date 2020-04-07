package quantitymeasure;

public class Conversion {
    public enum ConversionOfUnit{
        FEET{
            public double convertToInches(double value){
                return value = 12;
            }
        }, INCH{
            public double convertToInches(double value){
                return value;
            }
        };
        public double convertToInches(double value){
            return 0.0;
        }
    }
}
