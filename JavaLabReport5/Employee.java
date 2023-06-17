package JavaLabReport5;

class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void earnings() {
        System.out.println("Employee: " + firstName + " " + lastName);
        System.out.println("Social Security Number: " + socialSecurityNumber);
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public void earnings() {
        super.earnings();
        System.out.println("Weekly Salary: $" + weeklySalary);
        System.out.println("Earned: $" + weeklySalary);
    }
}

class HourlyEmployee extends Employee {
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hourlyWage, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void earnings() {
        super.earnings();
        double earnings = hourlyWage * hoursWorked;
        System.out.println("Hourly Wage: $" + hourlyWage);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Earned: $" + earnings);
    }
}

class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

       public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public void earnings() {
        super.earnings();
        double earnings = grossSales * commissionRate;
        System.out.println("Gross Sales: $" + grossSales);
        System.out.println("Commission Rate: " + commissionRate);
        System.out.println("Earned: $" + earnings);
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public void earnings() {
        super.earnings();
        double earnings = getGrossSales() * getCommissionRate() + baseSalary;
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Earned: $" + earnings);
    }
}

class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40.0);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000.00, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000.00, 0.04, 300.00);

        salariedEmployee.earnings();
        System.out.println();

        hourlyEmployee.earnings();
        System.out.println();

        commissionEmployee.earnings();
        System.out.println();

        basePlusCommissionEmployee.earnings();
        System.out.println();
    }
}
