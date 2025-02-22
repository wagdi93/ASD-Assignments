package day09;

public class Application
{
    public static void main(String[] args)
    {
        Order order = new Order(120, 220);

    	EducationalDiscount educationalDiscount = new EducationalDiscount();
    	GovernmentDiscount governmentDiscount = new GovernmentDiscount();
    	CharitableDiscount charitableDiscount = new CharitableDiscount();
    	HomelessDiscount homelessDiscount = new HomelessDiscount();

    	homelessDiscount.addDiscount(educationalDiscount);
    	homelessDiscount.addDiscount(governmentDiscount);

    	// No discount first
        System.out.println(order.show());
        
    	order.setDiscountStrategy(educationalDiscount);
    	System.out.println(order.show());
        
    	order.setDiscountStrategy(governmentDiscount);
    	System.out.println(order.show());

    	order.setDiscountStrategy(charitableDiscount);
    	System.out.println(order.show());

    	order.setDiscountStrategy(homelessDiscount);
    	System.out.println(order.show());

    	System.out.println();
    }
    
 }
