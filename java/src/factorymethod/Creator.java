package factorymethod;

public abstract class Creator {
	/*
	 * ����һ����Ʒ����������������Ϳ�����������
	 * ͨ��ΪString��Enum��Class�ȣ���ȻҲ��������
	 */
	public abstract <T extends Product> T createProduct(Class<T> c);
}
