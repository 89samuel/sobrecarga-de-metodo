public class Salesman extends Employee{

    private double percentPerSold;
    private double soldValue;

    @Override
    public String getCode(){
        return "SL" + super.getCode();
    }

    public double getSoldValue() {
        return soldValue;
    }

    public void setSoldValue(double soldValue) {
        this.soldValue = soldValue;
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getFullSalary(){
        return salary + ((soldValue * percentPerSold) / 100);
    }

    public double getFullSalary(double extra){
        return getFullSalary() + extra;
    }
}
