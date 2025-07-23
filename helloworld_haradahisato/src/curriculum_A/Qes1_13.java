package curriculum_A;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Qes1_13 {

	public static void main(String[] args) {
		//1、ローカル変数を宣言
		byte byteNum;
		short shortNum;
		int intNum;
		long longNum;
		float floatNum;
		double doubleNum;
		char charNum;
		String stringNum;
		boolean booleanNum;
		//2、ローカル変数に初期値を代入
		byteNum = 0;
		shortNum = 0;
		intNum = 0;
		longNum = 0;
		floatNum = 0.0f;
		doubleNum = 0;
		charNum = '\u0000';
		stringNum = null;
		booleanNum = false;
		//３、変数に値を代入
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		charNum = 'a';
		stringNum = "ハロー";
		booleanNum = true;
		//コンソールに出力
		System.out.println(longNum + intNum + shortNum + byteNum);
		System.out.println(byteNum + byteNum);
		System.out.println(charNum + stringNum + booleanNum);
		System.out.println(Math.round(byteNum + shortNum + intNum + longNum + floatNum + doubleNum));
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);
		//5
		byteNum = 43;
		System.out.println("ハローJAVA" + byteNum);
		//６

		String stringNum1 = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String stringNum5 = "寿司";
		System.out.println("初めまして" + stringNum1 + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("体重は" + weight + "kgです。");
		System.out.println("好きな食べ物は" + stringNum5 + "です。");
		//7

		double bmi = weight / ((height / 100) * (height / 100));
		BigDecimal beforeBmi = new BigDecimal(bmi);
		BigDecimal afterBmi = beforeBmi.setScale(1, RoundingMode.HALF_UP);
		System.out.println("BMIは" + afterBmi + "です。");

		//8
		stringNum1 = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		stringNum5 = "オムライス";
		System.out.println("初めまして" + stringNum1 + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("体重は" + weight + "kgです。");
		System.out.println("好きな食べ物は" + stringNum5 + "です。");
		bmi = weight / ((height / 100) * (height / 100));
		beforeBmi = new BigDecimal(bmi);
		afterBmi = beforeBmi.setScale(1, RoundingMode.HALF_UP);
		System.out.println("BMIは" + afterBmi + "です。");

		//9
		stringNum1 = "鈴木一郎";
		age += age;
		height += height;
		weight += weight;
		stringNum5 = "オムライス";
		System.out.println("初めまして" + stringNum1 + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("身長は" + height + "cmです。");
		System.out.println("体重は" + weight + "kgです。");
		System.out.println("好きな食べ物は" + stringNum5 + "です。");
		bmi = weight / ((height / 100) * (height / 100));
		beforeBmi = new BigDecimal(bmi);
		afterBmi = beforeBmi.setScale(2, RoundingMode.HALF_UP);
		System.out.println("BMIは" + afterBmi + "です。");

		//10

		age = 24;
		System.out.println(age >= 25);

		//11
		age = 24;
		height = 168.5;
		weight = 64.2;
		String str = String.valueOf(age);
		String str1 = String.valueOf(height);
		String str2 = String.valueOf(weight);
		System.out.println(str + str1 + str2);

		//12
		int num = Integer.parseInt(str);
		double db = Double.parseDouble(str1);
		int num1 = (int) db;
		System.out.println(num + num1);
		
		//13
		
		num = 25;
		db = 160;
		System.out.println(age >= 25);

	}
}
