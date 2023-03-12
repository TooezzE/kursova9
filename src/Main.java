public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        employeeService.addEmployee("Гагарин Юрий Алексеевич", 2, 94_000);
        employeeService.addEmployee("Иванов Иван Иванович", 3, 200_000);
        employeeService.addEmployee("Петров Петр Петрович", 3, 100_000);
        employeeService.addEmployee("Иртуганов Егор Дмитриевич", 1, 350_000);
        employeeService.addEmployee("Серега Просто Серега", 2, 13_000);

        employeeService.printEmployees();

        employeeService.salarySpending();
        employeeService.employeeSalaryMin();
        employeeService.employeeSalaryMax();
        employeeService.averageSalary();

        employeeService.printEmployeesFioOnly();

        employeeService.changingSalaryForPercent(1, 0);
        employeeService.printEmployees();

        employeeService.salaryMinInDepartament(3);
        employeeService.salaryMaxInDepartament(3);
        employeeService.salarySpendingInDepartament(2);
        employeeService.averageSalaryInDepartament(2);
        employeeService.changingSalaryOfDepartamentForPercent(3, 1, 50);
        employeeService.printEmployees();
        employeeService.printEmployeesOfDepartament(2);
        employeeService.employeesSalaryLessThanNumber(130_000);
        employeeService.employeesSalaryMoreThanNumber(103_000);
    }
}