package jp.co.sunselcospace.form;

import java.time.LocalDate;

import jp.co.sunselcospace.util.Convertor;

/**
 * @author 山下 諒
 */
public class BookingForm {
	// @formatter:off
	private Integer id;						// 予約番号
	private Integer roomId; 				// 施設管理番号
	private LocalDate bookingDate;			// 予約日
	private String purpose;					// 利用目的
	private String name;					// 施設名
	private String location;				// 場所
	private Integer fee;					// 料金
	// @formatter:on

	// @formatter:off
	/**
	 * @author 山下 諒
	 */
	public BookingForm(Integer id
								, Integer roomId
								, LocalDate bookingDate
								, String purpose
								, String name
								, String location
								, Integer fee) {
	// @formatter:on
		this.id = id;
		this.roomId = roomId;
		this.bookingDate = bookingDate;
		this.purpose = purpose;
		this.name = name;
		this.location = location;
		this.fee = fee;
	}

	// @formatter:off
	/**
	 * @author 山下 諒
	 */
	public BookingForm(String id
								, String bookingDate
								, String purpose
								, String name
								, String location
								, String fee) {
		this(Integer.parseInt(id)
			, null
			, Convertor.toLocalDate(bookingDate)
			, purpose
			, name
			, location
			, Integer.parseInt(fee));
	}
	// @formatter:on

	/**
	 * @author 山下 諒
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @author 山下 諒
	 */
	public Integer getRoomId() {
		return roomId;
	}

	/**
	 * @author 山下 諒
	 */
	public LocalDate getBookingDate() {
		return bookingDate;
	}

	/**
	 * @author 山下 諒
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * @author 山下 諒
	 */
	public String getName() {
		return name;
	}

	/**
	 * @author 山下 諒
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @author 山下 諒
	 */
	public Integer getFee() {
		return fee;
	}
}
