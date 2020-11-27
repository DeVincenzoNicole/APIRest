package com.Nicole.APIrest.payroll;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class EmployeeNotFoundAdvice {

    // este consejo se transmite directamente al cuerpo de respuesta
    @ResponseBody
    // configura el aviso para responder solo si no se encuentra el empleado
    @ExceptionHandler(EmployeeNotFoundException.class)
    // Emite un HTTP 404
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(EmployeeNotFoundException ex) {
        return ex.getMessage();
    }
}