class Solution {
    HashSet<Integer> visited = new HashSet<>();
    HashMap<Integer,List<Integer>> map = new HashMap<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++){
            map.put(i,new ArrayList<>());
        }

        for(int[] pre:prerequisites){
           map.get(pre[0]).add(pre[1]);
        }

        for(int i=0;i<numCourses;i++){
            if(!dfs(i)){
                return false;
            }
        }
       return true; 
    }

    public boolean dfs(int course){
        if(visited.contains(course)){
            return false;
        }
        if(map.get(course).isEmpty()){
            return true;
        }
        visited.add(course);
        for(int neig:map.get(course)){
            if(!dfs(neig)){
                return false;
            }
        }
        visited.remove(course);
        map.put(course,new ArrayList<>());
        return true;
    }
}
