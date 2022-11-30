public class Tshirts {
    static String size(int cms) {
       if (cms < 38) {
			return "S";
		} else if (cms > 38 && cms < 42) {
			return "M";
		} else {
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
