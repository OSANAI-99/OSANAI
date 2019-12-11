package calc;
import java.util.Scanner;
public class task5 {

	public static void main(String[] args) {
		System.out.println("キーボードから入力してください");
		Scanner sc = new Scanner(System.in);
		String str =sc.next();//例tech
		String str2 =sc.next();//例compass
		sc.close();//Scannerおわり

		//ノートPCの値段
		String string1 = "ノートPCの値段:";
		int hassen = 89800;
		String enn = "円";
    	System.out.println(string1+HASSEN+ENN);

    	//入力されたもの
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str+str2);
	}

}
