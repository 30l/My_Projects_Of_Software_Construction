package software_construction_OOP;

public class Excise {
	private int Max_Index = 50;
	private Binary_Operation[] operation_array = new Binary_Operation[Max_Index];
	
	/*������ʽ�����������ʽ*/
	public void setOperations() {
		for(int i = 0;i < 50 ;i++) {
			do {
				operation_array[i] = new Binary_Operation();
			}while(checkIfSame(i, operation_array[i]));
		}
	}
	
	/*����Ƿ������ͬ������ʽ*/
	private boolean checkIfSame(int EndI,Binary_Operation Now_Operation) {
		for(int i = 0;i < EndI;i ++) {
			if(operation_array[i].getLeft_num() == Now_Operation.getLeft_num() && operation_array[i].getOperator() == Now_Operation.getOperator() && operation_array[i].getRight_num() == Now_Operation.getRight_num()) {
				return true;
			}
		}
		return false;
	}
	
	/*����50������ʽ*/
	public void getOperations() {
		System.out.println("****************************�����Ǹ�����50������ʽ*******************************");
		for(int i = 0;i < Max_Index;i ++) {
			System.out.print((i+1) + ": " + operation_array[i].toString() + "\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
	}
	
	/*��������ʽ�Ĵ�*/
	public void getAnswers() {
		System.out.println("                -----------------�����Ǵ�---------------------");
		for(int i = 0;i < Max_Index;i ++) {
			System.out.print((i+1) + ": " + operation_array[i].getResult() + "\t");
			if((i+1) % 5 == 0) {
				System.out.println();
			}
		}
	}
}
