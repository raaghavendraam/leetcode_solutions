// Last updated: 04/04/2026, 15:46:08
class MedianFinder {
    PriorityQueue<Integer> max  = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> min = new PriorityQueue<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(max.size()==0) max.add(num);
        else if(max.peek()>num) max.add(num);
        else min.add(num);
        //balancing
        if(max.size()==min.size()+2){
            int temp = max.remove();
            min.add(temp);
        }
        if(min.size()==max.size()+2){
            int temp = min.remove();
            max.add(temp);
        }
    }
    public double findMedian() {
        if(max.size()==min.size()) return (min.peek()+max.peek())/2.0;
        else if(max.size()>min.size()) return max.peek();
        else return min.peek();
    }
}