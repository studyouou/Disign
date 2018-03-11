package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Template.impl.TemplateOne;
import Template.impl.TemplateTwo;
import TemplateDemo.Template;

public class TestTemplate {
	private Template one=new TemplateOne();
	private Template two=new TemplateTwo();
	@Test
	public void testOne() {
		one.run();
	}
	@Test
	public void testTwo(){
		two.run();
	}

}
