package day23;
/*
 * 生产者消费者问题 生产者将产品放入仓库,消费者取出仓库中的产品。仓库是有容量限制的,当仓库中产品的数量
>=100时,生产者等待消费者来消费,当仓库中产品的数量<=0时,消费者等待生产者来生产。
 * */
//仓库
public class Repository {
	// 产品的数量
	private int count = 0;

	public void increase() {
		count = count + 1;
	}

	public void decrease() {
		count = count - 1;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Repository [count=" + count + "]";
	}
}
