package calc;

public class task4 {

		public static void main(String[] args) {
		int a = 192837;//192837を変数に定義
		//ここは1.
		int aa = 0;//一の位を除く数を変数に定義
		aa = a / 10;//192837÷10 一の位を除く数を求める
		//ここから2.
		int b = 0;
		b = a % 10;

		System.out.println("一の位を除く数:"+aa);
		System.out.println("一の位の数:"+b);
		}




}
