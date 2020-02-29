package Ui;

import bean.Customer;
import service.CustomerList;
import util.CMUtility;

/**
 * 为主模块， 负责菜单的显示和处理用户的操作
 */

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("tom",'M',29,"6786700533","tom@gmail.com");
        customerList.addCustomer(customer);
    }

    // main method
    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }

    // enter main menu;// show the main view;
    public void enterMainMenu(){

        boolean isFlag = true;
        while (isFlag){
        System.out.println("\n---------------------------------CUSTOMER LIST---------------------------------\n");
        System.out.println("                                 1 Add Customer");
        System.out.println("                                 2 Replace Customer");
        System.out.println("                                 3 Delete Customer");
        System.out.println("                                 4 View CustomerList");
        System.out.println("                                 5 Exit CustomerList");
        System.out.println("                                 Please Enter (1-5): ");

        char menu =  CMUtility.readMenuSelection();
            switch (menu ){
                case '1':
                    addCustomer();
                    break;
                case'2':
                    replaceCustomer();
                    break;
                case'3':
                    deleteCustomer();
                    break;
                case'4':
                    getAllCustomer();
                    break;
                case'5':
                    System.out.println("Want Exit? Y/N");
                 char exit = CMUtility.readConfirmSelection();
                 if (exit=='Y'){
                     isFlag = false;
                 }

            }
        }
    }
        // isFlag = false;
//private CustomerList customerList = new CustomerList(10);
    private void addCustomer(){
        System.out.println("------------------------Add Customer-------------------------");
        System.out.println("Enter Name :");
        String readName= CMUtility.readString(30);

        System.out.println("Enter Gender :");//"NumberID\t   Name\t   Garey\t   Age\t   PhoneNumber\t   Email"
        char readCharGender = CMUtility.readChar();

        System.out.println("Enter Age :");
        int  readAge = CMUtility.readInt();

        System.out.println("Enter phoneNumber :");
        String readPhoneNumber = CMUtility.readString(15);

        System.out.println("Enter Email :");
        String readEmail = CMUtility.readString(30);

        Customer customer = new Customer(readName,readCharGender,readAge,readPhoneNumber,readEmail);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess){
            System.out.println("Enter Successful");
        }else {
            System.out.println("The Customer List is Full, Failed!!");
        }
    }
    private void replaceCustomer(){
        System.out.println("---------------Replace Customer--------------------");
        Customer customer ;
        int number ;
        for (; ;){
            System.out.println("Enter the CustomerID-------(-1 To Exit)");
          number =   CMUtility.readInt();
         if (number==-1){
             return;
         }else {
           customer =  customerList.getCustomer((number-1));
          if (customer==null){
              System.out.println("Can not Find the Customer");
          }else{
              // when you get it
              break;
          }
         }
         // re place
            System.out.println("Name"+"("+customer.getName()+") :");
             String name  =  CMUtility.readString(10,customer.getName());

            System.out.println("Gender"+"("+customer.getGender()+") :");
             char Gender = CMUtility.readChar(customer.getGender());
            //"NumberID\t   Name\t   Garey\t   Age\t   PhoneNumber\t   Email"
            System.out.println("Age"+"("+customer.getAge()+") :");
            int Age = CMUtility.readInt(customer.getAge());
            System.out.println("PhoneNumber"+"("+customer.getPhoneNumber()+") :");
            String phoneNumber = CMUtility.readString(18,customer.getPhoneNumber());
            System.out.println("Email"+"("+customer.getEmail()+") :");
            String Email = CMUtility.readString(30,customer.getEmail());

           Customer   newCustomer = new Customer(name,Gender,Age,phoneNumber,Email   );
            boolean isReplace = customerList.replaceCustomer(number-1,newCustomer );
            if (isReplace){
                System.out.println("----------------Replace Successfully-------------------------");
            }else   {
                System.out.println("----------------Replace Unsuccessfully------------------------");
            }

        }

        System.out.println("Replace Successful");
    }
    private void deleteCustomer(){
        Customer customer;
        int number;
        for (; ;) {
            System.out.println("Enter the Customer Need to delete NumberID----(-1 For Exit)");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            } else {
                customer = customerList.getCustomer(number-1);
                if (customer==null){
                    System.out.println("\"Can not Find the Customer\"");
                }else   {
                    break;
                }
            }
            System.out.println("Sure to Delete the Customer "+customer.getName()+" Y/N");
            char yesOrNo = CMUtility.readConfirmSelection();

            if (yesOrNo=='Y'){
                boolean isDelete = customerList.deleteCustomer(number-1);
                if (isDelete){
                    System.out.println("Delete Successfully");
                }
            }
        }




        System.out.println("Delete Successful");
    }
    private void getAllCustomer(){
        System.out.println("---------------------Customer List---------------------------\n");
       if (customerList.getTotal()==0 ){
           System.out.println("NO Customer in the List");
       }else{
           System.out.println("NumberID\t   Name\t   Garey\t   Age\t   PhoneNumber\t   Email");
           Customer[] customers = customerList.getAllCustomer();

           for (int i = 0; i < customers.length; i++) {
               Customer cust= customers[i];
               System.out.println((i+1)+"\t           "+cust.getName()+"\t    "+cust.getGender()+"\t       "+
                       cust.getAge()+"\t     "+cust.getPhoneNumber()+"\t\t      "+cust.getEmail());
           }
       }


        System.out.println("---------------------Customer All here-----------------------\n");


    }

















}
