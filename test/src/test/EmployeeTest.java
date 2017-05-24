package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.cap.demo.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(100, "aaa","aaa",100.11);
		Employee emp2 = new Employee(200, "bbb","bbb",200.22);
		Employee emp3 = new Employee(9, "saa","ccc",300.33);
		Employee emp4 = new Employee(4, "sc","ddd",400.44);
		Employee emp5 = new Employee(500, "sb","eee",500.55);
		
		/*Employee emp1 = new Employee();
		emp1.setEmpId(100);
		emp1.setFirstName("AAA");
		emp1.setLastName("aaa");
		emp1.setSalary(100.00);

		Employee emp2 = new Employee();
		emp2.setEmpId(200);
		emp2.setFirstName("BBB");
		emp2.setLastName("bbb");
		emp2.setSalary(200.00);

		Employee emp3 = new Employee();
		emp3.setEmpId(300);
		emp3.setFirstName("CCC");
		emp3.setLastName("ccc");
		emp3.setSalary(300.00);

		Employee emp4 = new Employee();
		emp4.setEmpId(400);
		emp4.setFirstName("DDD");
		emp4.setLastName("ddd");
		emp4.setSalary(400.00);

		Employee emp5 = new Employee();
		emp5.setEmpId(500);
		emp5.setFirstName("EEE");
		emp5.setLastName("eee");
		emp5.setSalary(500.00);
		
		Employee emp6 = new Employee();
		emp6.setEmpId(300);
		emp6.setFirstName("EEE");
		emp6.setLastName("eee");
		emp6.setSalary(500.00);*/
		
		Map<Employee, String> hashMap = new HashMap<Employee, String>();
		//Map<Employee, String>  hashMap = new TreeMap<Employee, String>();
		
		

		hashMap.put(emp1, "emp1");
		hashMap.put(emp2, "emp2");
		hashMap.put(emp3, "emp3");
		hashMap.put(emp4, "emp4");
		hashMap.put(emp5, "emp5");
		//hashMap.put(emp6, "emp6");
		
		hashMap.forEach((k,v) ->System.out.println("key:"+k+", Value:"+v));
	}

}
