package software_construction_OOP_version_1_1;

import java.util.*;

public class Excise_System_Main_Version_1_1 {
	private static int problem_Kind = 0;
	private static int problem_Num = 0;
	private static char ch;
	private static int ColNum = 0;
	private static Scanner cin = new Scanner(System.in);
	
	private static void display_header_1() {
		System.out.println("*********************���������ɵ�����ʽ******************************");
	}
	private static void display_header_2() {
		System.out.println("           --------------����������ʽ�Ĵ�--------------");
	}
	private static void normal_display(Binary_Operation_Version_1_1[] BO_array,int EndI,int colNum) {
		display_header_1();
		/*���������ɵ�����ʽ*/
		for(int i = 0;i < EndI;i ++) {
			System.out.print((i+1) + ": " + BO_array[i].toString() + "\t");
			if((i+1) % colNum == 0) {
				System.out.println();
			}
		}
		System.out.println();
		
		display_header_2();
		/*��ʾ��*/
		for(int i = 0;i < EndI;i ++) {
			System.out.print((i+1) + ": " + BO_array[i].getResult() + "\t");
			if((i+1) % colNum == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	/*�����ĸ�ʽ����ʾ��һ����ʾ5��*/
	public static void format_display(Binary_Operation_Version_1_1[] BO_array,int EndI) {
		normal_display(BO_array, EndI, 5);
	}
	
	/*�����û����󣬸���ÿ�е�����*/
	public static void format_display(Binary_Operation_Version_1_1[] BO_array,int EndI,int colNum) {
		normal_display(BO_array, EndI, colNum);
	}
	
	/*�û��������*/
	public static void interface_of_problems(int flag) {
		System.out.println("����������Ҫ����Ŀ����");
		problem_Num = cin.nextInt();
		
		if(problem_Num <= 0) {
			System.out.println("���������벻Ҫ����0 ���� ������");
		}else {
			Excise_Version_1_1 excises = new Excise_Version_1_1();
			System.out.println("����Ҫ�����趨����ʽ��ʾ��ʽ�����������Ҫ������Ϊ����һ������ʾ5�У�Y/N��");
			ch = cin.next().charAt(0);
			if(ch == 'Y' || ch == 'y') {
				System.out.println("����Ҫ��һ������ʾ���У�");
				ColNum = cin.nextInt();
				//flag == 1����ȡ�ӷ�����ʽ������ʾÿ��ColNum��
				if(flag == 1) {
					format_display(excises.getAddOperations(problem_Num), problem_Num,ColNum);
				}
				//flag == 2����ȡ��������ʽ������ʾÿ��ColNum��
				else if(flag == 2) {
					format_display(excises.getSubOperations(problem_Num), problem_Num,ColNum);
				}
				//flag == 3����ȡ�Ӽ����������ʽ������ʾÿ��ColNum��
				else {
					format_display(excises.getSomeNumProblems(problem_Num), problem_Num,ColNum);
				}
			}else if(ch == 'N' || ch == 'n'){
				//flag == 1����ȡ�ӷ�����ʽ������ʾÿ��5��
				if(flag == 1) {
					format_display(excises.getAddOperations(problem_Num), problem_Num);
				}
				//flag == 2����ȡ��������ʽ������ʾÿ��5��
				else if(flag == 2) {
					format_display(excises.getSubOperations(problem_Num), problem_Num);
				}
				//flag == 3����ȡ�Ӽ����������ʽ������ʾÿ��5��
				else {
					format_display(excises.getSomeNumProblems(problem_Num), problem_Num);
				}
			}else {
				System.out.println("�����ʽ�������������룡");
			}
	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Addition_Operation addOp = new Addition_Operation();
//		System.out.println(addOp + " " + addOp.getResult());
//		
//		SubstractOperation subOp = new SubstractOperation();
//		System.out.println(subOp + " " + subOp.getResult());
		System.out.println("��ѡ����Ҫ������ʽ����\n1--�ӷ�����ʽ\n2--������ʽʽ\n3--�Ӽ����������ʽ\n�����룺");
		problem_Kind = cin.nextInt();
		if(problem_Kind == 1) {
			interface_of_problems(1);
		}else if(problem_Kind == 2) {
			interface_of_problems(2);
		}else if(problem_Kind == 3) {
			interface_of_problems(3);
		}else {
			System.out.println("������������������!");
		}
	}
}
