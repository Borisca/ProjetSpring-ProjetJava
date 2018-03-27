package com.annotation.exemplevalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PromotionValidator implements ConstraintValidator<Promotion,String>{

	private String[] promoPrefixe;
	
	public void initialize(Promotion promo) {
		promoPrefixe=promo.value();
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {

		if(arg0==null)
			return false;
		
		for (String str: promoPrefixe) {
			if (arg0.contains(str))
				return true;
		}
		return false;
	}

}
