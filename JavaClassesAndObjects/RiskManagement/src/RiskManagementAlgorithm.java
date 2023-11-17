import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RiskManagementAlgorithm {

    private static final double MAX_RISK_EXPOSURE = 0.05;

    public static void main(String[] args) {
        List<Loan> loanPortfolio = createLoanPortfolio(10);

        double currentRiskExposure = calculateRiskExposure(loanPortfolio);

        if (currentRiskExposure <= MAX_RISK_EXPOSURE) {
            System.out.println("Risk exposure within acceptable limits.");
        } else {
            System.out.println("Risk exposure exceeded. Implement risk mitigation measures.");
        }
    }

    static class Loan {
        private double loanAmount;
        private double risk;

        public Loan(double loanAmount, double risk) {
            this.loanAmount = loanAmount;
            this.risk = risk;
        }

        public double getLoanAmount() {
            return loanAmount;
        }

        public double getRisk() {
            return risk;
        }
    }

    private static double calculateRiskExposure(List<Loan> loanPortfolio) {
        double totalLoanAmount = 0;
        double totalRiskExposure = 0;

        for (Loan loan : loanPortfolio) {
            totalLoanAmount += loan.getLoanAmount();
            totalRiskExposure += loan.getLoanAmount() * loan.getRisk();
        }

        return totalRiskExposure / totalLoanAmount;
    }

    private static List<Loan> createLoanPortfolio(int numberOfLoans) {
        List<Loan> loanPortfolio = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < numberOfLoans; i++) {
            double loanAmount = random.nextDouble() * 500000;
            double risk = random.nextDouble() * 0.1;
            loanPortfolio.add(new Loan(loanAmount, risk));
        }

        return loanPortfolio;
    }
}
