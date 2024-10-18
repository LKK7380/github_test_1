package variable.ex;

public class Application {
    public int stringAdd(String str) {
        if(str == null || str.isEmpty()) {
            return 0;
        }
        if(str.contains(",")) {
            String[] plusValues = str.split(",");
            int sum = 0;
            for (String plusValue : plusValues) {
                sum += Integer.parseInt(plusValue);
            } // 문자열안에 ,가 있을때 정상적으로 문자열을 더하는가?
            return sum;
        }
        return 0; // 구현 빈 공간이거나 null인경우에 0을 반환하는것
    }
}
