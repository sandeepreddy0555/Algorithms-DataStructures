package String;

public class Needlehaystack {


    public int strStr(String haystack, String needle) {

      if(haystack == null || needle == null || needle.length() > haystack.length())
        return -1;

      if(needle.equals(""))
        return 0;

      int curr = 0;
      for(int i=0;i<=haystack.length()-1;i++){
        if(haystack.charAt(i) == needle.charAt(curr)){
          curr  = curr+1;
        }
        else{
          i= curr>0 ? i-curr:i;
          curr  = 0;
        }

        if(curr == needle.length())
          return i-curr+1;
      }
      return -1;
    }


}
