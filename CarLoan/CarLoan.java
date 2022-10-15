public class CarLoan {
    public static void main(String[] args) {
        // variables to be changed to output different scenarios
        int carLoan = 15000;
        //length of car loan in years
        int loanLength = 10;
        int interestRate = 7;
        int downPayment = 2000;

        // check to see if data is valid. Loan length and interest rate cannot be <= 0
        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            // no payments if you are paying off the full car loan amount
            System.out.println("The car can be paid in full.");
        } else {
            // How much loan will be for
            int remainingBalance = carLoan - downPayment;
            // converting loanLength from years to months
            int months = loanLength * 12;
            // monthly payment before interest
            int monthlyBalance = remainingBalance / months;
            // calculating interest
            int interest = (monthlyBalance * interestRate) / 100;
            // total monthly payment
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Your monthly payment will be " + monthlyPayment + ".");
        }
    }
}
