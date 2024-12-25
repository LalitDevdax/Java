import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row,col;
        System.out.print("Enter Row Of Matrix : ");
        row=sc.nextInt();
        System.out.print("Enter Column Of Matrix : ");
        col=sc.nextInt();
        int matrix[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter The element "+i+j+" : ");
                matrix[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("The Matrix is below : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        int finding;
        System.out.print("Enter the number you want to find : ");
        finding=sc.nextInt();
        sc.close();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==finding){
                    System.out.print("The element "+finding+" Found at position "+i+j);
                }
            }
            System.out.println();
        }
        
    }
}
