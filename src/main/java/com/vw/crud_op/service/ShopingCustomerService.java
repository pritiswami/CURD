package com.vw.crud_op.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vw.crud_op.dao.CustomerRepository;
import com.vw.crud_op.dto.ShopingCustomer;

@Service
public class ShopingCustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	// save method
	public ShopingCustomer saveCustInfo(ShopingCustomer shopingCustomer) {

		return customerRepository.
	}

	// save List of Info
	public List<ShopingCustomer> insertListOfInfo(List<ShopingCustomer> shopingCustomers) {

		return customerRepository.saveAll(shopingCustomers);
	}

	// get single customer info
	public ShopingCustomer retrieveCustInfoID(int customerId) {

		Optional<ShopingCustomer> retrieveInfo = customerRepository.findById(customerId);

		if (retrieveInfo.isPresent()) {
			ShopingCustomer getInfo = retrieveInfo.get();
			System.out.println(getInfo);
			return getInfo;
		} else {
			System.out.println("Wrong id");
		}
		return null;
	}

	// get info by multiple ids
	public void getByIDS(List<Integer> customerId) {
		Iterable<ShopingCustomer> findByIDS = customerRepository.findAllById(customerId);
		System.out.println("info for multiple ID's >>  " + findByIDS);
	}

	// Get List of Data :: Find All
	public void retrieveListOfData() {

		Iterable<ShopingCustomer> getAllData = customerRepository.findAll();

		for (ShopingCustomer sc : getAllData) {
			System.out.println("Get List of Info::" + sc);
		}

		// by consumer
		Consumer<ShopingCustomer> obj = (sc) -> System.out.println("by consumer >>" + sc); // Test t = (int d) ->
																							// Sysout()
		getAllData.forEach(obj);

		// by Lambada
		getAllData.forEach(ab -> System.out.println("Get by lambad >>>>" + ab));

		// By Stream Object
		Stream<ShopingCustomer> allDataStream = ((Collection<ShopingCustomer>) getAllData).stream();
		Stream<ShopingCustomer> allDataStream1 = ((Collection<ShopingCustomer>) getAllData).stream();

		allDataStream.map(n -> n.getCustomerEmail()).forEach(m -> System.out.println("Stream  forEach   :" + m));
		// or
		List<String> collectData = allDataStream1.map(s -> s.getCustomerName()).collect(Collectors.toList());
		System.out.println("by Stram & Collect method ::" + collectData);
	}

	
	// delete record by single entity (object)
	public String deleteByEntity(ShopingCustomer shopingCustomer) {
		customerRepository.delete(shopingCustomer);
		return "deleted by entity******************";
	}
	
	//delete record by Multiple Entity(multile object)
		public String deletebyMultiEntities(Iterable<ShopingCustomer> shopingCustomer) {
			customerRepository.deleteAll(shopingCustomer);
			return "deleted Multiple Entities$$$$$$$$$$$$$$$";
		}

	// delete ALL method
	public String deleteALL() {
		customerRepository.deleteAll();
		return "deleted ALL$$$$$$$$$$$$$$$";
	}
	
	//delete by Single ID
	public String deleteById(int customerId) {
		customerRepository.deleteById(customerId);
		return "delete by single id";
	}
	
	//delete by many ids
	public String deleteAllById(List<Integer> customerId) {
		customerRepository.deleteAllById(customerId);
		return "delete by Many IDS";
	}
	
	
	

}
