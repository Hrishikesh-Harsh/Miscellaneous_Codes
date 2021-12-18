import java.util.*;
class Mult_Matrix
{
    int a[][];
    int b[][];
    int p[][];
    int t[];
    int r1,c1,r2,c2;
    int c=0;
    int e=0;
    Scanner sc=new Scanner(System.in);
    
    void main()
    {
        System.out.println("Enter no. of rows and columns for 1st matrix\n");
        r1=sc.nextInt();
        c1=sc.nextInt();
        
        System.out.println("Enter no. of rows and columns for 2nd matrix\n");
        r2=sc.nextInt();
        c2=sc.nextInt();
        
        if(c1==r2)                  //checking compatibilty of two matrices for multiplication
        {
            System.out.println("Multiplication Compatible\n");
        }
        else
        {
            System.out.println("Not compatible for multiplication");
            System.exit(0);
        }
        
        a=new int[r1][c1];
        b=new int[r2][c2];
        
        p=new int[r1][c2];
        t=new int[r1*c2];
        
        System.out.println("Enter elements for 1st matrix\n");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("--------------------------------");
        System.out.println("Enter elements for 2nd matrix\n");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("--------------------------------");
        System.out.println("The 1st matrix\n");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println("--------------------------------");
        System.out.println("The 2nd matrix\n");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
        for(int x=0;x<r1;x++)
        {
            for(int y=0;y<c2;y++)
            {
               for(int z=0;z<r2;z++)
               {
                   e=e+(a[x][z]*b[z][y]);                   //calculating every element of the product matrix
                }
                t[c]=e;
                c=c+1;
                e=0;
            }
        }
        c=0;
        
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                p[i][j]=t[c];c=c+1;                         //putting all the elements in the product matrix
            }
            System.out.println();
        }
        
        System.out.println("The product matrix\n");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(p[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");
    }
}
