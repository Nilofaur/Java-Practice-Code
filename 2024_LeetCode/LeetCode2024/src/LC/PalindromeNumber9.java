package LC;

public class PalindromeNumber9 {

    public boolean isPalindrome(int x) {
int temp=x;
int rem= 0;
int[] r = new int[50];
int[] Int = new int[50];

for (int j=0;j<20;j++)
{
Int[j]= temp/10;
temp=temp/10;
}
while (temp!=0)
{
    rem = temp % 10;
for(int i = 0; i<20;i++)
{
    r[i]=rem; 
}
    temp = temp/10;

    
}
 
        return true;
    }

}