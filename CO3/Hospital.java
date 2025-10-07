// Abstract class - Abstraction
abstract class Staff {
    private String name;
    private double baseSalary;

    // Constructor
    public Staff(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Getters and Setters - Encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Name: " + name + ", Final Salary: ₹" + calculateSalary());
    }
}

// Subclass - Doctor
class Doctor extends Staff {
    private int patientsAttended;

    public Doctor(String name, double baseSalary, int patientsAttended) {
        super(name, baseSalary);
        this.patientsAttended = patientsAttended;
    }

    public int getPatientsAttended() {
        return patientsAttended;
    }

    public void setPatientsAttended(int patientsAttended) {
        this.patientsAttended = patientsAttended;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (patientsAttended * 500); // ₹500 per patient
    }
}

// Subclass - Nurse
class Nurse extends Staff {
    private int extraHours;

    public Nurse(String name, double baseSalary, int extraHours) {
        super(name, baseSalary);
        this.extraHours = extraHours;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (extraHours * 100); // ₹100 per extra hour
    }
}

// Subclass - AdminStaff
class AdminStaff extends Staff {
    private double bonus;

    public AdminStaff(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

// Main class to test
public class Hospital {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Dr. Meera", 40000, 15);
        Nurse nurse = new Nurse("Nurse John", 25000, 10);
        AdminStaff admin = new AdminStaff("Alex", 30000, 5000);

        doc.displayDetails();
        nurse.displayDetails();
        admin.displayDetails();
    }
}
