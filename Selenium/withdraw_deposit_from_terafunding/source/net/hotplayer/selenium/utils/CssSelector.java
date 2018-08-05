package net.hotplayer.selenium.utils;

import java.text.MessageFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CssSelector {
	private String tag;
	private String attribute;
	private String value;

	@Override
	public String toString() {
		return MessageFormat.format("{0}[{1}=''{2}'']", tag, attribute, value);
	}
}
