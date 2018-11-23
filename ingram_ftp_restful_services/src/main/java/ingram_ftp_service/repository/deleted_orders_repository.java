package ingram_ftp_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ingram_ftp_service.model.search_deleted_orders;

public interface deleted_orders_repository extends JpaRepository<search_deleted_orders, Long>{

		
}
