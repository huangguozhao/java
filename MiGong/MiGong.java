public class MiGong{
	//编写一个main方法
	public static void main(String[]args){
		//思路
		//1.先建立一个二维数组，int【】【】 map = new map[8][7];
		//2.设定map数组的元素值：0表示可走，1表示障碍物
		int[][] map = new int[8][7];
		//3.将上面的数组最上面的一行和最后一行设置为1
		for(int i = 0;i<7;i++)
		{
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//4.设置第一列和最后一列也为1
		for(int i = 1;i<7;i++)
		{
			map[i][0] = 1;
			map[i][6] = 1;
		}
		//5.设置坐标位（2，1）和（2，2）位置的值为1
		map[3][1] = 1;
		map[3][2] = 1;
		//6.运用方法找路
		T find = new T();
		boolean a = find.findWay01(map,1,1);

		//输出目前的地图情况
		for(int i = 0;i<8;i++)
		{
			for(int j = 0;j<7;j++)
			{
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		boolean b = find.findWay01(map,1,1);

		//输出目前的地图情况
		for(int i = 0;i<8;i++)
		{
			for(int j = 0;j<7;j++)
			{
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

	}
}

//创建一个类
class T{
	//创建一个方法用于找路
	public boolean findWay01(int[][] map,int i,int j)
	{
		//如果走到了目标位置就输出true
		if(map[6][5]==2)
		{
			return true;
		}
		else{
			if(map[i][j]==0)
			{
				map[i][j] = 2;
				if(findWay01(map,i+1,j))
				{
					
					return true;
				}
				else if(findWay01(map,i,j+1))
				{
					
					return true;
				}
				else if(findWay01(map,i-1,j))
				{
					
					return true;
				}
				else if(findWay01(map,i,j-1))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			//不能走到目标位置，输出false
			else
			{
				return false;
			}
		}
	}
	public boolean findWay02(int[][] map,int i,int j)
	{
		//如果走到了目标位置就输出true
		if(map[6][5]==2)
		{
			return true;
		}
		else{
			if(map[i][j]==0)
			{
				map[i][j] = 2;
				if(findWay02(map,i-1,j))
				{
					
					return true;
				}
				else if(findWay02(map,i,j+1))
				{
					
					return true;
				}
				else if(findWay02(map,i+1,j))
				{
					
					return true;
				}
				else if(findWay02(map,i,j-1))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			//不能走到目标位置，输出false
			else
			{
				return false;
			}
		}
	}
}