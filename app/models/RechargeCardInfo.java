package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import com.google.gson.annotations.Expose;
import play.data.format.Formats;
import play.db.ebean.Model;

@Entity
@Table(name = "rechargeCardInfo")
public class RechargeCardInfo extends Model implements Serializable {
	@Id
	@Expose
	public Long id;
	   
	@Expose
	public Long bsUserId;
	
	@Expose
	@Column(columnDefinition = "integer(10)")
	public int pointToMoney;
	
	@Column(length = 20)
	@Size(max = 20)
	@Expose
	public String advertisement;
	
	@Column(length = 20)
	@Size(max = 20)
	@Expose
	public String promulgator;
	
	@Expose
	@Column(columnDefinition = "integer(2)")
	public int channelRate;
	
	@Column(length = 50)
	@Size(max = 50)
	@Expose
	public String image;
	
	@Expose
	@Column(columnDefinition = "integer(1)")
	public int displayImage;
	
	@Expose
	public Long billingTypeID;
	
	@Expose
	@Column(columnDefinition = "integer(1)")
	public int displayBilling;
	
	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(columnDefinition = "timestamp NULL")
	@Expose
	public Date cardUpdateDate;
	
	@Expose
	@Column(columnDefinition = "integer(1)")
	public int deleteStatus;
	
	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(columnDefinition = "timestamp NULL")
	@Expose
	public Date createDate;
	
	@Formats.DateTime(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(columnDefinition = "timestamp NULL")
	@Expose
	public Date updateDate;
	
	@Expose
	public Long createPerson;
	
	@Expose
	public Long updatePerson;
	
}
