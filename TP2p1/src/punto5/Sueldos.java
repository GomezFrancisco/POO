package punto5;

public class Sueldos {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[5];
		
		empleados[0] = new Empleado ("Juan", 50000);
		empleados[1] = new Empleado ("Maria",100000);
		empleados[2] = new Empleado ("Felipe",80000);
		empleados[3] = new Empleado ("Matias",70000);
		empleados[4] = new Empleado ("Sol", 90000);
		
		Integer total = 0;
		
		for (int i = 0; i < empleados.length; i++) {
			total += empleados[i].getSueldo();
		}
		
		Integer maximo = 0;
		for (int i = 0; i < empleados.length; i++) {
			if (maximo < empleados[i].getSueldo()){
				maximo = empleados[i].getSueldo();
			}
		}

	}

}
