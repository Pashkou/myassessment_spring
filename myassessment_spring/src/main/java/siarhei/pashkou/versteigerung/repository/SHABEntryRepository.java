package siarhei.pashkou.versteigerung.repository;

import org.springframework.data.repository.CrudRepository;

import siarhei.pashkou.versteigerung.shab.db.model.SHABEntry;

public interface SHABEntryRepository extends CrudRepository<SHABEntry, Long> {
}
