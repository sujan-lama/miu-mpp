package prob1;

public class PersonWithJob {

    private double salary;
    private Person person;

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return person.getName();
    }

    PersonWithJob(Person person, double s) {
        this.person = person;
        salary = s;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public boolean equals(Object aPerson) {
        if (aPerson == null) return false;
        if (!(aPerson instanceof PersonWithJob)) return false;
        PersonWithJob p = (PersonWithJob) aPerson;
        boolean isEqual = this.getName().equals(p.getName()) &&
                this.getSalary() == p.getSalary();
        return isEqual;
    }

    public static void main(String[] args) {
        Person p2 = new Person("Joe");
        PersonWithJob p1 = new PersonWithJob(p2, 30000);
        //As PersonsWithJobs, p1 should be equal to p2
        System.out.println("p1.equals(p2)? " + p1.getPerson().equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1.getPerson()));
    }


}
