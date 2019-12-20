package com.ustglobal.stockmanagement.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ustglobal.stockmanagement.dto.ProductsInfo;
import com.ustglobal.stockmanagement.dto.StockResponse;
import com.ustglobal.stockmanagement.service.StockDAOServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StockController {
@Autowired
private StockDAOServiceImpl service;
@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)//this method acccept json value,spring only converts json object to javaObject.this method also has return(produces) type
public  StockResponse addProduct(@RequestBody ProductsInfo products) {
	StockResponse response = new StockResponse();
	if(service.addProduct(products)) {
		response.setStatusCode(201);
		response.setMessage("success");
		response.setDescription("Data added to the DB");
	}else {
		response.setStatusCode(201);
		response.setMessage("success");
		response.setDescription("Data added to the DB");
	}
	return response;
}
@PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)//this method acccept json value,spring only converts json object to javaObject.this method also has return(produces) type
public  StockResponse updateProduct(@RequestBody ProductsInfo products) {
	StockResponse response = new StockResponse();
	if(service.updateProduct(products)) {
		response.setStatusCode(201);
		response.setMessage("success");
		response.setDescription("Data modified in DB");
	}else {
		response.setStatusCode(401);
		response.setMessage("failure");
		response.setDescription("Data not modified in DB");
	}
	return response;
}
@GetMapping(path = "/getbyname/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
public StockResponse getProductByName(@PathVariable("name")String name) {
	StockResponse response = new StockResponse();
	ProductsInfo product=service.searchProductByName(name);
	
	if(product!=null) {
		response.setStatusCode(201);
		response.setMessage("success");
		response.setDescription("Data found in the DB");
		response.setProduct(Arrays.asList(product));
	}else {
		response.setStatusCode(401);
		response.setMessage("failure");
		response.setDescription("Data not found in the DB");
	}
	return response;
}//end of getProductByName
@GetMapping(path = "/getbycategory/{category}",produces = MediaType.APPLICATION_JSON_VALUE)
public StockResponse getProductByCategory(@PathVariable("category")String category) {
	StockResponse response = new StockResponse();
	ProductsInfo product=service.searchProductByCategory(category);
	
	if(product!=null) {
		response.setStatusCode(201);
		response.setMessage("success");
		response.setDescription("Data found in the DB");
		response.setProduct(Arrays.asList(product));
	}else {
		response.setStatusCode(401);
		response.setMessage("failure");
		response.setDescription("Data not found in the DB");
	}
	return response;
}//end of getProductByCategory
@GetMapping(path = "/getbycompany/{company}",produces = MediaType.APPLICATION_JSON_VALUE)
public StockResponse getProductByCompany(@PathVariable("company")String company) {
	StockResponse response = new StockResponse();
	ProductsInfo product=service.searchProductByCategory(company);
	
	if(product!=null) {
		response.setStatusCode(201);
		response.setMessage("success");
		response.setDescription("Data found in the DB");
		response.setProduct(Arrays.asList(product));
	}else {
		response.setStatusCode(401);
		response.setMessage("failure");
		response.setDescription("Data not found in the DB");
	}
	return response;
}//end of getProductByCompany
@GetMapping(path = "/get-all",produces = MediaType.APPLICATION_JSON_VALUE)
public StockResponse getAllEmployee() {
	StockResponse response = new StockResponse();
	List<ProductsInfo> product = service.getAllProducts();
	if(!product.isEmpty()) {
		response.setStatusCode(201);
		response.setMessage("success");
		response.setDescription("Data found from  the DB");
		response.setProduct(product);
	}else {
		response.setStatusCode(401);
		response.setMessage("failure");
		response.setDescription("Data not found from the DB");
	}
	return response;
}//end of getAllProduct
}
