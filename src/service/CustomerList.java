package service;

import bean.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description CustomerList is Customer Class controual
 * 提供相应的添加 修改 删除和遍历的方法， 供 Customer view 调用
 */

public class CustomerList {

    private    Customer[] customers;// file customerList
    private int total ;

// constructor to creat a Customer type []; totalCustomer--->set the []. length;
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    // add customer
    public boolean addCustomer(Customer customer){
        if (total>=customers.length){
            return false;
        }else {
            customers[total++] = customer;
        }
        return true;
    }
    // replaceCustomer
    public boolean replaceCustomer(int index,Customer customer){
        if (index>=total||index<0){
            return false;
        }else{
            customers[index] = customer;
        }
        return true;
    }
    // deleteCustomer
    public boolean deleteCustomer(int index){
        if (index<0||index>=total){
            return false;
        }else{
            for (int i = index  ; i<total-1 ; i++) {
                customers[i] = customers[i+1];
                customers[--total] = null;
            }
        }
        return true;
    }
    // get all customer
    public Customer[] getAllCustomer(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i]=customers[i];
        }
        return custs;
    }
    // get customer
    public Customer getCustomer(int index){
        if (index>=total||index<0){
            return null;
        }else return customers[index];
        }
    // getTotal
    public int getTotal(){
        return total;
    }

    }

