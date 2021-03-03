package core_java_assesment_1;

import java.util.ArrayList;

public class EggOrder {
	private ArrayList<Egg> eggOrder = new ArrayList<>();
	private int order;
	private int totalStock;
	private int orderTotal;
	private int aux_order;

	public EggOrder(int order) {
		super();
		this.order = order;
		this.aux_order = order;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public ArrayList<Egg> getEggOrder() {
		return eggOrder;
	}

	public void setEggOrder(ArrayList<Egg> eggOrder) {
		this.eggOrder = eggOrder;
	}

	public void addEgg(Egg egg) {
		this.eggOrder.add(egg);
	}

	private void getTotalStock() {
		eggOrder.forEach(order -> {
			totalStock += order.stock;
		});
	}

	public void dipatchOrder() {
		getTotalStock();
		if (orderIsGreaterOrEqualsTotalStock()) {
			order = order - 1;
		}

		eggOrder.forEach(eggClass -> {
			// Reduce the order balance with the class' stock
			System.out.print(eggClass.getStock() + " ");

			if (order == 0) {
				System.out.print(order);
				System.out.println(" 0");
			} else {
				// If the stock reduction results in a negative number set stock to 0.
				if (eggClass.getStock() - order <= 0) {
					int substraction;
					// Check if we are on the last iteration
					if (eggOrder.indexOf(eggClass) == eggOrder.size() - 1) {

						substraction = (eggClass.getStock() - order) + (order - 1);
						orderTotal = orderTotal + substraction;

						System.out.print((eggClass.getStock() - (order)) + (order - 1) + " ");
						setOrder(order - eggClass.getStock());
						// FIX THIS
						eggClass.setStock((eggClass.getStock() - substraction));
					} else {

						substraction = (eggClass.getStock() - order) + (order);
						orderTotal = orderTotal + substraction;

						System.out.print((eggClass.getStock() - order) + order + " ");
						setOrder(order - eggClass.getStock());
						eggClass.setStock((eggClass.getStock() - substraction));
					}

					System.out.print(eggClass.getStock());
				} else {

					System.out.print(eggClass.getStock() - order + " ");
					
					eggClass.setStock(eggClass.getStock() - order);
					orderTotal = orderTotal + order;
					setOrder(order - eggClass.getStock());
					System.out.print(eggClass.getStock());
				}


				System.out.println();
			}
		});
		// The whole order was full filled
		if (aux_order == orderTotal) {
			System.out.println("You order of " + orderTotal + " eggs is acepted");
		} else {
			System.out.println("Sorry we can only supply " + orderTotal + " eggs.");
		}

	}

	private boolean orderIsGreaterOrEqualsTotalStock() {
		return totalStock <= order;
	}

	public static class Egg {
		private int stock;

		public Egg(int stock) {
			super();
			this.stock = stock;
		}

		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
			this.stock = stock;
		}

	}

}
