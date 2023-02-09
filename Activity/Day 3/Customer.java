public class Customer {
    private String name;
    private String address;
    private String mobile;

    public void setName(String newName){
        this.name = newName;

    }
    public void setAddress(String Address){
        this.address = Address;

    }
    public void setMobile(String Mobile){
        this.mobile = Mobile;

    }

    public String getName(){ return name;}
    public String getAddress(){return address;}
    public String getMobile(){return mobile;}
}
