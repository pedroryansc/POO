import java.util.Scanner;

import java.net.InetAddress;

public class Ping {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		try {
			if(!(InetAddress.getByName("192.168.130.170").isReachable(5000))) {
				System.out.println("Erro");
			}		
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Erro no Try");
		}
		
		entrada.close();
	}
}
