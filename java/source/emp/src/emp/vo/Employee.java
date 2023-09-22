package emp.vo;

import java.time.LocalDate;

public class Employee {
//	필드
	private Long id;
	private String dept;
	private String name;
	private int salary;
	private LocalDate startDate;
	private LocalDate endDate;
	
	
//	생성자 : 기본, 매개변수
	public Employee() {}
	
	public Employee(Long id, String dept, String name, int salary) {
		this.id = id;
		this.dept = dept;
		this.name = name;
		this.salary = salary;
	}

	
//	get, set
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}

	
//	출력 메소드
	@Override
	public String toString() {
		return "사번 : " + id + ", 부서 : " + dept + ", 이름 : " + name + ", 급여 : " + salary + ", 입사일 : "
				+ startDate + ", 퇴사일 : " + endDate;
	}
}
