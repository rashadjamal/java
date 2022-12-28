import java.util.Arrays;   
public  class MatrixAddition{  
public static void main(String args[]){  

int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
   
int c[][]=new int[3][3];  
    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];    
System.out.print(c[i][j]+" ");    
}       

int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  

Arrays.sort(array);   
System.out.println("Elements of array sorted in ascending order: ");  

for (i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}
}
}    