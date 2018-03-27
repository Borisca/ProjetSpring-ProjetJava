package com.annotation.exemplevalidation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import org.springframework.messaging.handler.annotation.Payload;
@Constraint(validatedBy=PromotionValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Promotion {

	
	public String[] value() default "BOR";

	public String message() default "Code Promo Faux";
	
	public Class<?>[] groups() default{};
	public Class<? extends Payload>[] payload() default{};
}
