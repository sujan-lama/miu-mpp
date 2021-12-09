package lesson7.labs.prob1.partD;

public class Employee {
    private String name;
    private int salary;
    private boolean visited;

    public Employee(String name, int salary) {
        this(name, salary, false);
    }

    public Employee(String name, int salary, boolean visited) {
        this.name = name;
        this.salary = salary;
        this.visited = visited;
    }


    public String getName() {
        return name;
    }


    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "(" + name + ", " + salary + ")";
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (!(ob instanceof Employee)) return false;
        Employee emp = (Employee) ob;
        return emp.name.equals(name) && emp.salary == salary && emp.visited == visited;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long longval = Double.doubleToLongBits(salary);
        int salaryHash = (int) (longval ^ (longval >>> 32));
        result += 31 * result + name.hashCode();
        result += 31 * result + salaryHash;
        result += 31 * result + salaryHash;
        result += 31 * result + (visited ? 1 : 0);
        return result;
    }
}
