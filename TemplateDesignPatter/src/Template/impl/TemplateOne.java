package Template.impl;

import TemplateDemo.Template;
/**
 * author:admin
 * 模板实现类
 * */
public class TemplateOne extends Template {

	@Override
	protected void selection() {
		System.out.println("红牛");
	}

	@Override
	protected void payment() {
		System.out.println("支付宝支付");
	}

}
