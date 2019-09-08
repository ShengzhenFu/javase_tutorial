package day17;
class Connection{
	public void open(){
		System.out.println("打开连接");
}
	public void close(){
		System.out.println("关闭连接");
	}
}
public class day1707 {
	public static void f(Connection con){
		try {
		con.open();//打开连接
		String str = null;
		str.toString();//出现异常,执行finally块,然后将异常抛出给调用者
		}finally{//
		con.close();//关闭连接
		}
		}
		public static void main(String[] args) {
		Connection con = new Connection();
		f(con);
		System.out.println("main");//不会执行
		}
}
