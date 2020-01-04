package v2l.Ecommerce;

public class ProductDiscount {
    private int pDisid;
    private int disPER;
    private int disINR;
    private String month;
    private float discountValue;
 private float billAmount;
  private final int JAN=1;
    private final int FEB=2;
    private final int MAR=3;
    private final int APR=4;
    private final int MAY=5;


    public int getpDisid(){
        return this.pDisid;
    }
    public int getDisPER(){
        return this.disPER;
    }

    public int getDisINR(){
        PDiscountDbo pDiscountDbo=new PDiscountDbo();
        return pDiscountDbo.getdisINRByMonth(month);
    }
    public String getMonth(){
        return this.month;
    }

    public void setpDisid(int pDisid){
        this.pDisid=pDisid;
    }
    public void setDisPER(int disPER){
        this.disPER=disPER;
    }
    public void setDisINR(int disINR)
    {
        this.disINR=disINR;
    }
    public void setMonth(int pDisid){
     PDiscountDbo pDiscountDbo=new PDiscountDbo();
     month=pDiscountDbo.getMonthByid(this.pDisid);
    }

    public void applyDiscount(int month)
    {
        Product product=new Product();

        switch(month)
        {
            case JAN:
                if(product.getPrice()>=1000)
                {
                    discountValue= this.getDisINR();
                    this.billAmount = product.getPrice() - discountValue;
                }
                else
                    this.billAmount=product.getPrice()-(product.getPrice()*this.getDisPER()/100);
                break;


        }

    }
    public float displayBillamount(){
        return billAmount;
    }

}
