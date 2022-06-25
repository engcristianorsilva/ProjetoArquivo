import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileUtil {

	public static boolean gravarObjeto(Object obj, String caminho) {

		File arquivo = new File(caminho);

		if (!arquivo.exists()) {

			try {
				arquivo.createNewFile();
			} catch (Exception e) {

				e.printStackTrace();
				return false;
			}

		}

		try {
			FileOutputStream fileOutput = new FileOutputStream(arquivo);// escrever no arquivo é fluxo de saída
			ObjectOutputStream objOutput = new ObjectOutputStream(fileOutput);
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;

	}

	public static Object recuperarObjeto(String caminho) {

		return null;
	}

}
