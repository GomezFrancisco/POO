package model;

public class Promo1 implements Promocion {

	public double getPromocion(Compra compra) {
		if (compra.getTotal() > 20000) {
			return (compra.getTotal() * 0.1);
		}
		return 0;
	}
}
