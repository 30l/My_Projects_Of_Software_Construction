package software_construction_OOP;

import java.util.*;

public class Binary_Operation {
	private int Left_Num;
	private int Right_Num;
	private char Operator;
	private int Result;
	Random random = new Random();
	
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
	
	/*���캯��*/
	public Binary_Operation() {
		makeOperator();
	}
	
	/*Step1�����ɲ�����*/
	private void makeOperator() {
		{
			int flag;
			flag = random.nextInt(2);
			/*������ɲ�������0 ���� ��+�� ��1 ���� ��-�� */
			if(flag == 0) {
				this.Operator = '+';
			}
			else this.Operator = '-';
		}
		makeOperationNum();
	}
	
	
	/*Step2���������Ҳ�����*/
	private void makeOperationNum(){
		{
			/*�������������Left_Num*/
			this.Left_Num = random.nextInt(101);
			/*�ٸ��ݼ����� Result �� 0~100 ��Χ�ڣ������Ҳ����� Right_Num*/
			int RS;
			do {
				this.Right_Num = random.nextInt(101);
				if(this.Operator == '+') {
					RS = this.Left_Num + this.Right_Num;
				}
				else RS = this.Left_Num - this.Right_Num;
			}while(RS > 100 || RS < 0);
			
			/*Step3����¼������ Result*/
			this.Result = RS;
		}
	}
	
	/*Step4����������ʽ*/
		//��������ʽ
	@Override
	public String toString(){
		return (this.Left_Num + " " + this.Operator + " " + this.Right_Num + " = ");
	}
		//��������ʽ + ��
	public String toStringWithResult() {
		return (this.Left_Num + " " + this.Operator + " " + this.Right_Num + " = " + this.Result);
	}
}
