package calc;
import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		//まず変数をつくる
		Scanner sc = new Scanner(System.in);
		sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		sc.close();//Scannerおわり

		//合計を求める
		int goukei = a + b + c;
		//平均を求める
		int heikin = GOUKEI /3;//3を指定した
		double heikinb = GOUKEI / 3.0;//3.0を指定した
		//表示
		System.out.println("合計:" + (goukei) ); //合計:35
		System.out.println("平均(3で割った時):" + (heikin) ); //平均(3で割った時):11
		System.out.println("平均(3.0で割った時):" + (heikinb) ); //平均(3.0で割った時):11.666...
	}

}
