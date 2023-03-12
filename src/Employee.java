import java.util.Objects;

public class Employee {
    private String FIO;
    private int Departament;
    private int Salary;
    private static int Counter = 1;
    private int Id;

    public Employee() {

    }

    public Employee(String fio, int dep, int salary){
        this.FIO = fio;
        this.Departament = dep;
        this.Salary = salary;
        this.Id = Counter++;
    }
    public String getFio(){
        return this.FIO;
    }
    public int getDepartament(){
        return this.Departament;
    }
    public int getSalary(){
        return this.Salary;
    }
    public int getId(){
        return this.Id;
    }

    public void setDepartament(int dep) {
        this.Departament = dep;
    }
    public void setSalary(int salary){
        this.Salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Departament == employee.Departament && Salary == employee.Salary && Id == employee.Id && Objects.equals(FIO, employee.FIO);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FIO, Departament, Salary, Id);
    }

    @Override
    public String toString() {
        return "| Сотрудник id(" + Id +
                ") {ФИО: '" + FIO + '\'' +
                ", отдел: " + Departament +
                ", зарплата: " + Salary + "} | ";
    }
}
