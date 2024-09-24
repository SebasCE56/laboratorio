package com.tuapp.mavenproject1.probando;


import java.util.ArrayList;
import java.util.List;

public class EmpleadoService {
    private List<Empleado> empleados;

    public EmpleadoService() {
        empleados = new ArrayList<>();
        empleados.add(new Empleado(1, "Juan", "Perez"));
        empleados.add(new Empleado(2, "Maria", "Gomez"));
        empleados.add(new Empleado(3, "Carlos", "Lopez"));
    }

    public Empleado obtenerEmpleadoPorCodigo(int codigo) {
        for (Empleado empleado : empleados) {
            if (empleado.getCodigo() == codigo) {
                return empleado;
            }
        }
        return null;
    }
}
