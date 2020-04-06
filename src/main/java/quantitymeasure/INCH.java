package quantitymeasure;

public class INCH {
    private final double value;

    public INCH(double value){
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        INCH inch = (INCH) obj;
        return Double.compare(inch.value, value) == 0;
    }
}
