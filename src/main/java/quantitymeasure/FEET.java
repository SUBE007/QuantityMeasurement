package quantitymeasure;

public class FEET {
    private final double value;

    public FEET(double value){
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FEET feet = (FEET) obj;
        return Double.compare(feet.value, value) == 0;
    }

}
