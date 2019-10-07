package day21;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/*
 *java.util.Properties类代表一个java配置文件。java配置文件以.properties结尾,可以将配置参数,如数据库连接地
址放入到配置文件中,而不使用硬编码。
*/

public class day2112 {
	public static void main(String[] args) {
		// props代表了一个配置文件
		Properties props = new Properties();
		InputStream is = null;
		// 将配置文件的信息加载到props对象中
		// day2112.class是一个类对象
		// java中的每个类一旦加载到jvm中,就会产生一个类对象
		// 类对象描述了类的信息(有什么方法,有什么属性)
		// 类对象有一个方法getResourceAsStream可以从classpath路径下加载文件
		// java从classpath下加载类
		// 每个类只被加载一次,每个类只有一个类对象
		// 类对象的类型是ClassInputStream is = null;
		// 将流中的数据加载到props对象中
		try {
			// 第一个/代表src目录,classpath的根目录
			is = day2112.class.getResourceAsStream("/javase_tutorial/tutorial_java_se/day21/db.properties/db.properties");
			props.load(is);
			// props.getProperty方法通过key得到value
			System.out.println(props.getProperty("username"));
			System.out.println(props.getProperty("password"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
