package Project_of_software_construction;

import java.util.Random;

public class My_math_problem {
	static int[] Problem_array = new int[101]; // ��¼���ɵ�100����
	static int Problem_array_id = 1;
	static char[] ch_array = new char[51];     //��¼ÿ����ʽ�ķ���
	static int ch_array_id = 1;

	//����Ƿ������ͬ������ʽ
	public static boolean Check(int a,int b,char str,int ProblemEndId) {
		for(int i = 1;i <= ProblemEndId;i += 2) {
			if((a == Problem_array[i]) && (b == Problem_array[i+1]) && (str == ch_array[(i+1)/2])) {
				return false;
			}
		}
		return true;
	}
	
	// ����50����Ŀ
	public static void RandomArithmetic() {
		System.out.println("������������ɵ�50���Ӽ��������⣺");
		Random random = new Random();
		int problem_num = 1; // �������������Ŀ
		int x1, x2; // a,b����������ֵ
		int k = 0; // k������־������ɵ� "+" �� "-"��0���� "-" ��1���� "+"
		char ch; // ��¼�����

		// ������ĿС��50,��������
		while (problem_num <= 50) {

			k = random.nextInt(2); // ������������������
			if (k == 1) {
				ch = '+';
			} else
				ch = '-';
			
			ch_array[ch_array_id++] = ch;
			
			// ��ʼ��������ʽ
			while (true) {
				x1 = random.nextInt(101);
				x2 = random.nextInt(101);
				
				//������ɵ�����ʽ�Ƿ��Ѿ����ֹ�
				if(Check(x1, x2, ch, Problem_array_id-1)) {
					
				}
				else {
					continue;
				}
				
				if (ch == '+') {
					if (x1 + x2 <= 100) {
						System.out.print(problem_num + ":" + x1 + " + " + x2 + " = " + "\t");
						Problem_array[Problem_array_id++] = x1;
						Problem_array[Problem_array_id++] = x2;
						break;
					}
				} else {
					if (x1 - x2 >= 0) {
						System.out.print(problem_num + ":" + x1 + " - " + x2 + " = " + "\t");
						Problem_array[Problem_array_id++] = x1;
						Problem_array[Problem_array_id++] = x2;
						break;
					}
				}
			}
			if(problem_num % 5 == 0) {
				System.out.println();
			}
			problem_num++;
		}
}

	//�����
	public static void printAnswer() {
		System.out.println("��50��������Ĵ��ǣ�");
		for(int i=1,j=1;i <= 50 ;i++) {
			if(ch_array[i] == '+') {
				System.out.print(i + ":" + (Problem_array[j++] + Problem_array[j++]) + "\t");
			}
			else System.out.print(i + ":" + (Problem_array[j++] - Problem_array[j++]) + "\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {

		RandomArithmetic();
		printAnswer();
	}
}
