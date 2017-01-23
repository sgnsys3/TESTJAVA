/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaddress;

/**
 *
 * @author INT105
 */
public class Address {
    private String postCode;
    private String province;
    private String homeNum;
    private String road;
    
    public Address(){}
   
  
 public Address(String postCode, String province, String homeNum, String road) {
    this.postCode = postCode;
    this.province = province;
    this.homeNum = homeNum;
    this.road = road;
    
    
}

    public String getPostCode() {
        return postCode;
    }

    public String getProvince() {
        return province;
    }

    public String getHomeNum() {
        return homeNum;
    }

    public String getRoad() {
        return road;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setHomeNum(String homeNum) {
        this.homeNum = homeNum;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    @Override
    public String toString() {
        return "Address {" + "postCode = " + postCode + ", province = " + province + ", homeNum = " + homeNum + ", road = " + road + '}';
    }
    
    @Override
    public boolean equals(Object obj){
        boolean result = false;
        if(obj instanceof Address){
            Address ad = (Address)obj;
            if(homeNum.equals(ad.homeNum) && (road.equals(ad.road)) && (postCode.equals(ad.postCode))){
               result = true;
            }
        }
        return result;
    }
}
