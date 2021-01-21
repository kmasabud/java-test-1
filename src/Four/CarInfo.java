package Four;

public class CarInfo {
    private String serialNo;
    private String brand;
    private String price;
    private String color;

    public CarInfo(){

    }
    public CarInfo(String serialNo,String brand,String price,String color){
        this.serialNo = serialNo;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getSerialNo(){
        return serialNo;
    }
    public void setSerialNo(String serialNo){
        this.serialNo = serialNo;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price = price;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "CarInfo{" +
                "serialNo='" + serialNo + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
