package ndhiep.demoIOC.entities;

public class Subject {
	private String nameSubject;
	private double score;
	public Subject(String nameSubject, double score) {
		super();
		this.nameSubject = nameSubject;
		this.score = score;
	}
	
	public Subject() {
	}

	public String getNameSubject() {
		return nameSubject;
	}
	public double getScore() {
		return score;
	}
	public void setNameSubject(String nameSubject) {
		this.nameSubject = nameSubject;
	}
	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Subject [nameSubject=" + nameSubject + ", score=" + score + "]\t";
	}
	
	
	

}
