package curriculumB;

import java.util.Random;
import java.util.Scanner;

class Qes1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		boolean nameValidation = true;
		boolean keepRunning = true;

		while (nameValidation) {
			name = scanner.nextLine();

			if (name.length() > 10) { //１０文字以下であれば
				System.out.println("名前を10文字以内にしてください");
			} else if (name.length() <= 0 || name.isEmpty()) { //何も入れなかったら
				System.out.println("名前を入力してください");
			} else if (!name.matches("[0-9a-zA-Z]+")) { //半角英数字じゃなければ
				System.out.println("半角英数字のみで名前を入力してください");
			} else {
				System.out.println("ユーザー名『" + name + "』を登録しました");
				nameValidation = false;
			}
		}
		int num = 0;
		while (keepRunning) {
			int input = Integer.parseInt(scanner.nextLine());

			Random random = new Random();
			int randomNumber = random.nextInt(3) + 0;
			String[] janken = { "グー", "チョキ", "パー" };
			num++;
			System.out.println(name + "の手は" + janken[input]);
			System.out.println("相手の手は" + janken[randomNumber]);
			if (input == randomNumber) {
				System.out.println("DRAW あいこ もう一回しましょう！");

			} else if (input == 1 && randomNumber == 0) {
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
			} else if (input == 2 && randomNumber == 1) {
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
			} else if (input == 0 && randomNumber == 2) {
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
			} else {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				keepRunning = false;
			}
		}
		System.out.println("勝つまでにかかった合計回数は" + num + "です");
	}

}
