package hrWarmUp;

public class JumpingonClouds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JumpingonClouds j = new JumpingonClouds();
		System.out.println(j.getJumpCount(new int[] {0,0,1,0,0,1,0}));
		//System.out.println(j.getJumpCount(new int[] {1,0,1,0,0,1,0}));
		System.out.println(j.getJumpCount(new int[] {0,0,0,0,1,0}));
		System.out.println(j.getJumpCount(new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0}));
	}

	private int getJumpCount(int[] cloud) {
		// TODO Auto-generated method stub
		int jumpCount = 0;
		if(cloud.length==0) {
			return 0;
		}
		if (cloud[0]==1) {
			throw new IllegalArgumentException("Cloud Start With 0");
		}
		for(int i=0; i<cloud.length;i++) {		
			if((i+2)<cloud.length && cloud[i+2]==0 && cloud[i+2] != 1)
			{
				  i = i+1;
				  jumpCount++;
			}
			else
			if((i+1)<cloud.length && cloud[i+1]==0&&cloud[i+1]!=1)
			{
				  jumpCount++;
			}
		}
		return jumpCount;
	}

}
