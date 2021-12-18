import java.util.*;
class Tic_Tac_Toe
{
    Scanner sc=new Scanner(System.in);
    String play[][]=new String[3][3];
    int corr[][]={{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};
    int row,column;
    int choice=0;
    int p;
    int c;
    public void main()
    {

        row=0;
        column=0;
        c=1;
        System.out.println("PLAYER 1 IS \"*\"");
        System.out.println();
        System.out.println("PLAYER 2 IS \"0\"");
        System.out.println();
        for(int x=0;x<3;x++)
        {
            for(int y=0;y<3;y++)
            {
                play[x][y]=" ";             //initialising play matrix with whitespace
            }
        }
        p=1;        
        System.out.println("PLAYER 1's TURN IS FIRST");
        System.out.println();
        playing_arena();                    //calling the function to start the game

        System.out.println("IT'S A TIE..!");
        System.out.println();

        display();
    }

    public void display()
    {
        System.out.println();
        for(int j=0;j<3;j++)
        {
            for(int k=0;k<3;k++)
            {
                System.out.print("|" + play[j][k]+ "|"+"\t");   
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("-----------------------------------------");
        System.exit(0);
    }

    public void playing_arena()
    {

        while(true)
        {
            System.out.println("PLAYER"+" "+p+" "+"CHOOSE YOUR SLOT(1-9) TO PLACE YOUR MARK");
            System.out.println();
            choice=sc.nextInt();
            System.out.println();
            row=corr[choice-1][0];                  //Picking out the appropriate space for placing the mark
            column=corr[choice-1][1];                   

            if((play[row][column].equals("*")) || (play[row][column].equals("0")))
            {
                System.out.println("OCCUPIED SLOT; TRY AGAIN");             //checking if the selected slot is already occupied
                playing_arena();                                               
            }
            else
            {
                if(p==1)
                    play[row][column]="*";
                if(p==2)                                                    //placing the mark based on the player
                    play[row][column]="0";
            }
            System.out.println();
            System.out.println("-----------------------------------------");
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    System.out.print("|" + play[j][k]+ "|"+"\t");                      //Displaying the state of the game after placing the mark
                }
                System.out.println();
                System.out.println();
            }
            System.out.println("-----------------------------------------");
            if(p==1)
                p=p+1;
            else if(p==2)
                p=p-1;

            if(c>=5)                        //checking for results after 5 turns
            {
                for(int i=0;i<3;i++)
                {
                    if((play[i][0].equals(play[i][1])) && (play[i][1].equals(play[i][2])) && ((play[i][0].equals("*")) || (play[i][0].equals("0"))))   //checking the row for winner
                    {
                        if(play[i][0].equals("*"))
                            System.out.println("PLAYER 1 WINS...!");
                        else if(play[i][0].equals("0"))
                            System.out.println("PLAYER 2 WINS...!");
                        display();
                    }
                    if((play[0][i].equals(play[1][i])) && (play[1][i].equals(play[2][i])) && ((play[0][i].equals("*")) || (play[0][i].equals("0"))))   //checking the column for winner
                    {
                        if(play[0][i].equals("*"))
                            System.out.println("PLAYER 1 WINS...!");
                        else if(play[0][i].equals("0"))
                            System.out.println("PLAYER 2 WINS...!");
                        display();
                    }
                }
                if((play[0][0].equals(play[1][1])) && (play[1][1].equals(play[2][2])) && ((play[0][0].equals("*")) || (play[0][0].equals("0")))) //checking right diagonal for winner
                {
                    if(play[0][0].equals("*"))
                        System.out.println("PLAYER 1 WINS...!");
                    else if(play[0][0].equals("0"))
                        System.out.println("PLAYER 2 WINS...!");
                    display();
                }
                if((play[0][2].equals(play[1][1])) && (play[1][1].equals(play[2][0])) && ((play[0][2].equals("*")) || (play[0][2].equals("0"))))  //checking left diagonal for winners
                {
                    if(play[0][2].equals("*"))
                        System.out.println("PLAYER 1 WINS...!");
                    else if(play[0][2].equals("0"))
                        System.out.println("PLAYER 2 WINS...!");
                    display();
                }
            }
            c=c+1;
            if(c==10)               //endng the game after 10 turns
                break;
        }
    }
}
