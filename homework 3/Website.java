
/**
 * Write a description of class Website here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;

public class Website
{
     //All the variables
    private String name;
    private int hits;   //add one to hits when someone logs in
    private int salesTotal;
    private boolean ageFlag = false;
    private double takenPrice;
    
    
    public Website(String sitename1) //constructor for assigning the name of the website
    {
        this.name = sitename1;
    }
    
    public Website()      //default constructor, makes debugging easier
    {
        name = "wine";
    }
    
    public void buyerLogin(Browser browser)         //outputs the details of the logged in buyer
    {
        //browser = browser1;
        System.out.println(name + " welcome buyer " + browser.getId() + " you are now logged in");
        //browser.setWebsite(this.name, browser.getWebsiteRef());
        browser.setWebsite(this);   //knows which browser is logged in
        hits += 1;      //adds 1 to hits
    }
    
    public void becomeBuyer(Browser browser)        //checks to see if the age of the buyer is over 18
    {
        if(browser.getYearOfBirth() <= 2001)
        {
            System.out.println("You are old enough to buy alcohol");
            ageFlag = true;         //I put this in myself as a test, the homework doesnt need it.
        }
        else
        {
            System.out.println("You are too young");
            ageFlag = false;        //I put this in myself as a test, the homework doesnt need it.
        }
    }
    
    
    //mutator methods
    public void changeName(String name1)
    {
        name = name1;
    }
    
    public void changeHits(int hits1)
    {
        hits = hits1;
    }
    
    public void changeSalesTotal(int sales)
    {
        salesTotal = sales;
    }
    
    //getter methods
    public String getName()
    {
        return name;
    }
    
    public int getHits()
    {
        return hits;
    }
    
    public int getSalesTotal()
    {
        return salesTotal;
    }
    
    
    
    public void checkout(Browser browser,WineCase wineCase)
    {
        //System.out.println("You have succefully purchased from " + browser.getWebsiteRef());
        System.out.println("You have purcahsed " + wineCase.getRefNo() + name);
        checkHitsDiscout(wineCase);
    }
    
    
    //discout
    public void checkHitsDiscout(WineCase wineCase)
    {
        if (hits % 10 == 0) //if hits mod 10 = 0 then do the below
        {
            takenPrice =wineCase.getPrice();
            takenPrice = takenPrice * 0.9;
            System.out.println("Congratulations you have a 10% discount on your order");
        }
        
    }
    
}
