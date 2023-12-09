//https://www.geeksforgeeks.org/problems/implement-stack-using-array/1

class ImplementStackUsingArray_Day5 
{
    public static void main(String[] args) {
        int [] stack = new int[1000];
        int top;

        ImplementStackUsingArray_Day5()
        {
            top=-1;
        }

        void push(int a)
        {
            top++;
            stack[top] = a;
        }

        int pop ()
        {
            if (top == -1) return -1;
            return stack[top--];
        }        
    }
}
