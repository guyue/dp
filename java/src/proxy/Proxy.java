package proxy;

public class Proxy implements Subject {
	
	private Subject subject = null;
	
	public Proxy(Object subject) {
		this.subject = (Subject) subject;
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
		this.before();
		this.subject.request();
		this.after();
	}
	
	private void before() {
		System.out.println("����Ԥ����");
	}
	
	private void after() {
		System.out.println("�����ƺ���");
	}
}
