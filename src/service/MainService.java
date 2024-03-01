package service;

import model.Professor;
import model.Student;
import model.degree;

public class MainService {

	public static void main(String[] args) {
		Professor pr1 = new Professor();
		System.out.println(pr1);
		Professor pr2 = new Professor("Karina", "Skirmante", degree.mg);
		System.out.println(pr2);
		Professor pr3 = new Professor("Estere", "Vitola", degree.mg);
		System.out.println(pr3);
		
		Student st1 = new Student();
		System.out.println(st1);
		Student st2 = new Student("Viktors", "Kokin");
		System.out.println(st2);
	}

}
