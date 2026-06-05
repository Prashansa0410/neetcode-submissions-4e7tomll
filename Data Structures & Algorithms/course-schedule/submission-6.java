class Solution {
       //Create adjacency list (course and prerequisties)
        HashMap<Integer,List<Integer>> edges = new HashMap<>();
        //Visited set
        HashSet<Integer> visited = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++){
            edges.put(i,new ArrayList<>());
        }

        for(int[] prereq:prerequisites){
            edges.get(prereq[0]).add(prereq[1]);
        }

        //run dfs on all courses
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

        for(int pre:edges.get(course)){
            if(!dfs(pre)){
                return false;
            }
        }

        visited.remove(course);
        edges.put(course,new ArrayList<>());
        return true;

    }
}
