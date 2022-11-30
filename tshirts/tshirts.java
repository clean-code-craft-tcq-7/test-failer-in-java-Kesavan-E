public class Tshirts {
    static String size(int cms) {
       if(cms < 36){
        return "Not a valid size";  
        }else if((cms >= 36) && (cms <= 38)){
        return "S";
        }else if((cms >= 39) && (cms <= 41)){
        return "M";
        }else if((cms >= 42) && (cms <= 44)){
        return "L";
        }else{
            return "Not a valid size";
        }
    }

    public static void main(String[] args) { 
        assert(size(0) == "Not a valid size");
        assert(size(20) == "Not a valid size");
        assert(size(36) == "S");
        assert(size(37) == "S");
        assert(size(38) == "S");
        assert(size(39) == "M");
        assert(size(40) == "M");
        assert(size(41) == "M");
        assert(size(42) == "L");
        assert(size(43) == "L");
        assert(size(44) == "L");
        assert(size(50) == "Not a valid size");
        System.out.println("All is well (maybe!)");
    }
}
