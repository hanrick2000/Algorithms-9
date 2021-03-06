/*
    Author : CNatka
    Date   : Aug 19, 2018
    OJ     : Leetcode/Pascal's Triangle
    Link   : https://leetcode.com/problems/pascals-triangle/description/
    
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows==0) return res;
        List<Integer> first = new ArrayList<> ();
        first.add(1);
        res.add(first);
        for(int i=1; i<numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i) temp.add(1);
                else {
                    List<Integer> tList = res.get(i-1);
                    int count = tList.get(j-1)+tList.get(j);
                    temp.add(count);
                }
            }
            res.add(temp);
        } 
        return res;
    }
}