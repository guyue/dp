package templatemethod;

public abstract class AbstractClass {

	// ��������
	protected abstract void doSomething();

	// ��������
	protected abstract void doAnything();

	// ģ�巽��
	public void templateMethod() {
		doSomething();
		doAnything();
	}

}
