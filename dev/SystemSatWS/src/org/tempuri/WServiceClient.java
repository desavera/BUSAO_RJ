package org.tempuri;

import java.util.*;

public class WServiceClient {


	public static void main(String[] args) {

		WService service = new WService(); 
		WServiceSoap soap = service.getWServiceSoap(); 
		ArrayOfWSLinha linhas = soap.listaLinhasCliente(3,(short)3);

		List<WSLinha> linhasList = linhas.getWSLinha();
		Iterator<WSLinha> linhasIt = linhasList.iterator();
		while (linhasIt.hasNext()) {

			System.out.println("WS OUTPUT : " + linhasIt.next().getNome());
		}




	}

}
