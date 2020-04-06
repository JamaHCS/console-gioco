package com.gioco.model.repository;

import com.gioco.model.object.Employee;

import java.util.ArrayList;

/**
 * Clase repositorio de empleados, aquí es donde se guardan los empleados que se vayan generando.
 * (Se podría omitir esta clase y solo agregar el array list en otro lado, pero me gusta como queda mas organizado así).
 */
public class EmployeeRepo implements IFilleable {
    public static ArrayList<Employee> employees = new ArrayList<>();

    private Employee jamaEmplooyee = new Employee();

    public EmployeeRepo() {
        this.fillData();
        employees.add(jamaEmplooyee);
    }

    @Override
    public void fillData() {
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
        jamaEmplooyee.setBranch("Antea");
    }
}
