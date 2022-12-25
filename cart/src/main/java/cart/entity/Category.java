package cart.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryId;
	private String categoryTitle;
	private String cateoryDisc;
	
	@OneToMany(mappedBy = "category")
	private List<Product> pid = new ArrayList<Product>();
	
	

	public Category(String categoryTitle, String cateoryDisc, List<Product> pid) {
		super();
		this.categoryTitle = categoryTitle;
		this.cateoryDisc = cateoryDisc;
		this.pid = pid;
	}

	public Category(String categoryTitle, String cateoryDisc) {
		super();
		this.categoryTitle = categoryTitle;
		this.cateoryDisc = cateoryDisc;
	}

	public Category() {
		super();
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	public String getCateoryDisc() {
		return cateoryDisc;
	}

	public void setCateoryDisc(String cateoryDisc) {
		this.cateoryDisc = cateoryDisc;
	}

	public List<Product> getPid() {
		return pid;
	}

	public void setPid(List<Product> pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryTitle=" + categoryTitle + ", cateoryDisc="
				+ cateoryDisc + ", pid=" + pid + "]";
	}
	
	
	
}
