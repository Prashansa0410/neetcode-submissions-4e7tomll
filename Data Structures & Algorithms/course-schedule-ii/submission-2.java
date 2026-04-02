class Solution {
    HashMap<Integer,List<Integer>> map = new HashMap<>();
    Set<Integer> visited = new HashSet<>();
    Set<Integer> visiting = new HashSet<>();
    int index=0;
    int[] output;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        output = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            map.put(i,new ArrayList<>());
        }
        for(int[] pre:prerequisites){
            map.get(pre[0]).add(pre[1]);
        }

        for(int i=0;i<numCourses;i++){
            if(!dfs(i)){
                return new int[0];
            }
        }
        return output;       
    }

    public boolean dfs(int course){
        if(visiting.contains(course)){
            return false;
        }
        if(visited.contains(course)){
            return true;
        }
        visiting.add(course);

        for(int nei:map.get(course)){
            if(!dfs(nei)){
                return false;
            }
        }

        visiting.remove(course);
        visited.add(course);
        output[index++]=course;
        return true;

        
    }

   
}
