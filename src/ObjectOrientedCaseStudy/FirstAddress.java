//编写并测试一个代表地址的Address类，地址信息由国家、省份、城市、街道、邮编组成，并可以返回完整的地址信息
package ObjectOrientedCaseStudy;
class Address{
    private String country;
    private String province;
    private String city;
    private String street;
    private String zipcode;
    public Address(){}
    public Address(String country,String province,String city,String street,String zipcode){
        this.country=country;
        this.province=province;
        this.city=city;
        this.street=street;
        this.zipcode=zipcode;
    }
    public String getInfo(){
        return "国家："+this.country+"\n省份："+this.province+"\n城市："+this.city+"\n街道："+this.street+"\n邮编："+this.zipcode;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public void setProvince(String province){
        this.province=province;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setStreet(String street){
        this.street=street;
    }
    public void setZipcode(String zipcode){
        this.zipcode=zipcode;
    }
    public String getCountry(){
        return this.country;
    }
    public String getProvince(){
        return this.province;
    }
    public String getCity(){
        return this.city;
    }
    public String getStreet(){
        return this.street;
    }
    public String getZipcode(){
        return this.zipcode;
    }
}
/**
 * @author chaz
 */
public
class FirstAddress {
    public static void main(String[]args){
        System.out.println (new Address ("中华人民共和国 ","浙江省 ","杭州市 ","余杭街道 ","31000").getInfo());
    }
}
