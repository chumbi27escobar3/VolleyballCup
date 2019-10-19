package model;

import java.io.*;
import java.util.Date;

public class Event {

	private ListNode firstAttendant;
	private TreeNode firstInscribed;
	
	private String name;

	public Event(String name) {
		this.name = name;
	}

//	public static void main(String[] args) {
//		Event m = new Event("camilo");			//C:\Users\Camilo Escobar A\Documents\VolleyballCup\data
//		m.archivoParticipantes("C:\\Users\\Camilo Escobar A\\Documents\\VolleyballCup\\data\\ExportCSVs.csv");
//		System.out.println("R");
//		System.out.println(m.searchAtt("1"));
//		System.out.println(m.searchInscried("56"));
//		System.out.println(m.printList("Peru"));
//		System.out.println(m.printTree("Peru"));
//	
//	}

	public String archivoParticipantes(String path) {
		String msg = "no se cargaron los datos puede que te equivocaste en la ruta";
		try { 
			FileReader readAa = new FileReader(path);
			BufferedReader readBb = new BufferedReader(readAa);
			String a = readBb.readLine();

			while (a != null) {
				String[] e = a.split(",");
				String id = e[0];
				String name = e[1];
				String lastName = e[2];
				String email = e[3];
				String gender = e[4];
				String country = e[5];
				String birthday = e[6];
				Participant r = new Participant(id, name, lastName,email, gender, country, birthday);	
				addAbbInscribed(r);
				a = readBb.readLine();	
			}
			readBb.close();
			msg = "fueron cargados los datos correctamente";
			addRandom(firstInscribed);
			readAa.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return msg;
	}

	public void addAbbInscribed(Participant e) {
		TreeNode a = new TreeNode(e);
		if (firstInscribed == null) {
			firstInscribed = a;
		} else {
			firstInscribed.addAbbIn(a);
		}
	}

	public void addListAttendant(Participant e) {
		ListNode a = new ListNode(e);
		if (firstAttendant == null) {
			firstAttendant = a;
		} else {
			firstAttendant.addList(a);
		}
	}

	public void addRandom(TreeNode a) {
		if (a != null) {
			if (Math.random() < 0.5) {
				addListAttendant(a.getParticipant());
			}
			addRandom(a.getLeft());
			addRandom(a.getRight());
		}
	}

	public String searchAtt(String id) {
		String msg = " ";
		Participant e = null;
		if (firstAttendant != null) {
			e = firstAttendant.searchAttendant(id);
		}
		if (e == null) {
			msg = "el asistente no se a encontrado";
		} else {
			msg = "el asistente que deseaba buscar es: " + e;
		}

		return msg;
	}

	public String searchInscried(String id) {
		String msg = " ";
		Participant e = null;
		if (firstInscribed != null) {
			e = firstInscribed.searchInscried(id);
		}
		if (e == null) {
			msg = "el personaje no esta inscrito";
		} else {
			msg = "el inscrito que estaba buscando es: " + e;
		}
		return msg;
	}
	
	public String printTree(String country) {
		String msg = country + "\n" ;
		TreeNode countryInscribed = new TreeNode(new Participant("", "", "", "", "", "", ""));
		if (firstInscribed != null) {
			firstInscribed.searchTree(countryInscribed, country);
		}
		if (countryInscribed.getLeft() != null) {
			msg += countryInscribed.getLeft().printree("  ");
		}
		if (countryInscribed.getRight() != null) {
			msg += countryInscribed.getRight().printree("  ");
		}
		
		return msg;
	}
	
	public String printList(String country) {
		String msg = country + "\n" ;
		if (firstAttendant != null) {
			msg += firstAttendant.searchList(country);
		}		
		return msg;
	}

}
