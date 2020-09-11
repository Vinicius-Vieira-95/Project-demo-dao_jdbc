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
		
		System.out.println();
		System.out.println("======== Teste 3 Insert Dp ========");
		Department dep2 = new Department(null, "Aliment");
		departmentDao.insert(dep2);
		System.out.println("Insert Sucefully");
		
		System.out.println();
		System.out.println("======== Teste 4 Update Dp ========");
		Department dep3 = departmentDao.findById(2);
		dep3.setName("Food");
		departmentDao.update(dep3);
		System.out.println("Update Sucefully");
		
		
		
		sc.close();
	}

}
