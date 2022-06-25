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
			objOutput.writeObject(obj);// lança objeto para a memória

			objOutput.flush();// manipulação no Stream e ela passe a valer método flush
			fileOutput.flush();// confirmando no fileOutput a operação

			objOutput.close();// fecha os canais de comunicação
			fileOutput.close();

			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public static Object recuperarObjeto(String caminho) {

		return null;
	}

}
