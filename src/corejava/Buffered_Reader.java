package corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Buffered_Reader {

			public static void main(String[] args) throws IOException {
				System.out.println(10);
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				int a = Integer.parseInt(br.readLine());
				String name = br.readLine();
				
				System.out.println(name);
				System.out.println(a);
				
			}
}
