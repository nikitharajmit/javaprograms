package com.company;

public class University {
    private College collegeinfo[]=new College[5];
    private int collegeCounter=0;


    public University(){
        for (int i=0;i<5;i++){
            collegeinfo[i]=new College();
        }
    }
    public void createCollegeDetails(String cCode,String cName,String cAddress){
       collegeinfo[collegeCounter].collegeDetails(cCode,cName,cAddress);
       collegeCounter++;

    }

   public College getCollegeName(String collegeName)
   {
        for (int i=0;i<5;i++)
        {
            if(collegeName.equals(collegeinfo[i].getcName()))
            {
               return collegeinfo[i];
            }

        }
        return null;

   }
    }

