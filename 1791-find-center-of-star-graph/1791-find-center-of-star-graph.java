import java.util.HashSet; 
import java.util.Set;
class Solution {
    public int findCenter(int[][] edges) {
        Set<Integer> EdgesFound = new HashSet<>();
        for(int[] edge :edges){
            if(EdgesFound.contains(edge[0])){
                return edge[0];
            }
            EdgesFound.add(edge[0]);
            if(EdgesFound.contains(edge[1])){
                return edge[1];
            }
            EdgesFound.add(edge[1]);
        }
        return -1;
    }
}