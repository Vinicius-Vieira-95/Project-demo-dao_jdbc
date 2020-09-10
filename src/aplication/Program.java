package aplication;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		System.out.println("=== Teste 1 FindById =======");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println();
		System.out.println("=== Teste 2 SellerFindByDepartment =======");
		Department dep = new Department(2, null); //colocando parametro Id para resgatar dados na tabela Department com Id.
		List<Seller>list = sellerDao.findByDepartment(dep);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("=== Teste 3 SellerFindAll =======");
		list = sellerDao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		System.out.println("=== Teste 4 Seller insert =======");
		Seller newSeller = new Seller(null,"Greg","greg@Gmail.com", new Date(), 4000.0, dep);
		
		sellerDao.insert(newSeller);
		System.out.println("Insert: " + newSeller.getId());
		
		System.out.println();
		System.out.println("=== Teste 5 update =======");
		seller = sellerDao.findById(1);
		seller.setName("Marta Black");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		
		System.out.println();
		System.out.println("=== Teste 6 Delete =======");
		System.out.println("Enter id for delete test ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleted");
		
		sc.close();
	}
}
