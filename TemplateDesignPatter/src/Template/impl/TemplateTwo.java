package Template.impl;
import TemplateDemo.Template;

/**
 * author:admin
 * 模板实现类
 * */
public class TemplateTwo extends Template {

	@Override
	protected void selection() {
		System.out.println("脉动");
	}

	@Override
	protected void payment() {
		System.out.println("微信支付");
	}

}
