public boolean isAnagramBruteForce(String s, String t) {

        Set<Integer> index = new HashSet<>();
        index.add(-1);

        if(s.length()!=t.length()){
            
            return false;
        }

        int size = s.length();

        for(int i =0;i<size;i++){

            char frstWordChar= s.charAt(i);
            int flag=0;

            for(int j =0;j<size;j++){

                if(t.charAt(j)==frstWordChar && index.contains(j)==false){
                
                    index.add(j);
                    flag=1;
                    break;
                }

            }

            if(flag==0){

                return false;
            }       
        
        }

        return true;
        
    }
