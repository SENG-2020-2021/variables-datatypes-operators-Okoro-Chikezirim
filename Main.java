class Main {
  public static void main(String[] args) {
   // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them
   int daysdefaulted =16;
  int amountperday =1000;
  int amounttopay;
   
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for
   int dayspaidfor;
   int amountlefttopay;
   int daysnotpaid;
   int amountpaid =2000;
  int amountnotinday;
   // calculate and print total amount the debtor is to pay
    amounttopay = daysdefaulted * amountperday;
    System.out.println("the amount to pay is:"+amounttopay);

   // calculate and print the days the debtor paid for

    dayspaidfor = amountpaid/amountperday;
    System.out.println("the days paid for are:"+dayspaidfor);

  // calculate and print the amount whose day was not captured because the amount was incomplete
    amountnotinday = amountpaid%amountperday;
    System.out.println("the amount that does not cover a day is:"+amountnotinday);

   // calculate and print amount the debtor is left to pay
    amountlefttopay = ((daysdefaulted - dayspaidfor)* amountperday) + (amountperday - amountnotinday);
    System.out.println("the amount left to pay is:"+amountlefttopay);



   // calculate and print days the debtor has not payed for
    daysnotpaid = daysdefaulted - dayspaidfor;
    System.out.println("the days not paid for are:"+daysnotpaid);

   //kindly remove the statement below when you are done with the assignment
    
    
  }
}