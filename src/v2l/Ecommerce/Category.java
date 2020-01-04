package v2l.Ecommerce;


import v2l.Ecommerce.CategoryDbo;

import java.util.ArrayList;

public class Category {

    private int cid;
    public String cname;

    public String getCname(){
        return this.cname;
    }
    public void setCname(String cname){

        this.cname=cname;
    }
    public int getCid(){
        CategoryDbo categoryDbo=new CategoryDbo();
        return categoryDbo.getIdbyCategoryName(this.cname);
    }
    public void setCid(int cid){
        CategoryDbo categoryDbo=new CategoryDbo();
        cname=categoryDbo.getCategoryNamebyId(cid);
    }

    public static ArrayList<String> getCategoryNameTochoose(){
        CategoryDbo categoryDbo=new CategoryDbo();
        return categoryDbo.getCategoryNames();
    }
}
