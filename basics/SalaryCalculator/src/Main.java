import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {
    private static Map<Integer, Employee> employeesMap = new HashMap<>();
    private static int lastID = 0;

    public static void main(String[] args) {
        addEmployee("Mario", 35);
        addEmployee("Pera", 46);

        setWorkweek(1, 45);
        setWorkweek(2, 35);

        // Add a new week for existing employees
        addNewWeek(1, 30);
        addNewWeek(2, 40);

        for (Employee emp : employeesMap.values()) {
            System.out.println(emp.getWorkweekDetails());
        }
    }

    private static void addEmployee(String name, int hourlySalary) {
        lastID++;
        employeesMap.put(lastID, new Employee(lastID, name, hourlySalary));
    }

    private static void setWorkweek(int employeeId, int totalHours) {
        Employee employee = employeesMap.get(employeeId);
        if (employee != null) {
            employee.addWorkweek(totalHours);
        }
    }

    private static void addNewWeek(int employeeId, int totalHours) {
        Employee employee = employeesMap.get(employeeId);
        if (employee != null) {
            employee.addNewWeek(totalHours);
        }
    }

    private static class Employee {
        int id;
        String name = "unknown";
        double hourlySalary = 14.25;
        private List<Workweek> workweeks;

        public Employee(int id, String name, int hourlySalary) {
            this.id = id;
            this.name = name;
            this.hourlySalary = hourlySalary;
            this.workweeks = new ArrayList<>();
        }

        public void addWorkweek(int totalHours) {
            Workweek newWorkweek = new Workweek();
            newWorkweek.addHours(totalHours);
            workweeks.add(newWorkweek);
        }

        public void addNewWeek(int totalHours) {
            Workweek currentWeek = workweeks.get(workweeks.size() - 1);
            currentWeek.addHours(totalHours);
        }

        public String getWorkweekDetails() {
            StringBuilder result = new StringBuilder("- " + name + ":\n");

            if (!workweeks.isEmpty()) {
                Workweek lastWeek = workweeks.get(workweeks.size() - 1);
                result.append("  ").append(lastWeek.toString()).append("\n");
            }

            int totalHoursAcrossWeeks = 0;

            return result.toString();
        }
    }

    private static class Workweek {
        int totalHours;
        int totalOvertime;
        int overtimeMultFactor = 2;

        public void addHours(int hours) {
            if (hours > 40) {
                totalHours += 40;
                totalOvertime += hours - 40;
            } else {
                totalHours += hours;
            }
        }

        public double calculateSalary(Employee employee) {
            return (totalHours * employee.hourlySalary +
                    overtimeMultFactor * totalOvertime * employee.hourlySalary);
        }

        public int getTotalHours() {
            return totalHours;
        }

        @Override
        public String toString() {
            return "Week - Total hours: " + totalHours + ", Total overtime: " + totalOvertime +
                    ", Total salary: " + calculateSalary(new Employee(0, "", 0));
        }
    }
}
