import java.util.*;
class TicTacToe {
    ArrayList<ArrayList<Integer>> row;
    ArrayList<ArrayList<Integer>> col;
    int [][] board;
    int n;
    public TicTacToe(int n) {
        this.n=n;
        board= new int[n][n];
        row= new ArrayList<ArrayList<Integer>>();
        col=new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> l= new ArrayList<>();
            ArrayList<Integer> m= new ArrayList<>();
            l.add(0);
            l.add(0);
            m.add(0);
            m.add(0);
            row.add(l);
            col.add(m);
        }
    }
    public  int checkd1()
    {
        int pos=0,neg=0;
        for(int i=0;i<n;i++)
        {
            if(board[i][i]>0)
            pos++;
            else if(board[i][i]<0)
            neg++;
        }
        if(pos==n)
        return 1;
        else if(neg==n)
        return -1;
        return 0;

    }

       public  int checkd2()
    {
        int pos=0,neg=0;
        for(int i=0;i<n;i++)
        {
            if(board[i][n-i-1]>0)
            pos++;
            else if(board[i][n-i-1]<0)
            neg++;
        }
        if(pos==n)
        return 1;
        else if(neg==n)
        return -1;
        return 0;

    }
    public  int move(int r, int c, boolean me) {
        if(me)
        {
            board[r][c]=1;
            int val=row.get(r).get(0);
            row.get(r).set(0,val+1);
            if((val+1)==n)
            return 1;
             val=col.get(c).get(0);
            col.get(c).set(0,val+1);
            if((val+1)==n)
            return 1;
            
        }       
        else
        {
            board[r][c]=-1;
           int val=row.get(r).get(1);
            row.get(r).set(1,val+1);
            if((val+1)==n)
            return -1;
             val=col.get(c).get(1);
            col.get(c).set(1,val+1);
            if((val+1)==n)
            return -1;
        }
        int d1=checkd1();
            if(d1!=0)
            return d1;
            int d2=checkd2();
            if(d2!=0)
            return d2;
            return 0;
            
    }
    public static void main(String[] args) {
        TicTacToe t= new TicTacToe(2);
        t.move(0,0,false);
        t.move(0,1,true);
        t.move(1,0,false);

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
                System.out.print(t.board[i][j]+" ");
            System.out.println();

        }

                    System.out.println(t.row);
            System.out.println(t.col);
            System.out.println(t.checkd1());
            System.out.println(t.checkd2());

    }
}