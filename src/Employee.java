import java.util.Objects;

public class Employee {
    private String fio;
    private int departament;
    private int salary;
    private static int counter = 1;
    private int id;

    public Employee(){

    }
    public Employee(String fio, int dep, int salary){
        this.fio = fio;
        this.departament = dep;
        this.salary = salary;
        this.id = counter++;
    }
    public String getFio(){
        return this.fio;
    }
    public int getDepartament(){
        return this.departament;
    }
    public int getSalary(){
        return this.salary;
    }
    public int getId(){
        return this.id;
    }

    public void setDepartament(int dep) {
        this.departament = dep;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return departament == employee.departament && salary == employee.salary && id == employee.id && Objects.equals(fio, employee.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio, departament, salary, id);
    }

    @Override
    public String toString() {
        return "| Сотрудник id(" + id +
                ") {ФИО: '" + fio + '\'' +
                ", отдел: " + departament +
                ", зарплата: " + salary + "} | ";
    }
}
