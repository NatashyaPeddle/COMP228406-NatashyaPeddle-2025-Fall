public class Health extends Insurance {
    public Health (String insuranceType) {
        super (insuranceType);
    }


    @Override
    public void setInsuranceCost() {

    }

    @Override
    public void setInsuranceCost(double cost) {
        this.monthlyCost = cost;
    }


    @Override
    public void displayInfo( ) {

    }


}
