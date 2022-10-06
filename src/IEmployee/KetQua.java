package IEmployee;
public class KetQua {
    public static void main(String[] args) {
        System.out.println("Part Time:");
        IEmployee employee1 = new PartTimeEmployee("Adexa KEOBORLAKOT", 45000, 5);
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary per day: " + employee1.calculateSalary());

        IEmployee employee2 = new PartTimeEmployee("Xoksay HOUNGHUEANG", 45000, 3 );
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary per day: " + employee2.calculateSalary());

        System.out.println("Full Time 8 Hours:");
        IEmployee employee3 = new FullTimeEmployee("Phonekham VILAYVONG", 65000);
        System.out.println("Name: " + employee3.getName());
        System.out.println("Salary per day: " + employee2.calculateSalary());
    }
}