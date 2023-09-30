package model;

import java.util.Calendar;

public class Promo3 implements Promocion {
	
	public double getPromocion(Compra compra) {
		Calendar cal = Calendar.getInstance();
        cal.setTime(compra.getFecha());
        
		if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY){
			return (compra.getTotal() * 0.2);
		}
		return 0;
	}

}
