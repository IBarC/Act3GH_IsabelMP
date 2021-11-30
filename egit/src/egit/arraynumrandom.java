package egit;

public class arraynumrandom {

	public static void main(String[] args) {
		int array[] = new int[30];
		int arraycont[] = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1);
			System.out.print("\t" + array[i]);
			arraycont[array[i]-1]=arraycont[0]+1;
		}
		for (int i = 0; i < arraycont.length; i++) {
			System.out.print("\n"+(i+1)+": "+arraycont[i]);
		}
		System.out.println("Hola caracola");
	}
}
