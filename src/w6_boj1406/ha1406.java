package w6_boj1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ha1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		//�� ���ڿ��� ���̰� N�̰�, ���� �ҹ��ڷθ� �̷���� ������, ���̴� 100,000�� ���� �ʴ´�
		String str = br.readLine();
		
		//�Է��� ��ɾ��� ������ ��Ÿ���� ���� M(1 �� M �� 500,000)
		int M = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//M���� �ٿ� ���� �Է��� ��ɾ ������� �־�����
		for(int i=0; i<M; i++) {
			String command = st.nextToken();
			
			switch(command) {
			
				case "L":
					break;
				
					
				case "D":
					break;
				
					
				case "B":
					break;
				
					
				case "P":
					str += st.nextToken();
					break;
				
			}
			String s = st.nextToken();
			
			
		}
		

	}

}
