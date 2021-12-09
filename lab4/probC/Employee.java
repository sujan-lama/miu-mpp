package probC;

public abstract class Employee {

    public String empId;


    public abstract double calcGrossPay(int month, int year);


    public Paycheck calcCompensation(int month, int year) {
        return new Paycheck(calcGrossPay(month, year), 0.23, 0.05, 0.01, 0.03, 0.075);
    }


    public void print(int month, int year) {
        Paycheck paycheck = calcCompensation(month, year);
        System.out.println("Employee Id : " + empId);
        System.out.println("Paystub:");
        System.out.println("GrossPay : " + paycheck.getGrossPay());
        System.out.println("Fica : " + paycheck.getFica());
        System.out.println("State : " + paycheck.getState());
        System.out.println("Local : " + paycheck.getLocal());
        System.out.println("Medicare : " + paycheck.getMedicare());
        System.out.println("Social Security : " + paycheck.getSocialSecurity());
        System.out.println("NET PAY : " + paycheck.getNetPay());
        System.out.println("\n");
    }

}
