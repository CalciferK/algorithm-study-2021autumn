package w6_boj1406;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class ha1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//�� ���ڿ��� ���̰� N�̰�, ���� �ҹ��ڷθ� �̷���� ������, ���̴� 100,000�� ���� �ʴ´�
		String str = br.readLine();
		
		//�Է��� ��ɾ��� ������ ��Ÿ���� ���� M(1 �� M �� 500,000)
		int M = Integer.parseInt(br.readLine());
		
		Stack<String> leftSt = new Stack<String>();
		Stack<String> rightSt = new Stack<String>();
		
		//ó�� Ŀ���� ������ �� �ڿ��� �����ϱ� ������ ���� ���ÿ� �ʱ� ���ڸ� ��� �־��� (ex. abc|)
		String[] arr = str.split("");
		for(String s : arr) 
			leftSt.push(s); 
		
		for(int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String c = st.nextToken();
				
			switch(c) {
				case "L":
					if(!leftSt.isEmpty())
						rightSt.push(leftSt.pop());
					break;
				case "D":
					if(!rightSt.isEmpty())
						leftSt.push(rightSt.pop());
					break;
				case "B":
					if(!leftSt.isEmpty()) {
						leftSt.pop();
					}
					break;
				case "P":
					leftSt.push(st.nextToken());
					break;
				default:
					break;
				}
			}		
				

		//Stack�� LIFO �����̱� ������
		//���� ���ÿ� �ִ� �����͵��� ��� ���������� �ű� �ڿ� �����ʿ� �ִ� ��� ������ ����Ѵ�.
		while(!leftSt.isEmpty())
			rightSt.push(leftSt.pop());
				
		while(!rightSt.isEmpty())
				bw.write(rightSt.pop());
				
		bw.flush();
		bw.close(); 
	}
}
		
		
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		//M���� �ٿ� ���� �Է��� ��ɾ ������� �־�����
//		for(int i=0; i<M; i++) {
//			String command = st.nextToken();
//			
//			switch(command) {
//			
//				case "L":
//					break;
//				
//					
//				case "D":
//					break;
//				
//					
//				case "B":
//					break;
//				
//					
//				case "P":
//					str += st.nextToken();
//					break;
//				
//			}
//			String s = st.nextToken();
			
			
		
