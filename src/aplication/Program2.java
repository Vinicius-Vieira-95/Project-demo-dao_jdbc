package aplication;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentdDao;
import model.entities.Department;

public class Program2 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentdDao departmentDao =  DaoFactory.creatDepartmentDao();
		
		System.out.println("======== Teste 1 FindById Dp ========");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println();
		System.out.println("======== Teste 2 FindAll Dp ========");
		List<Department> list = departmentDao.findAll();
		
		for(Department dp : list) {
			System.out.println(dp.toString());
		}
		
		sc.close();
	}

}
