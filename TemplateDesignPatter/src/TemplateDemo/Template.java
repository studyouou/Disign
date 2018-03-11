package TemplateDemo;
/**
 * ���һ�����ϻ�ģ��
 * author:admin
 * */
public abstract class Template {
	/**
	 * �ṩrun����������ģ���е���������
	 * final��ֹ���า�ǡ�
	 * */
	public final void run(){
		selection();
		payment();
		take();
		drink();
	}
	/*
	 * ʹ��abstract���󷽷����ǵ�ÿ���̳�ģ��ķ�ʽ�Զ���ʵ�����ϵ�ѡ��
	 * ͬpaymentһ�����û��Զ���֧����ʽ
	 * */
	protected abstract void selection();
	
	protected abstract void payment() ;

	/*
	 * ģ�干ͬ���������ڷ�ʽ����ͬ����װΪprivate���ṩ������
	 * */
	private void take() {
		System.out.println("��ȡ����");
	}
	
	private void drink() {
		System.out.println("������");
	}

	
	
}
