package Four;

import java.util.*;

public class SearchCar {
    public static void main(String... args){
        String serialNo = getSerialNo();
        searchCarInfoBySerialNo(serialNo);
        searchByHashMap(serialNo);
    }

    public static String getSerialNo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Serial Number : ");
        return scan.nextLine();
    }

    public static void searchCarInfoBySerialNo(String search) {
        List<CarInfo> carInfos = dummy();
        if(isValid(carInfos, search)) {
            for (CarInfo temp : carInfos) {
                if (search.equalsIgnoreCase(temp.getSerialNo())) {
                    System.out.println("Serial Number " + temp.getSerialNo() + " // Brand > " + temp.getBrand() + " // Price > " + temp.getPrice() + " // Color > " + temp.getColor());
                    return;
                }
            }
        }
        System.out.println("Car not Found");
    }

    public static boolean isValid(List<CarInfo> carInfos, String search){
        return carInfos != null && search!=null;
    }

    public static void searchByHashMap(String search) {
        List<CarInfo> carInfos = dummy();
        if (isValid(carInfos, search)) {
            //initial hash map
            Map<String, CarInfo> map = new HashMap<>();
            for (CarInfo temp : carInfos) {
                map.put(temp.getSerialNo(), temp);
            }

            CarInfo result = map.get(search);
            if (result != null) {
                System.out.println("Serial Number " + result.getSerialNo() + " // Brand > " + result.getBrand() + " // Price > " + result.getPrice() + " // Color > " + result.getColor());
                return;
            }
        }
        System.out.println("Car not Found");
    }

    public static List<CarInfo> dummy(){
        List<CarInfo> carInfo = new ArrayList<>();
        carInfo.add(new CarInfo("000","C","8,000","red"));
        carInfo.add(new CarInfo("001","A","10,000","white"));
        carInfo.add(new CarInfo("002","B","5,000","white"));
        carInfo.add(new CarInfo("003","C","15,000","black"));
        carInfo.add(new CarInfo("004","A","20,000","red"));
        carInfo.add(new CarInfo("005","B","7,500","black"));
        carInfo.add(new CarInfo("006","C","5,000","white"));
        carInfo.add(new CarInfo("007","A","30,000","black"));
        carInfo.add(new CarInfo("008","B","12,000","white"));
        carInfo.add(new CarInfo("009","C","10,000","black"));
        carInfo.add(new CarInfo("010","A","9,000","red"));
        return carInfo;
    }
}
