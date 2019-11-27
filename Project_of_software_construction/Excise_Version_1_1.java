package software_construction_OOP_version_1_1;

import java.util.Random;

public class Excise_Version_1_1 {
//	private int MAX_Num = 1000;
//	Addition_Operation[] addOP_array = new Addition_Operation[MAX_Num];
//	SubstractOperation[] subOP_array = new SubstractOperation[MAX_Num];
	
	/*����Ƿ������ͬ������ʽ��������ͬ�ķ���true��û����ͬ�ķ���false*/
	private boolean checkIfSame(Binary_Operation_Version_1_1[] BO_array,int EndI,Binary_Operation_Version_1_1 BO_Now) {
		for(int i = 0;i < EndI ;i ++) {
			if(BO_array[i].toString().equals(BO_Now)) {
				return true;
			}
		}
		return false;
	}
	
	/*����һ������num��ϰ�⣬��Ϊû��ָ������ʲô���͵�ϰ�⣬���������������ϰ�⣬�Ӽ�����������*/
	public Binary_Operation_Version_1_1[] getSomeNumProblems(int num) {
		Binary_Operation_Version_1_1[] BO_random_array = new Binary_Operation_Version_1_1[num];
		Random random = new Random();
		
		for(int i = 0;i < num;i ++) {
			/*������ɼӼ�����ʽ��0����ӷ���1�������*/
			int flag = random.nextInt(2);
			do {
				if(flag == 0) {
					BO_random_array[i] = new Addition_Operation();
				}
				else BO_random_array[i] = new SubstractOperation();
			}while(checkIfSame(BO_random_array, i, BO_random_array[i]));
		}	
		return BO_random_array;
	}
	
	/*�����ӷ�����ʽ*/
	public Binary_Operation_Version_1_1[] getAddOperations(int num) {
		Addition_Operation[] ADD_random_array = new Addition_Operation[num];
		for(int i = 0;i < num ;i ++) {
			do {
				ADD_random_array[i] = new Addition_Operation();
			}while(checkIfSame(ADD_random_array, i, ADD_random_array[i]));
		}
		return ADD_random_array;
	}
	
	/*������������ʽ*/
	public Binary_Operation_Version_1_1[] getSubOperations(int num) {
		SubstractOperation[] SUB_random_array = new SubstractOperation[num];
		for(int i = 0;i < num ;i ++) {
			do {
				SUB_random_array[i] = new SubstractOperation();
			}while(checkIfSame(SUB_random_array, i, SUB_random_array[i]));
		}
		return SUB_random_array;
	}
}
