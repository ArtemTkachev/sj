public class Unicode {
	public static void main(String[] args) {
		char[] uni16 = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int x1 = 0, x2 = 0, x3 = 2, x4 = 1;
	/*	char symb1 = uni16[x1];
		char symb2 = uni16[x2];
		char symb3 = uni16[x3];
		char symb4 = uni16[x4];
	*/
		for(int i = 33; i <= 126; i++) {
			System.out.println("\u" + uni16[x1] + uni16[x2] + uni16[x3] + uni16[x4]);
			x4++;
			if(x4 > 15) { 
				x3++;
				x4 = 0;
				if(x3 > 15) {
					x2++;
					x3 = 0;
					if(x2 > 15) {
						x1++;
						x2 = 0;
					}
				}
			}
		}
		
	}
}