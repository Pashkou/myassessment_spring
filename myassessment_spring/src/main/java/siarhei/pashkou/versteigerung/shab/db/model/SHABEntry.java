package siarhei.pashkou.versteigerung.shab.db.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class SHABEntry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	
	private String metaId;
	private String creationDate;
	private String updateDate;
	private String rubric;
	private String subRubric;
	private String language;
	
	//private String registrationOffice;
	
	public SHABEntry(String id, String creationDate, String updateDate, String rubric, String subRubric,
			String language) {
		super();
		this.id = id;
		this.creationDate = creationDate;
		this.updateDate = updateDate;
		this.rubric = rubric;
		this.subRubric = subRubric;
		this.language = language;
	}

	public SHABEntry() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getRubric() {
		return rubric;
	}

	public void setRubric(String rubric) {
		this.rubric = rubric;
	}

	public String getSubRubric() {
		return subRubric;
	}

	public void setSubRubric(String subRubric) {
		this.subRubric = subRubric;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMetaId() {
		return metaId;
	}

	public void setMetaId(String metaId) {
		this.metaId = metaId;
	}
	
	
	
}
