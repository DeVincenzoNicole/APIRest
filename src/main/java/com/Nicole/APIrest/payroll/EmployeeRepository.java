package com.Nicole.APIrest.payroll;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Nicole.APIrest.payroll.Employee;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}