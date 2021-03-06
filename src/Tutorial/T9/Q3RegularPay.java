/*
3. Define a class PaySystem. The class consists of the payrate per hour and the number of hours. The class also contains a method to return the total pay for a given amount of hours and a method to display the total payment. Derive a class RegularPay from PaySystem that has a constructor and did not override any base methods. Derived a class SpecialPay from PaySystem that override the base method and return the total pay plus 30% commission
 */
package Tutorial.T9;

public class Q3RegularPay extends Q3PaySystem{

    public Q3RegularPay(double payrate, int hours) {
        super(payrate, hours);
        super.calTotalPay();
    }
    
    public void display(){
        super.display();
    }
    
}
