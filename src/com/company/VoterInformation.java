package com.company;

public class VoterInformation {

    public class UniqueID
    {
        private int voterID;
    }
    public class VoterAddress
    {
        private int hno;
        private String street;
        private String area;
    }
    public class Eligibility
    {
        private int age;
        private boolean eligible;

        public Eligibility(){
            eligible=true;
        }
        public void setAge(int age){
            if(age>=18)
                this.age=age;
            else
                eligible=false;
        }
        public boolean iseligible(){
            return eligible;
        }

    }
    UniqueID uid=new UniqueID();
    VoterAddress add=new VoterAddress();
    Eligibility e=new Eligibility();
    public void setVoterinfo(int voterID,int hno,String street,String area){
        this.uid.voterID=voterID;
        this.add.hno=hno;
        this.add.street=street;
        this.add.area=area;
    }
    public void showVoterinfo(){
        System.out.println("Voter ID:"+this.uid.voterID);
        System.out.println("House num:"+this.add.hno);
        System.out.println("Street:"+this.add.street);
        System.out.println("Area:"+this.add.area);

    }
}
