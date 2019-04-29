package top.maybe123.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProseServiceTest {
	
	@Test
	public void getProsePage() {
		ProseService proseService=new ProseService();
		proseService.getProsePage(1);
	}
}