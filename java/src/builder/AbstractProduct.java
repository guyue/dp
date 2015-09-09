package builder;

public abstract class AbstractProduct {
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
