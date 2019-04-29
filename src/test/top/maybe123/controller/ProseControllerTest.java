package top.maybe123.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProseControllerTest {
	
	@Test
	public void getProse() {
		ProseController pr=new ProseController();
		pr.getProse(null);
	}
}