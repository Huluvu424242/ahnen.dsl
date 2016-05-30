package com.github.funthomas424242.dsl.validation;

import java.util.Date;

import javax.inject.Inject;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

public class MyTerminalConverters {

	
	@Inject
    private DATEValueConverter dateValueConverter;
    
    @ValueConverter(rule = "DATE")
    public IValueConverter<Date> DATE() {
            return (IValueConverter<Date>) dateValueConverter;
    }
	
}
