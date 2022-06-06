package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Employee {

	private int id;  
	private String name;  
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;
	
	
	public Employee(int id, String name, int age, String gender, String department, int yearOfJoning, double salary) {
		
		this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getDepartment() {
		return department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	
	
	  
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
    public String toString() {
        return 
                "Id = " + id +
                ", name = " + name + '\'' +
                ", age = " + age +
                ", Gender = " + gender +
                ", Department = " + department +
                ", Year of Joning = " + yearOfJoining +
                ", Salary = " + salary;
        
    }

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employees.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employees.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employees.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employees.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employees.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employees.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employees.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employees.add(new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0));

		//Creating the List and Printing 
		System.out.println("List of Employess: ");
		employees.stream().forEach(System.out::println);
		
		
		//QUESTION 1 - Count Employees
		Map<String, Long> numberOfempEachDep= employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		System.out.println();
		System.out.println("Number of Empoyees in Each Department: ");
		System.out.println(numberOfempEachDep);
		
		//QUESTION 2 - List Employees
		Map<String,List<String>> listOfemplEachDep = employees.stream()
				.collect(Collectors
                .groupingBy(Employee::getDepartment,Collectors
                		.mapping(Employee::getName,Collectors.toList())));
		System.out.println();
		System.out.println("List of employees by each department: ");
        System.out.println(listOfemplEachDep);
                   	
}
}
