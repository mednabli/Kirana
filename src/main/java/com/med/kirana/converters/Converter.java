package com.med.kirana.converters;

public interface Converter<S,T> {
	
	T convert(S source);
	
}
