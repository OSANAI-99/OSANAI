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
