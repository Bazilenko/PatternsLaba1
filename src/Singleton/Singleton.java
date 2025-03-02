package Singleton;

public class Singleton {
    private static Singleton instance;
    public String name;
    protected double salary;
    protected int experienceYears = 0;

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    protected void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setSalary(double salary) {
        if (this.experienceYears < 5)
            this.salary = salary + (salary * 0.10);
        else if (this.experienceYears > 5 && this.experienceYears < 10)
            this.salary = salary + salary * 0.15;
        else if (this.experienceYears > 10)
            this.salary = salary + salary * 0.2;

    }
    public static Singleton getInstance(String name, double salary, int experienceYears) {
        if (instance == null) {
            instance = new Singleton(name, salary, experienceYears);
        }
        return instance;
    }

    public Singleton(String name, double salary, int experienceYears) {
        this.setName(name);
        this.setSalary(salary);
        this.setExperienceYears(experienceYears);
    }



    @Override
   public String toString() {
        return ("Name: " + this.getName() + " Salary: " + this.getSalary() + " Experience Years: " + this.getExperienceYears() + "\n");
    }
}
