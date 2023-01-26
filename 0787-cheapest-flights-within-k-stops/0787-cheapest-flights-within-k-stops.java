class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
          List<Info>[] graph = new ArrayList[n];
        Queue<Info> queue = new ArrayDeque<>();
        queue.offer(new Info(src, 0));
        int[] distance = new int[n];
        int res = Integer.MAX_VALUE;
        int lvl = k + 1;

        for(int[] flight : flights){
            if(graph[flight[0]] == null){
                graph[flight[0]] = new ArrayList<>();
            }
            graph[flight[0]].add(new Info(flight[1], flight[2]));
        }
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Info node = queue.poll();
                if(node.val == dst){
                    res = Math.min(res, node.price);
                    continue;
                }
                int cur = node.val;
                if(graph[cur] != null){
                    for(Info neighbor : graph[cur]){
                        if(distance[neighbor.val] != 0 && neighbor.price + node.price > distance[neighbor.val]){
                            continue;
                        }
                        distance[neighbor.val] = neighbor.price + node.price;
                        queue.offer(new Info(neighbor.val, neighbor.price + node.price));
                    }
                }
            }
            if(lvl == 0){
                break;
            }
            lvl--;
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    static class Info{
        int val;
        int price;

        public Info(int val, int price){
            this.val = val;
            this.price = price;
        }
    }
}