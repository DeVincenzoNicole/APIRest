package com.Nicole.APIrest.payroll;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("No se pudo encontrar al empleado " + id);
    }
}
