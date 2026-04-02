class Solution {

    HashMap<Integer,List<Integer>> edges = new HashMap<>(); //to maintain the adjcency list - that is nodes to list of edges
    Set<Integer> visited = new HashSet<>(); //this is to check for cycle detection
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++){
            edges.put(i,new ArrayList<>());
        }

        for(int[] pre :prerequisites){
            edges.get(pre[0]).add(pre[1]);
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

        if(edges.get(course).isEmpty()){
            return true;
        }

        visited.add(course);
        for(int nei:edges.get(course)){
            if(!dfs(nei)){
                return false;
            }
        }
        //backtracking
        visited.remove(course);
        edges.put(course,new ArrayList<>());
        return true;

    }


    
        

    
}
