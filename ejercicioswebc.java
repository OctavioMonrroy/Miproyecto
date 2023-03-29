public class Test {

    public static void main(String[] args) {

 int arr[] = new int[]{1,1,2,2,3,3,4,4,5,5}; 
 int n = arr.length; 

 boolean visited[] = new boolean[n]; 

 for (int i = 1; i <= 5; i++) { 
            
 int count = 0;
for (int j = 0; j < n; j++) {
             
if (visited[j] == true)
 continue;

                
if (arr[j] == i) {
visited[j] = true; 
 count++;
                } 
            } 

System.out.print(i + ": " );
for (int k = 0; k < count; k++) { 
System.out.print('*');
            }
            System.out.println();
        }
    }
}