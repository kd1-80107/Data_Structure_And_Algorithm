package com.employee;

public class EmployeeNode {
	    Employee employee;
	    EmployeeNode next;

	    public EmployeeNode(Employee employee) {
	        this.employee = employee;
	        this.next = null;
	    }
}