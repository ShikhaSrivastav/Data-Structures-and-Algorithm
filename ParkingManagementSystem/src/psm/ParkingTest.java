package psm;

import java.util.Arrays;
import java.util.Scanner;

public class ParkingTest {

	public static void main(String[] args) {
		
		ParkingSlotManagement psm = new ParkingSlotManagement();
			
			//i20,i30,i50,o30,i78,i34,i90,i234,i345,i123,o20,o78,i987,i231,o234,i456
			
			psm.carIn(20);
			psm.carIn(30);
			psm.carIn(50);
			System.out.println(Arrays.toString(psm.parkSlot));
			psm.carOut(30);
			psm.carIn(78);
			psm.carIn(34);
			psm.carIn(90);
			psm.carIn(234);
			psm.carIn(345);
		//	System.out.println(A  psm.carQueue.display());
		 
			psm.carIn(123);
			psm.carOut(20);
			psm.carOut(78);
			psm.carIn(987);
			psm.carIn(231);
			psm.carOut(234);
			psm.carIn(456);
			

	}

}
