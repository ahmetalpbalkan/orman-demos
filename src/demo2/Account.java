package demo2;

import java.util.Date;

import org.orman.mapper.Model;
import org.orman.mapper.annotation.Column;
import org.orman.mapper.annotation.Entity;
import org.orman.mapper.annotation.PrimaryKey;

@Entity
public class Account extends Model<Account> {
	@PrimaryKey(autoIncrement=true)
	@Column(type = "CHAR(8)")
	private String aid;
	
	@Column(type = "VARCHAR(50)")
	private String branch;
	
	private float balance;
	
	private Date openDate;

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getAid() {
		return aid;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Date getOpenDate() {
		return openDate;
	}	
}
