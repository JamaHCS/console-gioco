package com.gioco.model.repository;

import com.gioco.model.object.Employee;

import java.util.ArrayList;

public class EmployeeRepo {
    public static ArrayList<Employee> employees = new ArrayList<>();

    private Employee jamaEmplooyee = new Employee();

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
