import java.util.ArrayList;
import java.util.List;

public class JavaStreamsExamples6 {

    public static class Employee{
        public String salary;
        public Employee(String salary){
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("8000"));
        list.add(new Employee("5000"));
        list.add(new Employee("6000"));
        list.add(new Employee("7000"));

        int sum =
                list.stream()
                .map(employee -> employee.salary)
                .map(Integer::parseInt)
                .reduce(0, (tempSum, value) -> tempSum + value);

        System.out.println(sum);
    }

}
