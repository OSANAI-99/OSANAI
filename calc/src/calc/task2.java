package calc;

public class task2 {

	public static void main(String[] args) {
		//まず変数をつくる
		int a = 10, b = 12 , c = 13;
		//合計を求める
		int goukei = a + b + c;
		//平均を求める
		int average = goukei /3;//3を指定した
		double averageb = goukei / 3.0;//3.0を指定した
		//表示
		System.out.println("合計:" + goukei); //合計:35
		System.out.println("平均(3で割った時):" + average); //平均(3で割った時):11
		System.out.println("平均(3.0で割った時):" + averageb); //平均(3.0で割った時):11.666...
	}

}
