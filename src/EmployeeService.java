public class EmployeeService {
    private Employee[] employees = new Employee[10];
    private int counter;

    public void printEmployees() {
        System.out.println("Список сотрудников: ");
        for (int i = 0; i < counter; i++) {
            Employee employee = employees[i];
            System.out.println(employee);
        }
        System.out.println();
    }

    public void addEmployee(String fio, int dep, int salary) {
        employees[counter++] = new Employee(fio, dep, salary);
    }

    public int salarySpending() {
        int totalSalary = 0;
        for (int i = 0; i < counter; i++) {
            totalSalary += employees[i].getSalary();
        }
        System.out.println("Общие траты на зарплаты: " + totalSalary);
        System.out.println();
        return totalSalary;
    }

    public Employee employeeSalaryMin() {
        Employee employee = new Employee();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
            }
            if (employees[i].getSalary() == min) {
                employee = employees[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + employee);
        System.out.println();
        return employee;
    }

    public Employee employeeSalaryMax() {
        Employee employee = new Employee();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
            if (employees[i].getSalary() == max) {
                employee = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + employee);
        System.out.println();
        return employee;
    }

    public int averageSalary() {
        int averageSalary = salarySpending() / counter;
        System.out.println("Средние значение зарплат: " + averageSalary);
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
        int size = 0;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getDepartament() == departament) {
                size++;
            }
        }
        Employee[] employeesOfDepartament = new Employee[size];
        int j = 0;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getDepartament() == departament) {
                employeesOfDepartament[j] = employees[i];
                j++;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (employeesOfDepartament[i].getSalary() < min) {
                min = employeesOfDepartament[i].getSalary();
            }
            if (employeesOfDepartament[i].getSalary() == min) {
                employee = employeesOfDepartament[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой по отделу " + departament + ": " + employee.getFio() + ", зарплата: " + employee.getSalary());
        System.out.println();
    }

    public void salaryMaxInDepartament(int departament) {
        Employee employee = new Employee();
        int size = 0;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getDepartament() == departament) {
                size++;
            }
        }
        Employee[] employeesOfDepartament = new Employee[size];
        int j = 0;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getDepartament() == departament) {
                employeesOfDepartament[j] = employees[i];
                j++;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (employeesOfDepartament[i].getSalary() > max) {
                max = employeesOfDepartament[i].getSalary();
            }
            if (employeesOfDepartament[i].getSalary() == max) {
                employee = employeesOfDepartament[i];
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой по отделу " + departament + ": " + employee.getFio() + ", зарплата: " + employee.getSalary());
        System.out.println();
    }

    public void salarySpendingInDepartament(int departament) {
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getDepartament() == departament) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Затраты на зарплаты по отделу " + departament + ": " + sum);
        System.out.println();
    }

    public void averageSalaryInDepartament(int departament) {
        int j = 1;
        int sum = 0;
        int average = 0;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getDepartament() == departament) {
                sum += employees[i].getSalary();
                average = sum / j;
                j++;
            }
        }
        System.out.println("Среднее значение зарплат по отделу " + departament + ": " + average);
        System.out.println();
    }

    public void changingSalaryOfDepartamentForPercent(int departament, int toIncrement1ToDecrement2, int percent) {
        int size = 0;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getDepartament() == departament) {
                size++;
            }
        }
        Employee[] employeesOfDepartament = new Employee[size];
        int j = 0;
        for (int i = 0; i < counter; i++) {
            if (employees[i].getDepartament() == departament) {
                employeesOfDepartament[j] = employees[i];
                j++;
            }
        }
        if (toIncrement1ToDecrement2 == 1) {
            for (int i = 0; i < size; i++) {
                employeesOfDepartament[i].setSalary(employeesOfDepartament[i].getSalary() + employeesOfDepartament[i].getSalary() * percent / 100);
            }
        } else if (toIncrement1ToDecrement2 == 2) {
            for (int i = 0; i < size; i++) {
                employeesOfDepartament[i].setSalary(employeesOfDepartament[i].getSalary() - employeesOfDepartament[i].getSalary() * percent / 100);
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
