package software_construction_OOP_version_1_1;

public class SubstractOperation extends Binary_Operation_Version_1_1 {

	/*��������ʽ�Ĺ��췽������new��������ʽ����ʱ���Զ����ü̳г������Construction_Opreation����*/
	public SubstractOperation() {
		// TODO Auto-generated constructor stub
		this.Construct_Operation('-');
	}
	
	/*��д�������������������ֵ*/
	@Override
	public int calculate(int left_num, int right_num) {
		// TODO Auto-generated method stub
		return left_num - right_num;
	}

	/*���������Ƿ�Ϸ����Ϸ��򷵻�true�����Ϸ�����false*/
	@Override
	public boolean checkcalculate(int Calculate_Num) {
		// TODO Auto-generated method stub
		if(Calculate_Num < 0) {
			return false;
		}
		else return true;
	}
	
	/*��дtoString()���������ɵ�����ʽ*/
	@Override
	public String toString() {
		return (this.getLeft_num() + " " + this.getOperator() + " " + this.getRight_num() + " =");
	}
}
