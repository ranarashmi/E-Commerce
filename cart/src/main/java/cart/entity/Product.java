package cart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pPid;
	private String pTitle;
	private String pDesc;
	private String pPhoto;
	private Double pPrice;
	private int pDiscount;
	private int pQuantity;
	
	@ManyToOne
	private Category category;

	public Product(String pTitle, String pDesc, String pPhoto, Double pPrice, int pDiscount, int pQuantity,
			Category category) {
		super();
		this.pTitle = pTitle;
		this.pDesc = pDesc;
		this.pPhoto = pPhoto;
		this.pPrice = pPrice;
		this.pDiscount = pDiscount;
		this.pQuantity = pQuantity;
		this.category = category;
	}

	public Product() {
		super();
	}

	public int getpPid() {
		return pPid;
	}

	public void setpPid(int pPid) {
		this.pPid = pPid;
	}

	public String getpTitle() {
		return pTitle;
	}

	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}

	public String getpDesc() {
		return pDesc;
	}

	public void setpDesc(String pDesc) {
		this.pDesc = pDesc;
	}

	public String getpPhoto() {
		return pPhoto;
	}

	public void setpPhoto(String pPhoto) {
		this.pPhoto = pPhoto;
	}

	public Double getpPrice() {
		return pPrice;
	}

	public void setpPrice(Double pPrice) {
		this.pPrice = pPrice;
	}

	public int getpDiscount() {
		return pDiscount;
	}

	public void setpDiscount(int pDiscount) {
		this.pDiscount = pDiscount;
	}

	public int getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}

	public Category getCid() {
		return category;
	}

	public void setCid(Category cid) {
		this.category = cid;
	}

	@Override
	public String toString() {
		return "Product [pPid=" + pPid + ", pTitle=" + pTitle + ", pDesc=" + pDesc + ", pPhoto=" + pPhoto + ", pPrice="
				+ pPrice + ", pDiscount=" + pDiscount + ", pQuantity=" + pQuantity + ", category=" + category + "]";
	}
	
	
}
