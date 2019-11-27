package software_construction_OOP_version_1_1;

import java.util.*;

public abstract class Binary_Operation_Version_1_1 {
	private int Left_Num;
	private int Right_Num;
	private char Operator;
	private int Result;
	
	/*��ʽ��������Left_num��Right_num��Operator��Result��get����*/
	public int getLeft_num() {
		return this.Left_Num;
	}
	public int getRight_num() {
		return this.Right_Num;
	}
	public char getOperator() {
		return this.Operator;
	}
	public int getResult() {
		return this.Result;
	}
	
	/*��������ʽ��ֵ*/
	public abstract int calculate(int left_num,int right_num);
	/*�ж�����ʽ��ֵ�Ƿ�Ϸ�������true�Ϸ�������false���Ϸ�*/
	public abstract boolean checkcalculate(int Calculate_Num);
	
	/*��������ʽ*/
	public void Construct_Operation(char ch) {
		Random random = new Random();
		/*�����������*/
		this.Left_Num = random.nextInt(101);
		int RS;
		/*�����Ҳ���������ͣ��������ֵ��ֱ�������������Ǹ�Ϊֹ*/
		do {
			this.Right_Num = random.nextInt(101);
			RS = calculate(this.Left_Num, this.Right_Num);
		}while(!checkcalculate(RS));
		/*��¼���Result�Ͳ�����ch*/
		this.Result = RS;
		this.Operator = ch;
	}
}
