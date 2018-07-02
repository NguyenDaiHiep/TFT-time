package Bai2;

public class Disciplines {
	private String nameDis;
	private int numbersOfLecture;
	private int numberOfEx;
	private Teachers teacher;

	public Disciplines(String nameDis, int numbersOfLecture, int numberOfEx, Teachers teacher) {
		this.nameDis = nameDis;
		this.numbersOfLecture = numbersOfLecture;
		this.numberOfEx = numberOfEx;
		this.teacher = teacher;
	}
	public Disciplines(){
		
	}
	

	public String getNameDis() {
		return nameDis;
	}

	public int getNumbersOfLecture() {
		return numbersOfLecture;
	}

	public int getNumberOfEx() {
		return numberOfEx;
	}

	public Teachers getTeacher() {
		return teacher;
	}

	@Override
	public String toString() {
		return "Mon " + nameDis + "\t" + "so bai giang "+"\t" + numbersOfLecture +"\t"+ "so bai tap" +"\t"+ numberOfEx +"\t"  + teacher;
	}
	

}
