package FirstCode;
public class DrawBox {
	public static void main(String[] args) {
		for(int i=1;i<4;i++) {
			box();
		}
		int i = 1; //fix condition
		while(0<i && i<4) {
			box();
			i++;
		}
	}
	public static void box() {
		System.out.println("-------");
		System.out.println("|     |");
		System.out.println("|     |");
		System.out.println("-------");
	}
}
