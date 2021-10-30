package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class numFind_1920 {  // Main

	public static int[] array; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // �� ���ڰ��� �Է� (array�� � ���� ������)
		array = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // ���� �������� ���ڱ���
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		// �迭�����ϱ�
		Arrays.sort(array);
		
		// ���� ã�ƾ� �� Ƚ�� �Է¹ޱ�, ���۾��� ���İ��� �ܿ��
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		// StringBuilder�� append() : ���ڿ����ϱ�, ����ϰ� �� ���ڿ����� ���Ҷ� �ַ� ���
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			// ã���� �ϴ� ���� ���� ��� 1, ���� ��� 0�� ����ؾ��Ѵ�.
			if(binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append('\n');
			}
			else {
				sb.append(0).append('\n');
			}
		}
		System.out.println(sb);
		
	}
	
	
	/**
	 * @param key ã������ ��
	 * @return key�� ��ġ�ϴ� �迭�� �ε���
	 */
	
	public static int binarySearch(int key) {
 
		int left = 0;					// Ž�� ������ ���� �� �ε���
		int right = array.length - 1;	// Ž�� ������ ������ �� �ε���
 
		// left�� right���� Ŀ���� ������ �ݺ��Ѵ�.
		while(left <= right) {
 
			int mid = (left + right) / 2;	// �߰���ġ�� ���Ѵ�.
 
			// key���� �߰� ��ġ�� ������ ���� ���
			if(key < array[mid]) {
				right = mid - 1;
			}
			// key���� �߰� ��ġ�� ������ Ŭ ���
			else if(key > array[mid]) {
				left = mid + 1;
			}
			// key���� �߰� ��ġ�� ���� ���� ���
			else {
				return mid;
			}
		}
 
		// ã���� �ϴ� ���� �������� ���� ���
		return -1;

	}

}
