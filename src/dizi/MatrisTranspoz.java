package dizi;

public class MatrisTranspoz {

	public static void main(String[] args) {
		
		int[][] matris = {{2, 3, 4}, {5, 6, 4}};
		
		System.out.println("Matris:");
        for(int i=0; i<matris.length; i++) {
            for(int j=0; j<matris[i].length; j++) {
                System.out.print(matris[i][j] + "  ");
            }
            System.out.println();

	}
        
        int[][] matrisTranspoz = new int[matris[0].length][matris.length];
        
        for(int i=0; i<matris.length; i++) {
            for(int j=0; j<matris[i].length; j++) {
                matrisTranspoz[j][i] = matris[i][j];
            }
        }
        
        System.out.println("Transpoz Matris:");
        for(int i=0; i<matrisTranspoz.length; i++) {
            for(int j=0; j<matrisTranspoz[i].length; j++) {
                System.out.print(matrisTranspoz[i][j] + "  ");
            }
            System.out.println();
        }
}
}