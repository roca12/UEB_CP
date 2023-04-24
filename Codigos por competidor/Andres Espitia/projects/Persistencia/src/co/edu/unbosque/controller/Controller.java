package co.edu.unbosque.controller;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.unbosque.model.PersonDAO;
import co.edu.unbosque.model.PersonDTO;
import co.edu.unbosque.model.SecondSemesterStudentDTO;

public class Controller {
	public static void main(String[] args) {
		PersonDAO p = new PersonDAO();
		SecondSemesterStudentDTO sss = new SecondSemesterStudentDTO();
		p.loadData();
		ArrayList<PersonDTO> list = p.getList();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(p.getList().get(i).getName()+"\n"+
								p.getList().get(i).getAge()+"\n"+
								p.getList().get(i).getFood()+"\n"+
								p.getList().get(i).getColor()+"\n");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre: ");
		String name = sc.nextLine();
		System.out.println("Edad: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Comida: ");
		String food = sc.nextLine();
		System.out.println("Color: ");
		String color = sc.nextLine();
		p.createPerson(name, age, food, color);
		
		
		System.out.println("Nombre: ");
		String names = sc.nextLine();
		System.out.println("Edad: ");
		int ages = sc.nextInt();
		sc.nextLine();
		System.out.println("Comida: ");
		String foods = sc.nextLine();
		System.out.println("Color: ");
		String colors = sc.nextLine();
		int loses = sc.nextInt();
		sc.nextLine();
		
		sss.
	}
}
