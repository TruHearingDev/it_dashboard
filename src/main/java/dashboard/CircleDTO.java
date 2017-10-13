package dashboard;

import java.sql.Date;
import java.text.DateFormat;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class CircleDTO {
	private String vcsUrl;
	private String buildUrl;
	private String buildNum;
	private String branch;
	private String vcs_revision;
	private String committer_name;
	private String committer_email;
	private String subject;
	private String body;
	private String why;
	private String dont_build;
	private Date queued_at;
	private Date start_time;
	private Date stop_time;
	private Integer build_time_millis;
	private String username;
	private String reponame;
	private String lifecycle;
	private String outcome;
	private String status;
	private String retry_of;
	
}
