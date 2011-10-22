/**
 * 
 */
package info.codeprimate.Modulation;

import java.util.Date;

import android.R.bool;

/**
 * @author codeprimate
 * 
 */
public class Xtn {

	public Xtn(Date post_date, int check, String description, double debit,
			double credit, double status, double balance, States state,
			String category, String notes) {
		super();
		this.post_date = post_date;
		this.check = check;
		this.description = description;
		this.debit = debit;
		this.credit = credit;
		this.status = status;
		this.balance = balance;
		this.state = state;
		this.category = category;
		this.notes = notes;
		this.modified = new Date();
	}

	private Date post_date;
	private int check;
	private String description;
	private double debit;
	private double credit;
	private double status;
	private double balance;
	private States state;
	private String category;
	private String notes;
	private XtnEntity payee;
	private String _id;

	@SuppressWarnings("unused")
	private Date modified;

	public enum States {
		Final, Normal, Tentative, Duplicate, Invalid, Deleted
	}

	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * @param notes
	 *            the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the post_date
	 */
	public Date getPostDate() {
		return post_date;
	}

	/**
	 * @param post_date
	 *            the post_date to set
	 */

	public void setPostDate(Date post_date) {
		this.post_date = post_date;
	}

	/**
	 * @return the state
	 */
	public States getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(States state) {
		this.state = state;
	}

	/**
	 * @return the check
	 */
	public int getCheck() {
		return check;
	}

	/**
	 * @param check
	 *            the check to set
	 */
	public void setCheck(int check) {
		this.check = check;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the debit
	 */
	public double getDebit() {
		return debit;
	}

	/**
	 * @param debit
	 *            the debit to set
	 */
	public void setDebit(double debit) {
		this.debit = debit;
	}

	/**
	 * @return the credit
	 */
	public double getCredit() {
		return credit;
	}

	/**
	 * @param credit
	 *            the credit to set
	 */
	public void setCredit(double credit) {
		this.credit = credit;
	}

	/**
	 * @return the status
	 */
	public double getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(double status) {
		this.status = status;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Determine effective equality
	// TODO: implement equals()
	public Boolean equals(Xtn xtn) {
		return (xtn.debit == debit && xtn.credit == credit
				&& xtn.check == check && xtn.post_date == post_date);
	}
}
