package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 2,10, 5
Sorting Employees
Test Input
chef geek
100 50
[geek, chef]
geek
chef
Input: employee = ["chef", "geek"], salary = [100, 50]
Output: ["geek", "chef"]
Explanation: "geek" has a lower salary (50) than "chef" (100), so "geek" comes first.
Input: employee = ["ram", "shyam", "rohan"], salary = [60, 45, 60]
Output: ["shyam", "ram", "rohan"]
Explanation: "shyam" has the lowest salary (45), so "shyam" comes first, followed by "ram" and "rohan," who both have the same salary (60). They keep their original order.
*/
// User function Template for Java
class Sorting_Employees {
	static public List<String> sortRecords(List<String> employee, List<Integer> salary) {
		// Your code goes here
		List<Pair> pairs = new ArrayList<>();
		for (int i = 0; i < employee.size(); i++) {
			pairs.add(new Pair(employee.get(i), salary.get(i)));
		}
		pairs.sort((p1, p2) -> {
			int compareResult = Integer.compare(p1.salary, p2.salary);
			return compareResult == 0 ? p1.name.compareTo(p2.name) : compareResult;
		});
		List<String> sortedEmployees = new ArrayList<>();
		for (Pair pair : pairs) {
			sortedEmployees.add(pair.name);
		}
		System.out.println(sortedEmployees);
		return sortedEmployees;
	}
	public static void main(String[] args) throws Exception {
		System.out.println ("Read the data");
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine().trim());
		while (t-- > 0) {
			String line = read.readLine().trim();
			String[] employeeArr = line.split(" ");
			List<String> employee = new ArrayList<>(Arrays.asList(employeeArr));
			line = read.readLine().trim();
			String[] salArr = line.split(" ");
			List<Integer> sal = new ArrayList<>();
			for (String s : salArr) {
				sal.add(Integer.parseInt(s));
			}
		
		List<String> sortedEmp = sortRecords(employee, sal);
			for (String name : sortedEmp) {
				System.out.println(name + " ");
		}
		}
		
	}
}
class Pair {
   String name;
   int salary;
   Pair(String name, int salary) {
       this.name = name;
       this.salary = salary;
   }
}
