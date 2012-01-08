package com.southbeachdownunder.drax.tokenisers;

import junit.framework.TestCase;

public class LuceneTextTokeniserTest extends TestCase {
	public LuceneTextTokeniser luceneTextTokeniser 
		= new LuceneTextTokeniser();
	
	public void testMe(){
		
		String[] results = luceneTextTokeniser.tokenise("hello world");
		
		assertStringsEqual (new String[]{"hello","world"}, results);
	}
	
	private void assertStringsEqual(String []expected, String[] actual){
		assertEquals(expected.length, actual.length);
		for (int i=0;i<expected.length;i++){
			assertEquals(expected[i], actual[i]);
		}
		
	}

}
