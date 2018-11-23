package ingram_ftp_service.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class search_deleted_orders {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	//Allocate deleted_orders table columns
	private Long ecobee_deleted_orders_id;
	private Long sold_to_party_number;
	private String rejection_code;
	private Long consignee_name;
	private Long sold_to_order_ref;
	private Long sales_order_line;
	private Long order_entry_date;
	private Long document_date;
	private Long material_number;
	private Long customer_purchase_order;
	private String sales_order_quantity;
	private Long customer_material_number;
	
	public search_deleted_orders(Long customer_purchase_order) {
		this.customer_purchase_order = customer_purchase_order;
	}
	

}
