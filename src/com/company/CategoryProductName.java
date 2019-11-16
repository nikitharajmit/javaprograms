package com.company;

public class CategoryProductName {
    private String categoryName;

    public void inputCategoryName(String categoryName)
    {
        this.categoryName=categoryName;
    }
    public void showCategoryName()
    {
        System.out.println("Category Name:"+categoryName);
    }

}
