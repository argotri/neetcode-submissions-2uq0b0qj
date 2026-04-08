class Solution {

    public String encode(List<String> test) {
        String result = "";
        if(test.size()==0){
            return result+"~";
        }
        boolean first=true;
        for (String s : test) {
            result = result + (first?"":"~");
            result += s;
            first=false;
        }
        System.out.println(result);
        return result;
    }

    public List<String> decode(String str) {
        if(str.equals("?")){
            return new ArrayList<>();
        }
        return List.of(str.split("~"));
    }
}
