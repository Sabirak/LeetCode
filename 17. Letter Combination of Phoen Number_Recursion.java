class Solution {
    Map<Character,String> keypadMap = new HashMap();
    List<String> response = new ArrayList();
    public void createMap(){
        //Map<Character,String> keypadMap = new HashMap();
        keypadMap.put('2',"abc");
        keypadMap.put('3',"def");
        keypadMap.put('4',"ghi");
        keypadMap.put('5',"jkl");
        keypadMap.put('6',"mno");
        keypadMap.put('7',"pqrs");
        keypadMap.put('8',"tuv");
        keypadMap.put('9',"wxyz");
        //return keypadMap;
        
    }

    private void backtracking(String digits,int i , String curString){
       if(digits.length()==curString.length()){
        response.add(curString);
        return;
       }
        String mapping = keypadMap.get(digits.charAt(i));
        for(int j=0;j<mapping.length();j++){

             backtracking(digits,i+1,curString+String.valueOf(mapping.charAt(j)));
        }
    }

    public List<String> letterCombinations(String digits) {
       createMap();
       if(digits.length()>0)
          backtracking(digits,0,"");
       return response;

    }
}
