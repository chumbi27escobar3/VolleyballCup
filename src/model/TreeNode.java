package model;

public class TreeNode {
	
	private TreeNode left;
	private TreeNode right;
	
	
	private Participant participant;


	public TreeNode(Participant participant) {
		this.participant = participant;
	}

	

	public TreeNode getLeft() {
		return left;
	}



	public void setLeft(TreeNode left) {
		this.left = left;
	}



	public TreeNode getRight() {
		return right;
	}



	public void setRight(TreeNode right) {
		this.right = right;
	}



	public Participant getParticipant() {
		return participant;
	}



	public void setParticipant(Participant participant) {
		this.participant = participant;
	}



	public void addAbbIn(TreeNode a) {
		
		if (participant.getId().compareToIgnoreCase(a.getParticipant().getId()) > 0) {
			if (left == null) {
				left = a;
			} else {
				left.addAbbIn(a);
			}
		} else if (participant.getId().compareToIgnoreCase(a.getParticipant().getId()) < 0) {
			if (right == null) {
				right = a;
			} else {
				right.addAbbIn(a);
			}
		
		}
	
	}
	
	public Participant searchParticipante(String id) {
		Participant e = null;
//		while () {
//			
//			
//		}
		return e;
	}



	public Participant searchInscried(String id) {
		Participant e = null;
		if (participant.getId().equals(id)) {
			e = participant;
		} else {
			if (participant.getId().compareToIgnoreCase(id) > 0) {
				if (left != null) {
				e = left.searchInscried(id);
				}
			} else {
				if (right != null) {
					e = right.searchInscried(id);
				}
			}
		}
		return e;
	}



	public void searchTree(TreeNode root, String country) {
		if (participant.getCountry().equals(country)) {
			root.addAbbIn(new TreeNode(participant));
		}		
		if (left != null) {
			left.searchTree(root, country);
		}
		if (right != null) {
			right.searchTree(root, country);
		}
	}



	public String printree(String pre) {
		String msg = pre;
		msg += participant + "\n";
		if (left != null) {
			msg += left.printree(pre + "L  ");
		}
		if (right != null) {
			msg += right.printree(pre + "R  ");
		}
		return msg;
	}
	
	
}
