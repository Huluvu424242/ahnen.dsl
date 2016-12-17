define([], function() {
	var keywords = "Adoptiert|Familie|Familienbuch|Keine|Kind|Leiblich|Letzte|Mutter|Organisation|Person|Sonstige|Sponsored|Stiefkind|Unbekannt|Unverheiratet|Vater|abgebrochen|als|andauernd|bei|bekannt|bis|import|in|keine|lebend|lebensgemeinschaft|ohne|unabsehbar|unbekannt|unerfasst|vermisst|von|weiblich";
	return {
		id: "xtext.ahnen",
		contentTypes: ["xtext/ahnen"],
		patterns: [
			{include: "orion.c-like#comment_singleLine"},
			{include: "orion.c-like#comment_block"},
			{include: "orion.lib#string_doubleQuote"},
			{include: "orion.lib#string_singleQuote"},
			{include: "orion.lib#number_decimal"},
			{include: "orion.lib#brace_open"},
			{include: "orion.lib#brace_close"},
			{name: "keyword.ahnen", match: "\\b(?:" + keywords + ")\\b"}
		]
	};
});
