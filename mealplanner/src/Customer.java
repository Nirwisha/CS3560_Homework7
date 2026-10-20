public class Customer {
    private String customerName;
    private String dietPlan;

    public Customer(String customerName, String dietPlan) {
        this.customerName = customerName;
        this.dietPlan = dietPlan;
    }

    public String getName() {
        return customerName;
    }

    public String getDietPlan() {
        return dietPlan;
    }
}
