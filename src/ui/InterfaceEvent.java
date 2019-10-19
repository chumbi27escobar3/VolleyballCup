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
			showMenu();
			int option = entry.nextInt();
			String path;
//			String id; //race, lastName, date, typePetsFavorate;
			switch(option) {
			case 1:
			System.out.println("Porfavor digite la ruta absoluta en donde esta el archivo que sea cargar a la plataforma: ");
			path = entry.nextLine();
			event.archivoParticipantes(path);
				break;
			case 2:
//			
			System.out.println("Porfavor digite el identificador de el inscrito que desea buscar: ");
			String id = entry.nextLine();
			event.searchInscried(id);
//			System.out.println("nombre del dueño: ");
//			name = entry.nextLine();
//			System.out.println("apellido: ");
//			lastName = entry.nextLine();
//			System.out.println("fecha de nacimiento: ");
//			date = entry.nextLine();
//			System.out.println("tipo de mascota favorita: ");
//			typePetsFavorate = entry.nextLine();
//			Owner o = new Owner(id, name, lastName, date, typePetsFavorate);
//			clubPets.get(0).addOwner(o);
////			int id, String name, String lastName, String date, String typePetsFavorate
//			
				break;
			case 3:
//		
//			System.out.println("Porfavor digite los datos siguientes: ");
//			System.out.println("numero de identificacion: ");
//			id = entry.nextInt();
//			System.out.println("nombre del la mascota: ");
//			name = entry.nextLine();
//			System.out.println("fecha de nacimiento: ");
//			date = entry.nextLine();
//			System.out.println("genero: ");
//			gender = entry.next().charAt(0);
//		    System.out.println("raza: ");
//			race = entry.nextLine();
//			Pet u = new Pet(id, name, date, gender, race);
//			if(clubPets.get(0).owner.get(0).addPet(u,name) == true) {
//				System.out.println("Se pudo agregar la mascota correctamente");
//			} else {
//				System.out.println("No se pudo agregar la mascota correctamente");
//			}
////			int id, String name, String date, char gender, String race
//			
				break;
			case 4:
//			
//			System.out.println("digite por favor el nombre del club que desea eliminar: ");
//			name = entry.nextLine();
//			removeClub(name);
//			
				break;
			case 5:
//			
//			System.out.println("digite por favor el nombre del dueño que desea eliminar: ");
//			name = entry.nextLine();
////			removeOwner(name);
//			
				break;
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
