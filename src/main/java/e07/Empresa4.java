package e07;

import java.util.List;
import java.util.Stack;

public class Empresa4 implements IEmpresa{
    private Stack<Empleado> empleados = new Stack<>();

    @Override
    public IIterator createIterator() {
        return new IteradorEmpresa4(empleados);
    }

    @Override
    public void addEmpleado(Empleado empleado) {
        empleados.push(empleado);
    }
}
