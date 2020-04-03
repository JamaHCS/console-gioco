package com.gioco.controller.repository;

import com.gioco.model.Employee;

import java.util.ArrayList;

public class EmployeeRepo {
    private Employee jamaEmplooyee = new Employee();
    public static ArrayList<Employee> employees = new ArrayList<>();


    public EmployeeRepo() {
        generateJama();
        employees.add(getJamaEmplooyee());
    }

    public Employee getJamaEmplooyee() {
        return jamaEmplooyee;
    }

    public void setJamaEmplooyee(Employee jamaEmplooyee) {
        this.jamaEmplooyee = jamaEmplooyee;
    }

    private void generateJama() {
        jamaEmplooyee.setNickname("JamaHCS");
        jamaEmplooyee.setPassword("acceso");
        jamaEmplooyee.setFirstName("Héctor");
        jamaEmplooyee.setSecondName("Jama");
        jamaEmplooyee.setMiddleName("Escobedo");
        jamaEmplooyee.setLastName("Olguín");
        jamaEmplooyee.setBornDate("20/03/2000");
        jamaEmplooyee.setEmail("jamahcs@outlook.com");
        jamaEmplooyee.setPhoneNumber("7731598533");
        jamaEmplooyee.setUserType(1);
        jamaEmplooyee.setStatus(1);
    }
}
