package com.milton.Bean;
// Generated Dec 27, 2018 1:02:45 AM by Hibernate Tools 4.3.1



/**
 * MemberStatistics generated by hbm2java
 */
public class MemberStatistics  implements java.io.Serializable {


     private Integer memberId;
     private String memberName;
     private int memberInvestment;
     private double memberMeal;

    public MemberStatistics() {
    }

    public MemberStatistics(String memberName, int memberInvestment, double memberMeal) {
       this.memberName = memberName;
       this.memberInvestment = memberInvestment;
       this.memberMeal = memberMeal;
    }
   
    public Integer getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return this.memberName;
    }
    
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public int getMemberInvestment() {
        return this.memberInvestment;
    }
    
    public void setMemberInvestment(int memberInvestment) {
        this.memberInvestment = memberInvestment;
    }
    public double getMemberMeal() {
        return this.memberMeal;
    }
    
    public void setMemberMeal(double memberMeal) {
        this.memberMeal = memberMeal;
    }




}


