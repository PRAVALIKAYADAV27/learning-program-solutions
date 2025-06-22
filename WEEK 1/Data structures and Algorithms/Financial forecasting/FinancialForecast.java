public class FinancialForecast {

    //recursive method to calculate future value
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        //base case= if years is 0,returns the current value
        if (years == 0) {
            return initialValue;
        }

        //recursive case: multiply previous year's value by (1 + growthRate)
        return calculateFutureValue(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialInvestment = 8000.0; // 8000
        double annualGrowthRate = 0.12;  // 12%
        int forecastYears = 5;

        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, forecastYears);

        System.out.printf("Forecasted value after %d years: %.2f\n", forecastYears, futureValue);
    }
}