package ingram_ftp_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ingram_ftp_service.model.search_deleted_orders;
import ingram_ftp_service.repository.deleted_orders_repository;

@Controller
@RequestMapping(path="/deleted_orders")

public class ingram_ftp_deleted_orders_controller {
	@Autowired
	private deleted_orders_repository get_deleted_order_by_number;
	
	@RequestMapping(path="/all")
	public @ResponseBody Iterable<search_deleted_orders> get_deleted_order_by_number() {
		return get_deleted_order_by_number.findAll();
	}
	
	/*
	@RequestMapping(path="/search/{sales_order_number}")
	public ResponseEntity<List> get_deleted_order_by_number(@PathVariable String sales_order_number) {
		
		Long search_deleted_orders = get_deleted_order_by_number.get_deleted_order_by_number(sales_order_number);
		
		if(search_deleted_orders == null) {
			return new ResponseEntity<List>(HttpStatus.ACCEPTED);
		} else {
			return new ResponseEntity<List>(search_deleted_orders, HttpStatus.ACCEPTED);
		}
	}*/

}
