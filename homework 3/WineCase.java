    
/**
 * Write a description of class WineCase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WineCase
{
    //All the variables
    private String refNo;
    private String description;
    private int noOfBottles;
    private double price;
    
    public WineCase(String refNo1, String description1, int noOfBottles1, double price1) //constructor for the wine case
    {
        refNo = refNo1;
        description = description1;
        noOfBottles = noOfBottles1;
        price = price1;
        
    }
    
    public WineCase()       //default constructor, makes debugging easier
    {
        refNo = "123wine";
        description = "White wine";
        noOfBottles = 32;
        price = 11.50;
    }
    
    //Getter methods
    public String getRefNo()
    {
        return refNo;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public int getNoOfBottles()
    {
        return noOfBottles;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    
    //mutator methods
    public void changeRefNo(String ref)
    {
        refNo = ref;
    }
    
    public void changeDescription(String des)
    {
        description = des;
    }
    
    public void changeNoOfBottle(int bottles)
    {
        noOfBottles = bottles;
    }
    
    public void changePrice(double cost)
    {
        price = cost;
    }
    
    
    
}
