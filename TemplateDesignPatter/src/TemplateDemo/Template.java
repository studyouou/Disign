package TemplateDemo;
/**
 * 设计一个饮料机模板
 * author:admin
 * */
public abstract class Template {
	/**
	 * 提供run方法来调用模板中的其他方法
	 * final禁止子类覆盖。
	 * */
	public final void run(){
		selection();
		payment();
		take();
		drink();
	}
	/*
	 * 使用abstract抽象方法，是的每个继承模板的方式自定义实现饮料的选择，
	 * 同payment一样，用户自定义支付方式
	 * */
	protected abstract void selection();
	
	protected abstract void payment() ;

	/*
	 * 模板共同方法，由于方式都相同，封装为private不提供给子类
	 * */
	private void take() {
		System.out.println("拿取饮料");
	}
	
	private void drink() {
		System.out.println("喝饮料");
	}

	
	
}
