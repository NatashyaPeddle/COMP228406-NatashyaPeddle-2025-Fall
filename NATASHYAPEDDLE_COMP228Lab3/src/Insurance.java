public abstract class Insurance {

    String insuranceType;
    double monthlyCost;

    public String getInsuranceType() {
        return insuranceType;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }


    public abstract void setInsuranceCost();

    public abstract void setInsuranceCost(double cost);

    public abstract void displayInfo();



} //END
