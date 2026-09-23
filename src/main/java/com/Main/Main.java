package com.Main;


import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.VehicalRegistration;
import com.repository.Repository;

public class Main {
	
	public static Session session;
	public static void main(String[] args) {
		
		Repository repo = new Repository();
		Configuration confi = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFac =  confi.buildSessionFactory();
		 session =  sessionFac.openSession();
		 VehicalRegistration vehical = new VehicalRegistration(null,"baik","model15","white",15,LocalDate.now(),"8767183661");
		
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Enter your What Method Call : \n1 Save data  \n2 get Data \n3 update data \n4 dalete data");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				repo.saveDate(vehical);
				break;
			case 2:
				System.out.println("Enter your ID: ");
				int id = sc.nextInt();
				repo.getId(id);
				break;
				
			case 3:
				System.out.println("Enter your ID: ");
				int ID = sc.nextInt();
				repo.upDate(ID);
				break;
			case 4:
				System.out.println("Enter your ID: ");
				int Id = sc.nextInt();
				repo.delete(Id);
				break;
			case 5:
				System.out.println("Program Exist....");
				sc.close();
				session.close();
				sessionFac.close();
				return;
				default:
					System.out.println("Invalid Number Enter Correct Number: ");
			}
				
		}
		
		
	}

}
