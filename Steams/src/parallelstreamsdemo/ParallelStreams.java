package parallelstreamsdemo;

import java.util.Arrays;
import java.util.List;

class Student {
	
	String name ;
	
	int score ;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}

public class ParallelStreams {

	public static void main(String[] args) {
		
		List<Student> starks = Arrays.asList(
				new Student("Jon",99),
				new Student("Arya",100),
				new Student("Sansa",98),
				new Student("Bran",89),
				new Student("Rikon",82),
				new Student("Rob",90)
         		);
		
		starks.stream()
		.filter(person->person.getScore()>90)
		.forEach(person->System.out.println(person.getName()+" "+person.getScore()));
	
	
	
		starks.parallelStream()
		.filter(person->person.getScore()>90)
		.forEach(person->System.out.println(person.getName()+" "+person.getScore()));
	
	}

}
