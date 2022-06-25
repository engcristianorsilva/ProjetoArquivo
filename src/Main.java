import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String caminho = "arquivo.txt";

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(1, "Cristiano", 49));
		pessoas.add(new Pessoa(2, "Davi", 6));
		pessoas.add(new Pessoa(3, "Paula", 17));

		// boolean gravou = FileUtil.gravarObjeto(p1, caminho); // foi ou não gravado
		boolean gravou = FileUtil.gravarObjeto(pessoas, caminho);

		// Object obj = FileUtil.recuperarObjeto(caminho);

		List<Pessoa> obj = (List<Pessoa>) FileUtil.recuperarObjeto(caminho);

		for (Pessoa pessoa : obj) {
			System.out.println(pessoa);

		}

	}

}
