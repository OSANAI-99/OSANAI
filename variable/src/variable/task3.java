package variable;

public class task3 {

	public static void main(String[] args) {

		int intBefNum = 219;//メモ:変換前
		long longAftNum = (long) intBefNum;//メモ:変換後
		//ここまででひと塊

		double doubleBefNum = 364.2;//メモ:変換前
		float doubleAftNum = (float) doubleBefNum;//メモ:強制変換後
		//ここまででひと塊

		long longBefNum = 123456L;//メモ:変換前
		double longAftNumB = longBefNum;//メモ:変換後（long→double強制は必要ないはず）
		//ここまででひと塊

		System.out.println("変換前"); //プレビュー1
		System.out.println(intBefNum);//メモ:結果
		System.out.println(doubleBefNum);//メモ:結果
		System.out.println(longBefNum);//メモ:結果
		//ここまで変換前

		System.out.println("変換後"); //プレビュー2
		System.out.println(longAftNum);//メモ:結果
		System.out.println(doubleAftNum);//メモ:結果
		System.out.println(longAftNumB);//メモ:結果
		//ここまで変換後
	}


}
