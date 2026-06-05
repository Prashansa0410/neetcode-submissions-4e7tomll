class Solution {
    HashMap<Integer,List<Integer>> edges = new HashMap<>();
    HashSet<Integer> visiting = new HashSet<>();
    HashSet<Integer> visited = new HashSet<>();
    int[] output ;
    int index=0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        output = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            edges.put(i,new ArrayList<>());
        }

        for(int[] pre:prerequisites){
            edges.get(pre[0]).add(pre[1]);
        }

        for(int i=0;i<numCourses;i++){
            if(!(dfs(i))){
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
        for(int pre:edges.get(course)){
            if(!dfs(pre)){
                return false;
            }
        }

        visited.add(course);
        visiting.remove(course);
        output[index++]=course;
        return true;
    }
}
