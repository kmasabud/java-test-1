package Four;

import java.util.*;

public class FiveSix {
    public static void main(String... args){
        Map<String,List<CarInfo>>= new HashMap<>(filterColor((dummy())));
        System.out.println("Total Color "+colorStorage(dummy()));
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

    public static boolean isValid(List<CarInfo> carInfos){
        return carInfos != null;
    }

    public static List<String> colorStorage(List<CarInfo> carInfo){
        if(carInfo==null){
            return null;
        }
        List<String> storage = new ArrayList<>();

        Map<String, String> tmp = new HashMap<>();
        for(CarInfo car: carInfo) {
            String result = tmp.get(car.getColor());
            if(result==null){
                tmp.put(car.getColor(), car.getColor());
                storage.add(car.getColor());
            }
        }
        return storage;
    }


    public static void printObj(Map<String, List<CarInfo>> map){
        for(Map.Entry<String,  List<CarInfo>> e : map.entrySet()) {
            System.out.println(e.getKey());
            showMeColor(e.getValue());
        }
    }

    public static void showMeColor(List<CarInfo> carInfo){
        for(CarInfo car : carInfo){
            System.out.println(car);
        }
        System.out.println();
    }

    //Map<String, String> [red]->[RED]
    public static  Map<String, List<CarInfo>> filterColor(){
        List<CarInfo> carInfos = dummy();
        if(isValid(carInfos)){
            Map<String, List<CarInfo>> map = new HashMap<>();
                for(CarInfo tmp : carInfos){
                if("white".equalsIgnoreCase(tmp.getColor())){
                    List<CarInfo> white = map.get("white");
                    if(white==null){
                        white = new ArrayList<>();
                        white.add(tmp);
                    }
                    else {
                        white.add(tmp);
                    }
                    map.put("white",white);
                }
            }
            List<CarInfo> white = map.get("WHITE");
            if(white!=null){
                System.out.println("White "+white.size());
                for(CarInfo whiteList : white){
                    System.out.println(whiteList);
                }
            }
        }
        return map;
    }
}
