// problem link: https://leetcode.com/problems/pascals-triangle/description/
// Time Complexity : O(n**2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Use 2 for loops- one for row and one for each entry in row based on previos row.
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList <> ();
        for(int i =0; i<numRows; i++){
            List<Integer> row = new ArrayList <> ();
            for(int j=0; j<=i; j++){
                if(j== 0 || j == i) row.add(1);
                else{
                    int left = result.get(i-1).get(j-1);
                    int right = result.get(i-1).get(j);
                    row.add(left+right);
                }
            }
            result.add(row);
        }
        return result;
    }
}