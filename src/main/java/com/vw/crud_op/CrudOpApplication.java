package com.vw.crud_op;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vw.crud_op.dto.ShopingCustomer;
import com.vw.crud_op.service.ShopingCustomerService;

@SpringBootApplication
public class CrudOpApplication implements CommandLineRunner {

	@Autowired
	ShopingCustomerService shopingCustomerService;

	public static void main(String[] args) {
		SpringApplication.run(CrudOpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// to pass the data to entity class by setter method
		ShopingCustomer shopingCustomer = new ShopingCustomer();
		ShopingCustomer shopingCustomer1 = new ShopingCustomer();
		ShopingCustomer shopingCustomer2 = new ShopingCustomer();

		shopingCustomer.setCustomerId(1);
		shopingCustomer.setCustomerName("Priti");
		shopingCustomer.setCustomerLocation("pune");
		shopingCustomer.setCustomerEmail("nfddncdn");
		shopingCustomer.setCustomerContactNo("1253648");
		
		shopingCustomer1.setCustomerId(2);
		shopingCustomer1.setCustomerName("Daya");
		shopingCustomer1.setCustomerLocation("pune");
		shopingCustomer1.setCustomerEmail("Daya.swami@gmail.com");
		shopingCustomer1.setCustomerContactNo("1253648");
		
		shopingCustomer2.setCustomerId(3);
		shopingCustomer2.setCustomerName("mahesh");
		shopingCustomer2.setCustomerLocation("solapur");
		shopingCustomer2.setCustomerEmail("mahesh.sami@gmail.com");
		shopingCustomer2.setCustomerContactNo("1272898");
		
		
		/*List<ShopingCustomer> listCustInfo = new ArrayList<ShopingCustomer>();
		listCustInfo.add(shopingCustomer);
		listCustInfo.add(shopingCustomer1);
		listCustInfo.add(shopingCustomer2);*/
		
		//  or
		List <ShopingCustomer> listCustInfo = Arrays.asList(shopingCustomer, shopingCustomer1, shopingCustomer2);
		
		
		//============================================================================

		// save Single Data ::::calling the method present in service class
		
		/*
		 * ShopingCustomer saveInfo =
		 * shopingCustomerService.saveCustInfo(shopingCustomer);
		 * 
		 * System.out.println("Cust Info inserted into database>>>>>>>>>>>>>" +
		 * saveInfo);
		 */
		 
		 
		  // Save List of Data :::::Calling the insrtAll method from servive
			
			
			
			
			  List<ShopingCustomer> listOfData =
			  shopingCustomerService.insertListOfInfo(listCustInfo);
			  System.out.println("List of Customer Info Insert >>>>>>>>>" +listOfData);
			 
			 
			 
			 
			 
		  
		// Get info by ID : Calling the get method from service class
		/*
		 * ShopingCustomer getInfo = shopingCustomerService.retrieveCustInfoID(5);
		 * System.out.println("Get Cust Info By ID >>>>>>>>>>>>>>>>" + getInfo);
		 */

		// get list of data
		 //shopingCustomerService.retrieveListOfData();
			  
		//shopingCustomerService.getByIDS(Arrays.asList(1,2));
			  
			  // Delete by Single Entity
				/*
				 * String deleteByEnt= shopingCustomerService.deleteByEntity(shopingCustomer1);
				 * System.out.println(deleteByEnt);
				 */
		
		
		// delete by multiple Entities (0bjects)
		
		
		  
		/*
		 * String
		 * deleteByMiltEntity=shopingCustomerService.deletebyMultiEntities(Arrays.asList
		 * (shopingCustomer1, shopingCustomer2));
		 * System.out.println(deleteByMiltEntity);
		 */
		 
			  // delete by single id
		 
				/*
				 * String deletebyID=shopingCustomerService.deleteById(1);
				 * System.out.println(deletebyID);
				 */	
			// delete ALL
			/*
			 * String deleteAll= shopingCustomerService.deleteALL();
			 * System.out.println(deleteAll);
			 */
			  
			  //delete by many id's
			  
				/*
				 * String deleteByIDS= shopingCustomerService.deleteAllById(Arrays.asList(1,2));
				 * System.out.println(deleteByIDS);
				 */
		
	}

}
