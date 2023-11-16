public class Main {
    private static Employee employee;
    private static Workweek workweek;

    public static void main(String[] args) {
        employee = new Employee("Mario", 35);
        workweek = new Workweek();

        employee = new Employee("Pera", 46);

        setWorkweek(45);

        System.out.println(workweek);
    }

    private static void setWorkweek(int totalHours) {
         workweek.setHours(totalHours);
    }

    private static class Workweek {
        int hours;
        int overtime;
        int overtimeMultFactor = 2;

        public void setHours(int totalHours) {
            if (totalHours > 40) {
                this.hours = 40;
                this.overtime = totalHours - 40;
            } else {
                this.hours = totalHours;
                this.overtime = 0;
            }
        }

        public double calculateSalary(Employee employee) {
            return (hours * employee.hourlySalary +
                    overtimeMultFactor * overtime * employee.hourlySalary);
        }

        public String toString(){
            return "- "+ employee.name + ", normal hours : " + workweek.hours +
                    " overtime: " + workweek.overtime + " total salary: + " +
                    workweek.calculateSalary(employee) ;
        }
    }

    private static class Employee {
        String name = "unknown";
        double hourlySalary = 14.25;

        public Employee(String name, int hourlySalary) {
            this.name = name;
            this.hourlySalary = hourlySalary;
        }
    }
}
