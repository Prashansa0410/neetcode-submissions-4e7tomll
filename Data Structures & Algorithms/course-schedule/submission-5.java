class Solution {

    HashMap<Integer,List<Integer>> edges = new HashMap<>();
    HashSet<Integer> visited = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       for(int i=0;i<numCourses;i++){
        edges.put(i,new ArrayList<>());
       }

       for(int[] pre:prerequisites){
        edges.get(pre[0]).add(pre[1]);
       }

       for(int i=0;i<numCourses;i++){
          if(!dfs(i)){
            return false;
          }
       }
       return true;
    }

    public boolean dfs(int numcourses){
        if(visited.contains(numcourses)){
            return false;
        }

        if(edges.get(numcourses).isEmpty()){
            return true;
        }

        visited.add(numcourses);
        for(int nei:edges.get(numcourses)){
            if(!dfs(nei)){
                return false;
            }
        }

        visited.remove(numcourses);
        edges.put(numcourses,new ArrayList<>());
        return true;
    } 

    


    
        

    
}
