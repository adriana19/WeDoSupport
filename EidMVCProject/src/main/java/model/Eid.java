package model;

public class Eid {

	   private String key;
	   private String name;
	   private String eid;
	   private String productPackage;
	   private String startDate;
	   private String endDate;
	   private String status;
	   
	   public Eid(){
		   
	   }
	   
	   public Eid(String key, String name, String eid, String productPackage, String startDate, String endDate, String status) {

			this.key = key;
			this.name = name;
			this.eid = eid;
			this.productPackage = productPackage;
			this.startDate = startDate;
			this.endDate = endDate;
			this.status = status;
		}
		
		
		/* GETTERS AND SETTERS*/   
		

		public String getKey() {

			return key;
		}
		public void setKey(String key) {

			this.key = key;
		}
		public String getName() {

			return name;
		}
		public void setName(String name) {

			this.name = name;
		}
		public String getProductPackage() {

			return productPackage;
		}
		public void setProductPackage(String productPackage) {

			this.productPackage = productPackage;
		}
		public String getEid() {

			return eid;
		}
		public void setEid(String eid) {

			this.eid = eid;
		}
		public String getStartDate() {

			return startDate;
		}
		public void setStartDate(String startDate) {

			this.startDate = startDate;
		}
		public String getEndDate() {

			return endDate;
		}
		public void setEndDate(String endDate) {

			this.endDate = endDate;
		}
		public String getStatus() {

			return status;
		}
		public void setStatus(String status) {

			this.status = status;
		}
}
