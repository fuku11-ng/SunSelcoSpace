package jp.co.sunselcospace.form;

import java.time.LocalDate;

import jp.co.sunselcospace.util.Convertor;

/**
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
	 */
	public Integer getId() {
		return id;
	}

	/**
	 */
	public Integer getRoomId() {
		return roomId;
	}

	/**
	 */
	public LocalDate getBookingDate() {
		return bookingDate;
	}

	/**
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 */
	public String getName() {
		return name;
	}

	/**
	 */
	public String getLocation() {
		return location;
	}

	/**
	 */
	public Integer getFee() {
		return fee;
	}
}
