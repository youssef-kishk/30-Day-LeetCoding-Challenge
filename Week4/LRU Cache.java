class LRUCache {
		class Node {
			int key, value;
			Node next, previous;
			public Node(int key, int value) {
				this.key = key;
				this.value = value;
			}
		}
		
		HashMap<Integer, Node> map;
		int capacity;
		Node head, tail;
	    public LRUCache(int capacity) {
	    	map = new HashMap<>();
			this.capacity = capacity;
			head = null;
			tail = null;
	    }
	    
	    public int get(int key) {
	    	if(!map.containsKey(key))
	    		return -1;
	    	Node node = map.get(key);
	    	if(node != tail) {
	    		if (node == head)
					head = head.next;
	    		else {
	    			node.previous.next = node.next;
					node.next.previous = node.previous;
	    		}
	    		tail.next = node;
				node.previous = tail;
				node.next = null;
				tail = node;
	    	}
	    	
	    	return node.value;
	    }
	    
	    public void put(int key, int value) {
	    	Node node = map.get(key);
	    	if (node == null) {
	    		Node newNode = new Node(key, value);
				if (capacity == 0) {
					Node temp = head;
					head = head.next;
					map.remove(temp.key);
					capacity++;
				}
				if (head == null && tail == null)
					head = newNode; 
				else {
					tail.next = newNode;
					newNode.previous = tail;
					newNode.next = null;
				}
				tail = newNode;
				map.put(key, newNode);
				capacity--;
			}
	    	else {
	    		node.value = value;
				if (node != tail) {
					if (node == head)
						head = head.next;
					else {
						node.previous.next = node.next;
						node.next.previous = node.previous;
					}
					tail.next = node;
					node.previous = tail;
					node.next = null;
					tail = node;
				}
	    	}
	    }
	}
