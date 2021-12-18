import java.util.*;
class Magic_Sq
{
    int r=0;
    int c=1;
    int e=1;
    int n=0;
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an odd number");
        n=sc.nextInt();
        int m[][]=new int[n][n];
        m[r][c]=e;
        e=e+1;

        for(int i=0;i<(n*n-1);i++)
        {
            r=r-1;
            c=c+1;
            if((e-1)%n!=0)
            {
                if(r<0)
                    r=n-1;
                if(c>(n-1))
                    c=0;
            }
            else if((e-1)%n==0)
            {
                r=r+2;
                c=c-1;
            }

            m[r][c]=e;
            e=e+1;
        }
        System.out.println("The"+" "+n+"x"+n+" "+"Magic Square is:");
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
                System.out.print(m[j][k]+"\t ");
            }
            System.out.println();
        }
    }
}
