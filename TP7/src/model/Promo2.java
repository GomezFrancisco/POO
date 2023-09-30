package model;

public class Promo2 implements Promocion {
	
	public double getPromocion(Compra compra) {
		if (compra.getTotal() > 50000){
			return (compra.getTotal() * 0.2);
		}
		return 0;
	}

}
