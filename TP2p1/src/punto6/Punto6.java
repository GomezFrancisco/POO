package punto6;

public class Punto6 {
    private Integer numero;
    //constructor de la clase Enteros
    public Punto6(Integer numero) {
           this.numero = numero;
    }
    public Integer getNumero() {
          return numero;
    }
    public void setNumero(Integer numero) {
          this.numero = numero;
    }
    //calcula el cuadrado de n
    public Long cuadrado(){
          return (long) numero*numero;
    }
    // calcula si es par o impar
    public String parImpar() {
    	if (numero % 2 == 0) {
    		return "Par";
    	} else {
    		return "Impar";
    	}
    }
    // calcula el factorial de un numero
    public Long factorial() {
    	long resultado = 1;
    	for(int i = 1; i <= numero; i++) {
    		resultado *= i;
    	}
    	return resultado;
    }
    // calcula si un numero es primo
    public boolean esPrimo() {
    	if (numero <= 1 ) {
    		return false;
    	}
    	for (int i = 2; i <= Math.sqrt(numero); i++) {
    		if (numero % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
