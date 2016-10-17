package com.github.funthomas424242.dsl;

import java.util.Date;

import javax.inject.Inject;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

public class AhnenTerminalConverters extends DefaultTerminalConverters {
	
	
    @Inject
    private DATEValueConverter dateValueConverter;
    
    @ValueConverter(rule = "DATE")
    public IValueConverter<Date> DATE() {
            return dateValueConverter;
    }

}