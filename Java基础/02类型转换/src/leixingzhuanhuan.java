/*
	类型转换：
		隐式转换
		强制转换
	隐式转换：
		byte,short,char -- int -- long -- float -- double。
		从小到大进行转换。
	强制转换：
		目标类型 变量名 = （目标类型）(被转换的数据)
*/
public class leixingzhuanhuan{
	public static void main(String[] args){
		/*int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);*/

		int aa = 1;
		byte bb = 2;
		//将里面的int强制转换为byte类型
		byte cc = (byte) (aa+bb);
		System.out.println("被转换为的类型："+cc);

	}
}