package com.Nicole.APIrest.payroll;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Employee {

    private @Id @GeneratedValue Long id;
    private String nombre;
    private String puesto;

    Employee() {}

    Employee(String nombre, String puesto) {

        this.nombre = nombre;
        this.puesto = puesto;
    }

    public Long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.nombre, employee.nombre)
                && Objects.equals(this.puesto, employee.puesto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.nombre, this.puesto);
    }

    @Override
    public String toString() {
        return "Empleado {" + "id=" + this.id + ", nombre='" + this.nombre + '\'' + ", puesto='" + this.puesto + '\'' + '}';
    }
}