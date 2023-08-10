
import java.util.*;
 class Test 
 {
 
 		static int values[]={2,2,2,2,2,2,2,2,2};
 		static int winpos[][]={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
 		static int currUser = -1;

 		public static void main(String[] args)
 		{
 			while(true)
 			{
 				play();
 			}
 		}
 		public static void play()
 		{
 		  draw();
 		System.out.println((currUser==-1)?("X is Your Turn"):("O is your turn"));          
 		          Scanner s = new Scanner(System.in);
                 int ch =s.nextInt();
 		          if(values[ch-1]==2)
 		          {
 		          	values [ch-1]=currUser;
 		          	checkWin();
 		          currUser=currUser==0?-1:0;
 		          }
 		          else
 		          	{
 		          		play();
 		          	}
 		        

        }



 		public static void checkWin()
 		{
 			for(int i[]:winpos)
 			{
 				if(values[i[0]]==values[i[1]]&& values[i[0]]==values[i[2]]&& values[i[0]]!=2)
 				{
 					draw();
 					System.out.print(((currUser==0)?"O":"X") +"wins the game");
 					System.exit(0);
 				}
 			}
 		}
 		public static void draw()
 	{
 		int t=1;
 		for(int i=0;i<9;i++)
 		{
 			if(values[i]==-1)
 			{
 				System.out.print("x|");
 			}
 			else if(values[i]==0)
 			{
 				System.out.print("O|");
 			}
 			else
 			{
 				System.out.print(t+"|");
 			}
 			t++;
 			if((i+1)%3==0)
 				System.out.println();
 		}
 	}

 }

 	
 	/*import java.util.*;
 	class Test
 	{
 		 static int values[]={2,2,2,2,2,2,2,2,2};
 		 static int winpos[][]={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
 		 static int currentuser=-1;
 		 {
 		 	public static void main(String[] args)
 		 	{
               Draw();
 		 	}
 		 }

 		public static void Draw()
 		{
 			int t=1;
 			for(int i=0;i<9;i++)
 			{
 				if(values[i]==-1)
 				{
 					System.out.print("X|");
 				}
 				else if(values[i]==0)
 				{
 					System.out.print("O|");
 				}
 				else
 				{
 					System.out.print(t+"");
 				}t++;
 				if((i+1)%3==0)
 		           System.out.println();
 				
 			}
 		} 
 	}*/




