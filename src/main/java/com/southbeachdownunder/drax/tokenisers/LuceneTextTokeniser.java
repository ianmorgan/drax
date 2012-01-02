package com.southbeachdownunder.drax.tokenisers;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.lucene.analysis.WhitespaceTokenizer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.util.Attribute;

public class LuceneTextTokeniser {

	public String[] tokenise(String text) {
		// factory = new FilterFactory();
		try {
			StringReader reader = new StringReader(text);
			WhitespaceTokenizer wt = new WhitespaceTokenizer(
					org.apache.lucene.util.Version.LUCENE_35, reader);
			wt.reset();
			List<String> tokens = new ArrayList<String>();
			while (wt.incrementToken()) {
				//tokens.add(wt.toString());
				Attribute a = wt.getAttribute(CharTermAttribute.class);
				tokens.add(a.toString());
			}
			return tokens.toArray(new String[0]);
		} catch (Exception ex) {
			ex.printStackTrace();
			return text.split(" ");
		}
	}

}
