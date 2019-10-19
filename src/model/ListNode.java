package model;

public class ListNode {
	
	private ListNode next;
	private ListNode prev;

	private Participant participant;
	
	public ListNode(Participant participant) {
		this.participant = participant;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	public ListNode getPrev() {
		return prev;
	}

	public void setPrev(ListNode prev) {
		this.prev = prev;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public void addList(ListNode a) {
		if (next == null) {
			next = a;
			a.setPrev(this);
		} else {
			next.addList(a);
		}
	}
	
	public Participant searchAttendant(String id) {
		Participant t = null;
		if (participant.getId().equals(id)) {
			t = participant;
		} else {
			if (next != null) {
				t = next.searchAttendant(id);
			}
		}	
		return t;
	}

	public String searchList(String country) {
		String msg = "";
		if (participant.getCountry().contentEquals(country)) {
			msg = participant + "\n";
		} 
		if (next != null) {
			msg += next.searchList(country);
		}
		return msg;
	}
	
	
	
}
