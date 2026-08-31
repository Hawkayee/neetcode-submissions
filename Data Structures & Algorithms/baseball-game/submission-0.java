class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();
        for(int i =0; i<operations.length;i++){
            if(operations[i].equals("+") && !stack.isEmpty()){
                int first = stack.get(stack.size() -1);
                int second = stack.get(stack.size() -2);
                stack.push((first + second));
            }
            else if(operations[i].equals("C")) stack.pop();
            else if(operations[i].equals("D")&& !stack.isEmpty()){
                int last = stack.peek();
                stack.push(last * 2);
            }

            else
               stack.push(Integer.parseInt(operations[i]));
        }
        int sum = 0;
        while(!stack.isEmpty())
          sum += stack.pop();
        return sum;
    }
}