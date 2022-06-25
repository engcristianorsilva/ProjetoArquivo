
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String caminho = "arquivo.txt";

		Pessoa p1 = new Pessoa(1, "Cristiano", 49);

		boolean gravou = FileUtil.gravarObjeto(p1, caminho); // foi ou não gravado

		Object obj = FileUtil.recuperarObjeto(caminho);

		System.out.println(obj);
	}

}
