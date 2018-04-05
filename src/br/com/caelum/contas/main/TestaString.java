package br.com.caelum.contas.main;

public class TestaString {
	public static void main(String[] args) {
		String s = "fj11";
		System.out.println(s.replace("1", "2"));
		System.out.println(s);
		
		int n = s.length();
		
		for (int i = 0; i < n;i++){
			System.out.println(s.charAt(i));
		}
		
		for (int i = (n-1); i >= 0;i--){
			System.out.println(s.charAt(i));
		}
		
	}

}
