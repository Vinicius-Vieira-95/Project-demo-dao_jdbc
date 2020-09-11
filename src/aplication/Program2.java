package aplication;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentdDao;
import model.entities.Department;

public class Program2 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentdDao departmentDao = new DaoFactory().creatDepartmentDao();
		
		System.out.println("======== Teste 1 FindById Dp ========");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		
		
		
		
		sc.close();
	}

}
