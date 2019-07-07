package siarhei.pashkou.versteigerung.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends CrudRepository<MerchandiseEntity, Long> {
}