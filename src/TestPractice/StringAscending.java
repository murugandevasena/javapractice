package TestPractice;

public class StringAscending {
	public static void main(String[] args) {
		String g = "I am a java developer";
		String[] g1 = g.split(" ");
		String max = g1[1];
		String temp = "";
		for (int i = 0; i < g1.length; i++) {
			for (int j = i + 1; j < g1.length; j++) {
				if (g1[i].length() > g1[j].length()) {
					temp = g1[i];
					g1[i] = g1[j];
					g1[j] = temp;
				}
			}
		}
		
		for(int y=0;y<g1.length;y++) {
			System.out.println(g1[y]);
		}
		
//		String ggg ="engineer";
//		System.out.println(ggg.charAt(0)+ggg.charAt(ggg.length()-2)+ggg.charAt(ggg.length()-1));
	} 

}
