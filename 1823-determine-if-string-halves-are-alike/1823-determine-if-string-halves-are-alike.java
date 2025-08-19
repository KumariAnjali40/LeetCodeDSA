class Solution {
    public boolean halvesAreAlike(String s) {
       StringBuilder sb1 = new StringBuilder();
       StringBuilder sb2 = new StringBuilder();

    //    for(int i = 0; i < s.length()/2; i++){
    //     sb1.append(s.charAt(i));
    //    }

    //    for(int i = s.length()/2; i < s.length(); i++){
    //      sb2.append(s.charAt(i));
    //    }

    //    int count1 = 0; 
    //    int count2 = 0;

    //    String vowels = "aeiouAEIOU";

    //    for(int i = 0; i < sb1.toString().length(); i++){
    //       char ch = sb1.charAt(i);
    //       if(vowels.indexOf(sb1.charAt(i)) != -1){
    //         count1++;
    //       }

    
    //    }

    //     for(int i = 0; i < sb2.toString().length(); i++){
    //       char ch = sb2.charAt(i);
    //       if(vowels.indexOf(sb2.charAt(i)) != -1){
    //         count2++;
    //       }

    
    //    }

    //    return count1 == count2;

    String vowels = "aeiouAEIOU";
    int count1 = 0;
    int count2 = 0;

    int mid = s.length()/2;

    for(int i = 0; i < mid; i++ ){
        if(vowels.indexOf(s.charAt(i)) != -1){
            count1++;
        }
    }


    for(int i = mid; i < s.length(); i++ ){
        if(vowels.indexOf(s.charAt(i)) != -1){
            count2++;
        }
    }

     return count1 == count2;
        
    }
}