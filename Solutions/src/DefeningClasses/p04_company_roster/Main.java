package DefeningClasses.p04_company_roster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,List<Employee>> employeesByDepartments = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n ; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Employee newEmp = new Employee(
                    input[0],
                    Double.parseDouble(input[1]),
                    input[2],
                    input[3]
            );
            if(input.length>4){
                newEmp.setEmail(input[4]);
                if(input.length>5){
                    newEmp.setAge(Integer.parseInt(input[5]));
                }
            }
            employeesByDepartments.putIfAbsent(newEmp.getDepartment(),new ArrayList<>());
            employeesByDepartments.get(newEmp.getDepartment()).add(newEmp);
        }
        employeesByDepartments.entrySet()
                .stream()
                .sorted((d1,d2)-> Double.compare(
                        d2.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble(),
                        d1.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble())
                )
                .limit(1)
                .forEach(d->{
                    StringBuilder sb = new StringBuilder("");
                    sb.append(String.format("Highest Average Salary: %s%n",d.getKey()));
                    d.getValue().stream()
                            .sorted((s1,s2)->Double.compare(s2.getSalary(),s1.getSalary()))
                            .forEach(e->sb.append(e.toString()).append(System.lineSeparator()));
                    System.out.println(sb);
                });

    }
}
