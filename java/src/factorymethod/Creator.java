package factorymethod;

public abstract class Creator {
	/*
	 * 创建一个产品对象，其输入参数类型可以自行设置
	 * 通常为String，Enum，Class等，当然也可以留空
	 */
	public abstract <T extends Product> T createProduct(Class<T> c);
}
