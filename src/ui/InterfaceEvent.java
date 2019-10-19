package ui;
import java.util.Scanner;

import model.*;

public class InterfaceEvent {
	
	private Event event;

	private Scanner entry;
	
	public InterfaceEvent() {
		entry =new Scanner(System.in);
		
		event = new Event("");
		
	}
		
	public void showSelection() {
			
			boolean oe = false;
			
		while(!oe) {	
			showMenu();
			String option = entry.nextLine();
			switch(Integer.parseInt(option)) {
			case 1:
			System.out.println("Porfavor digite la ruta absoluta en donde esta el archivo que sea cargar a la plataforma: ");
			String path= entry.nextLine();
			System.out.println(event.archivoParticipantes(path));
				break;
			case 2:
			System.out.println("Porfavor digite el identificador de el inscrito que desea buscar: ");
			String id = entry.nextLine();
			System.out.println(event.searchInscried(id));
				break;
			case 3:
			System.out.println("Porfavor digite el identificador del asistente al evento: ");
			String ide = entry.nextLine();
			System.out.println(event.searchAtt(ide));
				break;
			case 4:
			System.out.println("digite el pais que desea buscar:");
			String country = entry.nextLine();
			System.out.println("digite por favor en que estructura desea imprimir: ");
			System.out.println("1.en ArbolABB");
			System.out.println("2.en lista doeblemente enlazada");
			String n = entry.nextLine();
			int a = Integer.parseInt(n);
				if(a == 1) {
					System.out.println(event.printTree(country));
				}else if (a == 2){
					System.out.println(event.printList(country));
				} else {
					System.out.println("digite porfavor entre 1 y 2");
				}

				break;
			case 5:	
			System.out.println("chao :'(");
			oe = true;
				break;
			}
		}
	}
	public static void showMenu() {
		
		System.out.println("-----------Bienvenido al evento de Voleibol --------");
	    System.out.println("Por favor seleccione la opcion que desea:");
	    System.out.println("1. Cargar los datos.");
	    System.out.println("2. Buscar un inscrito al evento.");
		System.out.println("3. Buscar un asistente al evento.");
		System.out.println("4. Imprimir estructura por la cuidad deseada.");
		System.out.println("5. Salir.");
					
	}
	
}
