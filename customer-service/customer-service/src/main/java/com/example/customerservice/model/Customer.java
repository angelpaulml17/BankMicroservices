package com.example.customerservice.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 
public class Customer {
    @Id
    private String id;
    @Column
    private String customer_name;
    @Column
    private String age;
    @Column
    private String account_number;
  
	public Customer()
	{
		
	}
    public Customer(String string, String string2, String string3, String s4) {
        id=string;
        customer_name=string2;
        age=string3;
        account_number=s4;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
}

