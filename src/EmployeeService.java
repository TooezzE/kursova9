public class EmployeeService {
    private Employee[] employees = new Employee[10];
    private int counter;

    public void printEmployees() {
        for (int i = 0; i < counter; i++) {
            System.out.println(employees[i]);
        }
        System.out.println();
    }

    public void addEmployee(String fio, int dep, int salary) {
        if(counter >= employees.length){
            System.out.println("Нельзя добавить сотрудника. Список переполнен!");
        } else {
            employees[counter++] = new Employee(fio, dep, salary);
        }
    }

    public int salarySpending() {
        int totalSalary = 0;
        for (int i = 0; i < counter; i++) {
            totalSalary += employees[i].getSalary();
        }
        System.out.println();
        return totalSalary;
    }

    public Employee employeeSalaryMin() {
        Employee employee = new Employee();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employee = employees[i];
            }
        }
        System.out.println();
        return employee;
    }

    public Employee employeeSalaryMax() {
        Employee employee = new Employee();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                employee = employees[i];
            }
        }
        System.out.println();
        return employee;
    }

    public int averageSalary() {
        int averageSalary = salarySpending() / counter;
        System.out.println();
        return averageSalary;
    }

    public void printEmployeesFioOnly() {
        System.out.println("Список ФИО сотрудников:");
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getId() + ". " + employee.getFio());
        }
        System.out.println();
    }

    public void changingSalaryForPercent(int toIncrement1ToDecrement2, int percent) {
        if (toIncrement1ToDecrement2 == 1) {
            for (int i = 0; i < counter; i++) {
                employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * percent / 100);
            }
        } else if (toIncrement1ToDecrement2 == 2) {
            for (int i = 0; i < counter; i++) {
                employees[i].setSalary(employees[i].getSalary() - employees[i].getSalary() * percent / 100);
            }
        }
    }


    public void salaryMinInDepartament(int departament) {
        Employee employee = new Employee();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getDepartament() == departament && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
            if (employees[i].getSalary() == min) {
                employee = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой по отделу " + departament + ": " + employee.getFio() + ", зарплата: " + employee.getSalary());
        System.out.println();
    }

    public void salaryMaxInDepartament(int departament) {
        Employee employee = new Employee();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getDepartament() == departament && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
            if (employees[i].getSalary() == max) {
                employee = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой по отделу " + departament + ": " + employee.getFio() + ", зарплата: " + employee.getSalary());
        System.out.println();

    }

    public int salarySpendingInDepartament(int departament) {
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getDepartament() == departament) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Затраты на зарплаты по отделу " + departament + ": " + sum);
        System.out.println();
        return sum;
    }

    public double averageSalaryInDepartament(int departament) {
        int j = 1;
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getDepartament() == departament) {
                sum += employees[i].getSalary();
                j++;
            }
        }
        double average = (double) sum / j;
        System.out.println("Среднее значение зарплат по отделу " + departament + ": " + average);
        System.out.println();
        return average;
    }

    public void changingSalaryOfDepartamentForPercent(int departament, int toIncrement1ToDecrement2, int percent) {
        for (int i = 0; i < counter; i++) {
            if (employees[i].getDepartament() == departament) {
                if (toIncrement1ToDecrement2 == 1) {
                        employees[i].setSalary(employees[i].getSalary() + employees[i].getSalary() * percent / 100);
                    }
                } else if (toIncrement1ToDecrement2 == 2) {
                        employees[i].setSalary(employees[i].getSalary() - employees[i].getSalary() * percent / 100);
                    }
                }
            }

    public void printEmployeesOfDepartament(int departament) {
        System.out.println("Сотрудники отдела " + departament + ": ");
        for (int i = 0; i < counter; i++) {
            if (employees[i].getDepartament() == departament) {
                System.out.println("| Сотрудник id(" + employees[i].getId() +
                        ") {ФИО: '" + employees[i].getFio() + '\'' +
                        ", зарплата: " + employees[i].getSalary() + "} | ");
            }
        }
        System.out.println();
    }

    public void employeesSalaryLessThanNumber(int number){
        System.out.println("Сотрудники с зарплатой меньше " + number + ": ");
        for (int i = 0; i < counter; i++) {
            if (employees[i].getSalary() < number) {
                System.out.println(employees[i]);
            }
        }
        System.out.println();
    }

    public void employeesSalaryMoreThanNumber(int number){
        System.out.println("Сотрудники с зарплатой больше " + number + ": ");
        for (int i = 0; i < counter; i++) {
            if (employees[i].getSalary() >= number) {
                System.out.println(employees[i]);
            }
        }
        System.out.println();
    }
}
