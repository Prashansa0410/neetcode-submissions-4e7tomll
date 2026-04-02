class Twitter {
   
    int count=0;
    Map<Integer,Set<Integer>> followMap;
    Map<Integer,List<int[]>> tweetMap;
    public Twitter() {
        this.followMap = new HashMap<>();
        this.tweetMap = new HashMap<>();
        
    }
    
    public void postTweet(int userId, int tweetId) {
       tweetMap.putIfAbsent(userId,new ArrayList<>());
       tweetMap.get(userId).add(new int[]{count++,tweetId});
    }
    
    public List<Integer> getNewsFeed(int userId) {
        //create a queue that stores timestamp/count along with tweets in maxHeap;
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->(b[0]-a[0]));
        //got all the followees and added his userId as well
        Set<Integer> followees =new HashSet<>( followMap.getOrDefault(userId,new HashSet<>()));
        followees.add(userId);

        //get all the tweets from all the followees
        for(int follow:followees){
            List<int[]> tweets = tweetMap.getOrDefault(follow,new ArrayList<>());
            //get only last 10 tweets
            for(int i=tweets.size()-1;i>=Math.max(0,tweets.size()-10);i--){
                queue.offer(tweets.get(i));
            }
        }

            //return in order
            int count=0;
            List<Integer> rs = new ArrayList<>();
            while(!queue.isEmpty() && count<10){
                rs.add(queue.poll()[1]);
                count++;
            

        }
        return rs;



    }
    
    public void follow(int followerId, int followeeId) {
        if(!followMap.containsKey(followerId)){
            followMap.put(followerId,new HashSet<>());
        }
        followMap.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
            if(followMap.containsKey(followerId)){
                followMap.get(followerId).remove(followeeId);
            }
    }
}
