package util;

public class Exgcd {
    public static int niyuan(int a,int b)  //求550关于模1769的乘法逆元

    // 550*X(mod1769)=1

    // niyuan(1769,550)

    {

        int[] m={1,0,a};

        int[] n={0,1,b};

        int[] temp=new int[3];

        int q=0;  //初始化

        boolean flag=true;

        while(flag)

        {

            q=m[2]/n[2];

            for(int i=0;i<3;i++)

            {

                temp[i]=m[i]-q*n[i];

                m[i]=n[i];

                n[i]=temp[i];

            }

            if(n[2]==1)

            {

                if(n[1]<0)

                {

                    n[1]=n[1]+a;

                }

                return n[1];

            }

            if(n[2]==0)

            {

                flag=false;

            }

        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println("197M1-1==1(mod 311) "+niyuan(311,197));
        System.out.println("311M2-1==1(mod 197) "+niyuan(197,311));
        final int X = 61267;
        System.out.println("X=="+(X%311)+"(mod 311)");
        System.out.println("X=="+(X%197)+"(mod 197)");
        System.out.println(exp_mod(20129, 18943, 61267));//20129 18943 mod 61267
    }
    // m为底数,pow为指数,n为除数
    static long exp_mod(long a, long n, long b)
    {
        long t;
        if(n==0) return 1%b;
        if(n==1) return a%b;
        t=exp_mod(a,n/2,b);
        t=t*t%b;
        if((n&1)==1) t=t*a%b;
        return t;

    }
}
