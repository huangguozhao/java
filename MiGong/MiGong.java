public class MiGong{
	//��дһ��main����
	public static void main(String[]args){
		//˼·
		//1.�Ƚ���һ����ά���飬int�������� map = new map[8][7];
		//2.�趨map�����Ԫ��ֵ��0��ʾ���ߣ�1��ʾ�ϰ���
		int[][] map = new int[8][7];
		//3.������������������һ�к����һ������Ϊ1
		for(int i = 0;i<7;i++)
		{
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//4.���õ�һ�к����һ��ҲΪ1
		for(int i = 1;i<7;i++)
		{
			map[i][0] = 1;
			map[i][6] = 1;
		}
		//5.��������λ��2��1���ͣ�2��2��λ�õ�ֵΪ1
		map[3][1] = 1;
		map[3][2] = 1;
		//6.���÷�����·
		T find = new T();
		boolean a = find.findWay01(map,1,1);

		//���Ŀǰ�ĵ�ͼ���
		for(int i = 0;i<8;i++)
		{
			for(int j = 0;j<7;j++)
			{
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		boolean b = find.findWay01(map,1,1);

		//���Ŀǰ�ĵ�ͼ���
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

//����һ����
class T{
	//����һ������������·
	public boolean findWay01(int[][] map,int i,int j)
	{
		//����ߵ���Ŀ��λ�þ����true
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
			//�����ߵ�Ŀ��λ�ã����false
			else
			{
				return false;
			}
		}
	}
	public boolean findWay02(int[][] map,int i,int j)
	{
		//����ߵ���Ŀ��λ�þ����true
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
			//�����ߵ�Ŀ��λ�ã����false
			else
			{
				return false;
			}
		}
	}
}