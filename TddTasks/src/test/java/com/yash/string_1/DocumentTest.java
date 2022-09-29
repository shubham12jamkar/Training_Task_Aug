package com.yash.string_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DocumentTest {

	documentmain dm=new documentmain();
	
	@Test
	public void test_document_String_as_output()
	{
	 String str=dm.showDocumentInformation();
	 dm.setTitle("java basics");
	
		dm.setFilepath("c:/document/corejava/basics/introduction.pdf");
	 assertEquals(str,"{title:java basics"+","+"filepath:"+"c:/document/corejava/basics/introduction.pdf"+"}");
		
	}
}
