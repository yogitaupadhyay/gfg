public static void DFS1(int s,boolean visited[]){
		visited[s]=true;
		System.out.print(s+"  ");
		Iterator<Integer> it=glist[s].listIterator();
			while(it.hasNext()){
				int k=it.next();
				if(visited[k]!=true){
					DFS1(k,visited);
				}
			}
		}
	 public static void DFS2(int s){
		 boolean visited[]=new boolean[v];
		 DFS1(s,visited);
	 }
	 }