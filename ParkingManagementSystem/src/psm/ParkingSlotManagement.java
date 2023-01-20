package psm;

import java.util.ArrayList;
import java.util.List;

public class ParkingSlotManagement {
	int[] parkSlot = new int[7];

	GenCirQ<Integer> carQueue = new GenCirQ<>(5);

//		public void carIn(int carNo)
//		{
//		 if(parkSlot.)
//		 {
//			 parkSlot.add(carNo);
//		 }
//		 else
//			 if(carQueue.isEmpty()==true)
//			 carQueue.enqueue(carNo);
//			 else
//				 System.out.println("Parking full");	 
//		 
	// }

	private int slotAvail() {
		for (int i = 0; i < parkSlot.length; i++) {
			if (parkSlot[i] == 0)
				return i;
		}
		return -1;
	}

	private int carAvail(int carNo) {
		for (int i = 0; i < parkSlot.length; i++) {
			if (parkSlot[i] == carNo)
				return i;
		}
		return -1;

	}

	public void carIn(int carNo) {
		int slotNo;
		if ((slotNo = slotAvail()) != -1) {
			parkSlot[slotNo] = carNo;
		} else {
			// if (carQueue.isEmpty() == true)
			if (carQueue.enqueue(carNo)) {
			} else
				System.out.println("Parking full");
		}
	}

	public void carOut(int carNo) {
		int slotNo;
		if((slotNo=carAvail(carNo))!=-1)
		{
		  if(!carQueue.isEmpty()) {
			  parkSlot[slotNo]=carQueue.dequeue();
		  }
			  
		}

	}
	
//	public void displayQ() {
//		for(int i=0;i<5;)
//		{
//			System.out.println(carQueue.peek() + " ");
//			
//		}
//	}

}