package com.jdc.jpa.conventer;

import java.sql.Date;
import java.time.MonthDay;
import java.time.Year;

import javax.persistence.AttributeConverter;

public class DateToYearConventer implements AttributeConverter<Year, Date>{

	@Override
	public Date convertToDatabaseColumn(Year attribute) {
		if(null != attribute) {
			var result = Date.valueOf(attribute.atMonthDay(MonthDay.of(2, 10)));
		}
		return null;
	}

	@Override
	public Year convertToEntityAttribute(Date dbData) {
		if(null != dbData) {
			var d = dbData.toLocalDate();
			var result = Year.of(d.getYear());
			return result;
		}
		return null;
		
	}

}
