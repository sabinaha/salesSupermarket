package se.kth.ict.nextgenpos.model;

/**
 * A listener interface for receiving notifications about
 * items added in the product catalog. The class that is interested in such
 * notifications implements this interface, and the object
 * created with that class is registered with
 * <code>addItemObserver</code>. When an item is registered, that
 * object’s <code>newItem</code> method is invoked.
 */
public interface SalesObserver { 
	/**
     * Invoked when a sales item has been added.
     *
     * @param rentedCar The car that was rented.
	 * @throws NonExistingItemIdException 
     */
void newItem(int itemId) throws NonExistingItemIdException;

}