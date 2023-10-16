package entities;

public class Individual extends TaxPayer {
    Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        return (anualIncome * 0.25) - (healthExpenditures * 0.5);
    }

    // @Override
    // public String toString() {
    //     return name + ": $" + tax();
    // }

}
