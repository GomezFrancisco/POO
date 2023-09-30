package MatrizProduct;

public class MultiplicaVector extends Thread {
	private int[] fila;
	private int[] columna;
	private Integer resultado = 0;

	public MultiplicaVector(int[] fila, int[] columna) throws Exception {
		if (fila.length == columna.length) {
			this.fila = fila;
			this.columna = columna;
		} else {
			throw new Exception("El producto no esta definido.");
		}

	}

	public void run() {
		for (int i = 0; i < fila.length; i++) {
			resultado += fila[i] * columna[i];
		}
	}

	public Integer getResultado() {
		return resultado;
	}
	

}