package jp.co.sunselcospace.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 予約テーブル用のEntity
 * @author 山下 諒
 */
public class BookingEntity {
	private Integer id;
	private Integer roomId;
	private String accountId;
	private LocalDate bookingDate;
	private String purpose;
	private String deleted;
	private LocalDateTime recordCreationTimestamp;
	private LocalDateTime recordUpdateTimestamp;

	/**
	 * @author 山下 諒
	 * @param id
	 * @param roomId
	 * @param accountId
	 * @param bookingDate
	 * @param purpose
	 * @param deleted
	 * @param recordCreationTimestamp
	 * @param recordUpdateTimestamp
	 */
	// @formatter:off
	public BookingEntity(Integer id
								 , Integer roomId
								 , String accountId
								 , LocalDate bookingDate
								 , String purpose
								 , String deleted
								 , LocalDateTime recordCreationTimestamp
								 , LocalDateTime recordUpdateTimestamp) {
		// @formatter:on
		this.id = id;
		this.roomId = roomId;
		this.accountId = accountId;
		this.bookingDate = bookingDate;
		this.purpose = purpose;
		this.deleted = deleted;
		this.recordCreationTimestamp = recordCreationTimestamp;
		this.recordUpdateTimestamp = recordUpdateTimestamp;
	}

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
	public String getAccountId() {
		return accountId;
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
	public String getDeleted() {
		return deleted;
	}

	/**
	 * @author 山下 諒
	 */
	public LocalDateTime getRecordCreationTimestamp() {
		return recordCreationTimestamp;
	}

	/**
	 * @author 山下 諒
	 */
	public LocalDateTime getRecordUpdateTimestamp() {
		return recordUpdateTimestamp;
	}

	/**
	 * @author 山下 諒
	 */
	@Override
	public String toString() {
		return "BookingEntity [id=" + id + ", roomId=" + roomId + ", accountId=" + accountId + ", bookingDate="
				+ bookingDate + ", purpose=" + purpose + ", deleted=" + deleted + ", recordCreationTimestamp="
				+ recordCreationTimestamp + ", recordUpdateTimestamp=" + recordUpdateTimestamp + "]";
	}
}
