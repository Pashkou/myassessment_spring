package siarhei.pashkou.versteigerung.shab.json.model.single;

import siarhei.pashkou.versteigerung.shab.json.model.list.Meta;

public class Publication {
	 Meta MetaObject;
	 Content ContentObject;


	 // Getter Methods 

	 public Meta getMeta() {
	  return MetaObject;
	 }

	 public Content getContent() {
	  return ContentObject;
	 }


	 // Setter Methods 

	 public void setMeta(Meta metaObject) {
	  this.MetaObject = metaObject;
	 }

	 public void setContent(Content contentObject) {
	  this.ContentObject = contentObject;
	 }

	}