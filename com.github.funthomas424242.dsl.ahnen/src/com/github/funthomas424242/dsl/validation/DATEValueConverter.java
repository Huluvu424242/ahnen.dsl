package com.github.funthomas424242.dsl.validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;

public class DATEValueConverter extends AbstractLexerBasedConverter<Date> {

	@Override
	public String toString(Date value) {
		return value.toString();
	}

//	@Override
//	public void assertValidValue(Date value) {
//		super.assertValidValue(value);
//		if (value < 0)
//			throw new ValueConverterException(getRuleName() + "-value may not be negative (value: " + value + ").",
//					null, null);
//	}

	@Override
	public Date toValue(String string, INode node) throws ValueConverterException {
		// val String stripped = string.substring(1, string.length() - 1);
		final String stripped = string;
		try {
			return new SimpleDateFormat("dd.MM.yyyy").parse(stripped);
		} catch (ParseException e) {
			System.out.println("HIER");
			throw new ValueConverterException(string, node, e);
		}
	}

}
