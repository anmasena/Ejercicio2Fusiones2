
public class Ramas {

	public static void main(String[] args) {

		int a = 1;
		int d = 5;
		System.out.println(a);
		System.out.println(d);

		int a = 1; // creado en la rama master
		int b = 2; //creado en la rama testing
		int c = 3; //creado en la rama testing en el siguiente commit

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
