package variable;

public class task3 {

	public static void main(String[] args) {

		int intNum = 219; //メモ:変換前
		long intNumB = intNum = 219;//メモ:変換後
		//ここまででひと塊


		double doubleNum = 364.2;//メモ:変換前
		float doubleNumB = (float) doubleNum;//メモ:強制変換後
		//ここまででひと塊

		long longNum = 123456L;//メモ:変換前
		double longNumB = longNum = 123456L;//メモ:変換後

		System.out.println("変換前"); //プレビュー1
		System.out.println("intNum");//メモ:結果
		System.out.println("doubleNum");//メモ:結果
		System.out.println("longNum");//メモ:結果
		//ここまで変換前

		System.out.println("変換後"); //プレビュー1
		System.out.println("intNumBの値");//メモ:結果
		System.out.println("doubleNumの値: " + doubleNumB);//メモ:結果
		System.out.println("longNumBの値");//メモ:結果
		//ここまで変換後
	}


}
