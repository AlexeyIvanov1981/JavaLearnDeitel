package ch5.autoPolicy;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy autoPolicy1 = new AutoPolicy(1, "Toyota", "NY");
        AutoPolicy autoPolicy2 = new AutoPolicy(2, "Nissan", "NN");

        policyInNoFaultState(autoPolicy1);
        policyInNoFaultState(autoPolicy2);


    }
    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s; State: %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                (policy.isNoFaultState() ? "is" : "is not"));
    }
}
