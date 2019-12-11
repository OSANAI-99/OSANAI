package calc;

public class task2 {

	public static void main(String[] args) {
		//まず変数をつくる
		int a = 10, b = 12 , c = 13;
		//合計を求める
		int GOUKEI = a + b + c;
		//平均を求める
		int HEIKIN = GOUKEI /3;//3を指定した
		double HEIKINB = GOUKEI / 3.0;//3.0を指定した
		//表示
		System.out.println("合計:" + (GOUKEI) ); //合計:35
		System.out.println("平均(3で割った時):" + (HEIKIN) ); //平均(3で割った時):11
		System.out.println("平均(3.0で割った時):" + (HEIKINB) ); //平均(3.0で割った時):11.666...


	}

}
