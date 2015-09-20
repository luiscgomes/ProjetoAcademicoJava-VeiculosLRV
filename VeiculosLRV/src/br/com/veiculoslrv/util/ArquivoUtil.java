package br.com.veiculoslrv.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.com.veiculoslrv.veiculos.Veiculo;

public class ArquivoUtil {
	// Salva uma lista de objetos de um arquivo de texto
	public static void salvaDados(String nomeArquivo, List<Veiculo> veiculos) {
		ObjectOutputStream objectOutputStream = null;
		try {
			objectOutputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivo));

			objectOutputStream.writeObject(veiculos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (objectOutputStream != null) {
					objectOutputStream.flush();
					objectOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// Recupera um lista de objetos de um arquivo de texto
	public static List<Veiculo> recuperaDados(String nomeArquivo) {
		ObjectInputStream objectInputStream = null;

		List<Veiculo> veiculos = new ArrayList<Veiculo>();

		try {
			objectInputStream = new ObjectInputStream(new FileInputStream(nomeArquivo));

			try {
				List<Veiculo> readObject = (List<Veiculo>) objectInputStream.readObject();
				veiculos = readObject;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (objectInputStream != null) {
					objectInputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return veiculos;
	}
}
