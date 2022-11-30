public class tshirts {
    static String size(int cms) {
       if (cms < 38) {
	return "S";
	} else if (cms > 38 && cms < 42) {
	return "M";
	} else if (cms >= 42) {
	return "L";
	}
    }

    public static void main(String[] args) { 
        assert(size(36) == "S");
        assert(size(37) == "S");
        assert(size(38) == "S");
        assert(size(39) == "M");
        assert(size(40) == "M");
        assert(size(41) == "M");
        assert(size(42) == "L");
        assert(size(43) == "L");
        assert(size(44) == "L");
        System.out.println("All is well (maybe!)");
    }
}
