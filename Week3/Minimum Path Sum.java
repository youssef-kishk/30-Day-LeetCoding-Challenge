class Solution {
    public int minPathSum(int[][] grid) {
        int width = grid[0].length;
        int height = grid.length;
    	//y*width+x
        HashMap <Integer,Integer>min = new HashMap();
        int count=0;
        min.put(count, grid[0][0]);
        count++;
        for(int y=0;y<height;y++){
        	for(int x=0;x<width;x++){
        		if(y==0&&x==0)
        			continue;
        		switch(y){
                    case 0:
                        min.put(count, grid[y][x]+min.get(y*width+(x-1)));
                        count++;
                        continue;
        		}
        		switch(x){
                    case 0:
                        min.put(count, grid[y][x]+min.get((y-1)*width+x));
                        count++;
                        continue;
        		}
        		min.put(count, 
        				min.get((y-1)*width+x)<min.get(y*width+(x-1))?
        							grid[y][x]+min.get((y-1)*width+x):
        								grid[y][x]+min.get(y*width+(x-1)));
        		count++;
        	}
        }
        return min.get(min.size()-1);
         
    }
}
