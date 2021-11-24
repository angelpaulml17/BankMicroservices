package com.example.accountservice.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 
public class Saving{
    @Id
     private String account_number;
    @Column
    private String customer_name;
    @Column
    private String account_balance;
    @Column
    private String branch_name;

	public Saving()
	{
		
	}
    public Saving(String string, String string2, String string3, String string4)
 {
                                          account_number=string;
		customer_name=string2;
		account_balance=string3;
                                    branch_name=string4;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(String account_balance) {
        this.account_balance =account_balance;
    }
  public String getBranch_name(){
   return branch_name;
}
public void setBranch_name(String branch_name) {
        this.branch_name =branch_name;
}
}