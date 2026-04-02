class Solution {
    HashMap<Integer,List<Integer>> preMap = new HashMap<>();
    Set<Integer> visiting = new HashSet<>();
    Set<Integer> visited = new HashSet<>();

    int index;
    int[] output ;
        public int[] findOrder(int numCourses, int[][] prerequisites) {
             
            output = new int[numCourses];
            index = 0;
        
        //create a preMap
        for(int i=0;i<numCourses;i++){
            preMap.put(i,new ArrayList<>());
        }

        for(int[] pre: prerequisites){
            preMap.get(pre[0]).add(pre[1]);
        }

        for(int i=0;i<numCourses;i++){
            if(!dfs(i)){
                return new int[0];
            }
           
        }

        return output;
    }

    public Boolean dfs(int crs){
        int i=0;
        if(visiting.contains(crs)){
            return false;
        }
        if (visited.contains(crs)) return true;

        visiting.add(crs);
        for(int pre:preMap.get(crs)){
            if(!dfs(pre)){
                return false;
            }
        }

        visiting.remove(crs);
        visited.add(crs);
        output[index++]= crs;
        
        
        return true;

    }
}
