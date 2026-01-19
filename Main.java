/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main{
    public static Integer ex1(Queue<Integer>q){
        int max=0;
        int a=0;
        while(!q.isEmpty()){
            a=q.head();
            q.remove();
            if(a==0){
                //System.out.print(q);
                return (max);
            }
            if(a>q.head()){
                if(a>max){
                    max=a;
                }
                q.remove();
            }
            if(q.head()>max){
                max=q.head();
            }
                q.remove();
        }
    return (max);
    }
    public static void main(String[] args) {
    Queue<Integer> q=new Queue<>();
    int a=5;
    q.insert(10);
    q.insert(12);
    q.insert(7);
    q.insert(10);
    q.insert(0);
    q.insert(-5);
    q.insert(8);
    q.insert(2);
    q.insert(0);
    System.out.print(ex1(q));
    System.out.print(q);
    
    }
}
 