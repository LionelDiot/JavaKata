import java.util.*;
class Solution {
		public static String rangeExtraction(int[] arr) {
        int streakCount = 1;
        int previousNumber = arr[1];
        StringBuilder sb  = new StringBuilder();
        sb.append(Integer.toString(arr[0])) ;
        if (previousNumber != arr[0] + 1){
          sb.append(","+Integer.toString(previousNumber));
        }
        else {
          streakCount += 1;
        }
          
        for (int n : Arrays.copyOfRange(arr, 2, arr.length)) {
          if (n == previousNumber+1){
            streakCount+= 1;
          } 
          else {
            if (streakCount == 1){
              sb.append(","+Integer.toString(n));
            }
            else if (streakCount == 2){
              sb.append(","+Integer.toString(previousNumber)+","+Integer.toString(n));
            }
            else {
              sb.append("-"+Integer.toString(previousNumber)+","+Integer.toString(n));
            }
            streakCount = 1 ;
          }
          previousNumber = n;
        }
        if (streakCount>2){
          sb.append("-"+Integer.toString(previousNumber));
        }
        if ( streakCount == 2){
          sb.append(","+Integer.toString(previousNumber));
        }
      
    		return sb.toString();
    }
