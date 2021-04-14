package com.mrisk.monitoreo.point.domain;

import java.util.Calendar;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Document {

	private Integer id;
	private String name; 
	private Integer pointId;
	private String alfrescoId;
	private Integer tenaId;
	private Boolean alive = Boolean.TRUE;
	private Calendar creationTime = Calendar.getInstance();
	private Calendar modificationTime;
	private Calendar destructionTime;
}