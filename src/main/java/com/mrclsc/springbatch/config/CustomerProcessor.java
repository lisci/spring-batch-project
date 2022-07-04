package com.mrclsc.springbatch.config;


import com.mrclsc.springbatch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

    // ITEM PROCESSOR PROCESS
    /* process() take a customer as parameter.
    * This method need to filtering every rows with procession == developer and gender == female
    * */
    @Override
    public Customer process(Customer customer) throws Exception {
        if(customer.getProfession().equals("developer") && customer.getGender().equals("female")) {
            return customer;
        } else {
            return null;
        }
    }
}