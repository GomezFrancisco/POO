package punto5;

public class Empleado {
		private String Empleado;
		private Integer Sueldo;
		
		public Empleado(String Empleado, Integer sueldo) {
			super();
			this.Empleado = Empleado;
			Sueldo = sueldo;
		}

		public String getEmpleado() {
			return Empleado;
		}

		public void setEmpleado(String Empleado) {
			this.Empleado = Empleado;
		}

		public Integer getSueldo() {
			return Sueldo;
		}

		public void setSueldo(Integer sueldo) {
			Sueldo = sueldo;
		}
		
		
	}
