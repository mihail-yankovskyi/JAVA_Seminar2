package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.Course;
import model.Grade;
import model.Professor;
import model.Student;
import model.degree;

public class MainService {
	
	private static ArrayList<Professor> allProfessors = new ArrayList<Professor>();
	private static ArrayList<Student> allStudents = new ArrayList<Student>();
	private static ArrayList<Course> allCourses= new ArrayList<Course>();
	private static ArrayList<Grade> allGrades = new ArrayList<Grade>();

	public static void main(String[] args) {
		Professor pr1 = new Professor();//John Big - default Professor
		allProfessors.add(pr1);
		Professor pr2 = new Professor("Karina", "Skirmante", degree.mg);
		allProfessors.add(pr2);
		Professor pr3 = new Professor("Estere", "Vitola", degree.mg);
		allProfessors.add(pr3);
		Professor pr4 = new Professor("Marcis", "Naktins", degree.mg);
		allProfessors.add(pr4);
		
		for(int i = 0; i < allProfessors.size(); i++) {
			System.out.println(allProfessors.get(i));
		}
		
		for(Professor tempPr: allProfessors) {
			System.out.println(tempPr);
		}
		
		Student st1 = new Student();//Lara Bernardes student
		allStudents.add(st1);
		Student st2 = new Student("Viktors", "Kokin");
		allStudents.add(st2);
		Student st3 = new Student("Davyd", "Akimov");
		allStudents.add(st3);
		
		for(Student tempSt: allStudents) {
			System.out.println(tempSt);
		}
		
		Course c1 = new Course();
		allCourses.add(c1);
		Course c2 = new Course("Data Structure", 2, pr3);
		allCourses.add(c2);
		Course c3 = new Course("Networking", 4, pr4);
		allCourses.add(c3);
		
		for(Course tempC: allCourses) {
			System.out.println(tempC);
		}
		
		Grade gr1 = new Grade();
		allGrades.add(gr1);
		Grade gr2 = new Grade(4, st3, c3);
		allGrades.add(gr2);
		Grade gr3 = new Grade(10, st3, c2);
		allGrades.add(gr3);
		Grade gr4 = new Grade(7, st2, c2);
		allGrades.add(gr4);
		Grade gr5 = new Grade(8, st3, c3);
		allGrades.add(gr5);
		
		allGrades.addAll(Arrays.asList(gr1,gr2, gr3, gr4, gr5));
		
		for(Grade tempGr: allGrades) {
			System.out.println(tempGr);
		}
		
		try
		{
			System.out.println(st2.getName() + " " + st2.getSurname() + " -> "
				+calculateAVGForStudent(st2));
		
			System.out.println(st3.getName() + " " + st3.getSurname() + " -> "
				+calculateAVGForStudent(st3));
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}
	public static float calculateAVGForStudent(Student inputStudent) throws Exception {
		if(inputStudent == null) throw new Exception("Problems with input");
		
		float sum = 0;
		int howMany = 0;
		
		for(Grade tempGr : allGrades) {
			if(tempGr.getStudent().equals(inputStudent)) {
				sum = sum + tempGr.getValue();
				howMany++;
			}
		};
		return sum/howMany;
	}
	
	public static int calculateHowManyCoursesbyProfessor(Professor inputProfessor) throws Exception {
		if(inputProfessor == null) throw new Exception("Problems with input");
		
		int howMany = 0;
		
		
		for(Course tempCr : allCourses) {
			if(tempCr.getProfessor().equals(inputProfessor)) {
				howMany++;
			}
		}
		
		return howMany;
	}
	
	public static void sortStudents() throws Exception {
		
		
		for(int i = 0; i < allStudents.size(); i++) {
			for(int j = 0; j < allStudents.size(); j++) {
				
				Student tempI = allStudents.get(i);
				Student tempJ = allStudents.get(j);
				if(calculateAVGForStudent(tempJ) < calculateAVGForStudent(tempI)) {
					Student temp  =  allStudents.get(i);
					allStudents.set(i, allStudents.get(j));
					allStudents.set(j, temp);
				}
				
				
			}
		}
	}
	
	
	
	//TODO
	//calculates how many professors have phd as degree
	//calculates how many grades are smaller than 4 in specific course
	//calculates how many CP professor need to lead

}
