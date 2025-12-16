package arrrays;

public class mitidimensionarr {
  public static void main(String[] args) {
    //Declaring a 2D array
    int [][] arr;

    //Initializing row and column sizes
    arr = new int[1][3];

    //Assigning values
    arr[0][0] =3;
    arr[0][1] = 5;
    arr[0][2] = 7;

    //Displaying values
    System.out.println("arr [0][0] = " + arr[0][0]);
    System.out.println("arr [0][1] = " + arr[0][1]);
    System.out.println("arr [0][2] = " + arr[0][2]);

    String names [][];
    names = new String [2][3];

    names [0][0] = "Evelyne";
    names [0][1] = "Rose";
    names[0][2] = "Elizabeth";
    names[1][0] = "Peter";
    names[1][1] = "James";
    names[1][2]= "Gorgeana";

    System.out.println("arr [0[[0] = "+ names[0][0]);
    System.out.println("arr[0][1] = " +names[0][1]);
    System.out.println("arr [1][2] = " +names[1][2]);

    int arr2 [][] = {{1,2}, {3,4}};
    
    //Printing the Array
    for(int i =0; i<2; i++){
      for(int j =0; j <2; j++)
        System.out.print(arr2[i][j]+ " ");
        System.out.println();
      

    }

    int n =2;
    int m = 2;
    //Array declared and initialized
    int[][] arr3 = new int[n][m];

    int it =1;

    //Assigning the values to array
    for(int i=0; i<n; i++){
      for(int j =0; j<m; j++){
        arr3[i][j] = it;
        it++;
      }
    }
    //Printing the Array
    for(int i = 0; i<n; i++){
      for(int j =0; j<m; j++)
        System.out.print(arr3[i][j] + " ");
      System.out.println();
    }
  }
}
